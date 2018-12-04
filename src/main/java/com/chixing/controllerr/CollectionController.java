package com.chixing.controllerr;

import com.chixing.entity.Collection;
import com.chixing.entity.Company;
import com.chixing.entity.CompanyCollection;
import com.chixing.service.CompanyCollectionService;
import com.chixing.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/* 所有收藏的前端请求集中来这 */
@Controller
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    private CompanyCollectionService companyCollectionService;
    @Autowired
    private CompanyService companyService;

/*---- 公司详情页加载时显示页面该公司是否收藏过-------------------------------------*/
    @RequestMapping("checkIsCollectionCompany")
    @ResponseBody
    public Integer checkIsCollectionCompany(Integer clientId,Integer companyId){

        System.out.println("加载公司详情页时接受到的客户id和公司id:" + clientId + "," + companyId);

        CompanyCollection companyCollection = companyCollectionService.queryIsCollection(clientId,companyId);

        if(companyCollection==null){
            return -1;  //说明该用户未收藏过该公司
        }else{
            if(companyCollection.getCompanyCollectionStatus()==0){
                return 0;   //说明该用户未收藏过该公司,只不过改变过收藏状态
            }else{
                return 1;   //说明该用户未收藏过该公司
            }
        }

    }

/*---- 点击收藏 触发的事件 -------------------------------------*/
    @RequestMapping("getCompanyCollection")
    @ResponseBody
    public Integer getCompanyCollection(CompanyCollection companyCollection){

        System.out.println("接受到的客户id:" +companyCollection.getClientId());
        System.out.println("接受到的公司id:" +companyCollection.getCompanyId());
        Integer clientId = companyCollection.getClientId();
        Integer companyId = companyCollection.getCompanyId();

        CompanyCollection companyCollection1 = companyCollectionService.queryIsCollection(clientId,companyId);
        System.out.println("get companyCollection1=" +companyCollection1);

        if(companyCollection1==null){
            companyCollection.setCompanyCollectionStatus(1);
            System.out.println("需要insert的公司收藏:" +companyCollection);
            companyCollectionService.save(companyCollection);
            return 0;
        }else{
            if(companyCollection1.getCompanyCollectionStatus()==0){
                companyCollection.setCompanyCollectionId(companyCollection1.getCompanyCollectionId());
                companyCollection.setCompanyCollectionStatus(1);
                System.out.println("需要update为1的收藏:" +companyCollection);
                companyCollectionService.update(companyCollection);
                return 1;
            }else{
                companyCollection.setCompanyCollectionId(companyCollection1.getCompanyCollectionId());
                companyCollection.setCompanyCollectionStatus(0);
                System.out.println("需要update为0的收藏:" +companyCollection);
                companyCollectionService.update(companyCollection);
                return 2;
            }
        }
    }


/*---- 个人中心页面加载时获取收藏过的公司数目--------------------*/
    @RequestMapping("getCollectionCompanyNum")
    @ResponseBody
    public Integer getCollectionCompanyNum(Integer clientId){
        System.out.println("个人中心页面加载时接收的用户id:" +clientId);
        Integer counts = companyCollectionService.queryCollectionCounts(clientId);
        System.out.println("counts=" +counts);

        if(counts==null){
            return -1;
        }else{
            return counts;
        }
    }


/*---- 点击装修公司时,根据客户id查询公司信息 -------------------------------------*/
    @RequestMapping("getCompanyByClientId")
    @ResponseBody
    public Integer getCompanyByClientId(Integer clientId, HttpSession session) {
        System.out.println("从页面接收的客户id为:" + clientId);
        Integer counts = companyCollectionService.queryCollectionCounts(clientId);
        System.out.println("查询的数量为:" + counts);

        if (counts == 0) {
            return 0;
        }else{
            List<CompanyCollection> companyCollectionList = companyCollectionService.queryCompanyCollection(clientId);
            List<Company> companyList = null;
            for (CompanyCollection companyCollection : companyCollectionList) {
                companyList = companyService.queryCompanyByClientId(companyCollection.getClientId());
                System.out.println(companyList);

                session.setAttribute("companyList", companyList);
                System.out.println("已经跳转过了");
            }
            return 1;
        }
    }




/*---- 点击删除时,*/
    @RequestMapping("deleteCollection")
    @ResponseBody
    public Integer deleteCollection(Integer clientId, Integer companyId,HttpSession session){
        System.out.println("clientId=" +clientId);
        System.out.println("companyId="+companyId);

        CompanyCollection companyCollection = companyCollectionService.queryIsCollection(clientId,companyId);

        companyCollection.setCompanyCollectionStatus(0);
        Integer rows = companyCollectionService.update(companyCollection);
        System.out.println("==============================" +rows);

        List<CompanyCollection> companyCollectionList = companyCollectionService.queryCompanyCollection(clientId);
        List<Company> companyList = null;
        for (CompanyCollection c : companyCollectionList) {
            companyList = companyService.queryCompanyByClientId(c.getClientId());
            System.out.println(companyList);

            session.setAttribute("companyList", companyList);
        }

        Integer counts = companyCollectionService.queryCollectionCounts(companyCollection.getClientId());

        if(counts==0){
            return 1;  //无收藏公司
        }else{
            return 2;
        }

    }




}
