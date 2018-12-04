package com.chixing.controllerr;

import com.chixing.entity.Raiders;
import com.chixing.service.RaidersService;
import com.chixing.util.RaidersPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/raiders")
public class RaidersController {

    @Autowired
    private RaidersService raidersService ;

    @RequestMapping("raidersAll")
    @ResponseBody
    public RaidersPageModel<Raiders> getRaidersAll(Integer pageCode, HttpSession session){
        RaidersPageModel<Raiders> page =  new RaidersPageModel<Raiders>();
        System.out.println("pageCode=" + pageCode);
        if(pageCode == null){//首页
            page.setCurrentPageCode(1);
        }else{
            page.setCurrentPageCode(pageCode);
        }
        //设置总的记录数
        page.setTotalRecord(this.raidersService.queryRaidersAllCounts());
        //设置总的页数
        page.setTotalPages(page.getTotalRecord()%page.getPageSize() ==0?page.getTotalRecord()/page.getPageSize() :page.getTotalRecord()/page.getPageSize() +1);
        //设置开始页数
        page.setStartRecord((page.getCurrentPageCode()-1) * page.getPageSize());
        page =  this.raidersService.queryRaidersAllByPage(page);
        System.out.println("==========="+page);

        return page;
    }



    @GetMapping("raidersAll/page/{page}")
    @ResponseBody
    public RaidersPageModel<Raiders> pageByPage2(@PathVariable Integer page,HttpSession session){
        System.out.println("=========getPage=======" + page);
        return getRaidersAll(page,session);
    }



    @GetMapping("raidersEight")
    @ResponseBody
    public List<Raiders> getEightRaiders(){
        List<Raiders> raidersList = raidersService.queryEightRaiders();
            System.out.println("得到的前8个攻略为:" +raidersList);
        return raidersList;
    }


    @RequestMapping("raidersInfo")
    public ModelAndView raidersInfo(Integer raidersId){
        System.out.println("接收到的攻略id为:" +raidersId);

        Raiders raiders1 = raidersService.queryRaidersById(raidersId);
        System.out.println("点击过后通过接收到的id查询的攻略为:" +raiders1);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("raiders1",raiders1);

        modelAndView.setViewName("raiders/raidersDetail");
        return modelAndView;
    }


    //点赞数目
    @RequestMapping("updateRaidersByPraise")
    @ResponseBody
    public Integer updateRaidersByPraise(String number,String id){

        Integer number1 = Integer.parseInt(number);

        Integer praiseNumber = number1+1;
        Integer raidersId = Integer.parseInt(id);

        Raiders raiders = raidersService.queryRaidersById(raidersId);
        raiders.setRaidersPraise(praiseNumber);

        Integer rows = raidersService.updateRaiders(raiders);

        if(rows>0){
            return 1;
        }
        return 0;
    }


    //收藏数目
    @RequestMapping("updateRaisersByCollection")
    @ResponseBody
    public Integer updateRaisersByCollection(String number,String id){
        Integer raidersId = Integer.parseInt(id);
        Integer number1 = Integer.parseInt(number);

        Integer collectionNumber = number1+1 ;

        Raiders raiders = raidersService.queryRaidersById(raidersId);
        raiders.setCollectNumber(collectionNumber);

        Integer rows = raidersService.updateRaiders(raiders);
        if(rows>0){
            return 1;
        }
        return 0;
    }


}