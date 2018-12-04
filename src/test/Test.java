import com.chixing.entity.*;
import com.chixing.mapper.*;
import com.chixing.service.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;


public class Test {

    @org.junit.Test
    public void test1(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompanyService service = (CompanyService)beanFactory.getBean("companyServiceImpl");

        Company company = service.queryCompanyById(10001);
        System.out.println("====" +company);
    }

    @org.junit.Test
    public void test2(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        RaidersMapper mapper = (RaidersMapper)beanFactory.getBean("raidersMapper");

        List<Raiders> raidersList = mapper.selectFourRaiders();
        for(Raiders raiders : raidersList){
            System.out.println("====" +raiders);
        }

    }

    @org.junit.Test
    public void test3(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        DesignService service = (DesignService)beanFactory.getBean("designServiceImpl");

        Design design = service.queryDesignById(10001);
        System.out.println("方案为：" +design);

    }

   @org.junit.Test
    public void test4(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        DesignerService service = (DesignerService)beanFactory.getBean("designerServiceImpl");

        Designer designer = service.queryDesignerById(20001);
        System.out.println("设计师为：" +designer);

    }

    @org.junit.Test
    public void test5(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        DesignerMapper service = (DesignerMapper)beanFactory.getBean("designerMapper");

        List<Designer> designerList = service.selectDesignerByCompanyId(10001);
        for(Designer designer : designerList){
            System.out.println("设计师为：" +designer);
        }
    }

    @org.junit.Test
    public void test6(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        DesignService service = (DesignService)beanFactory.getBean("designServiceImpl");

        Integer counts = service.queryDesignCountByDesignerId(20001);
            System.out.println("数量为：" + counts);

    }

    @org.junit.Test
    public void test7(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompanyService service = (CompanyService)beanFactory.getBean("companyServiceImpl");

        List<Company> companyList = service.queryCompanyByClientId(10002);
        for(Company company : companyList){
            System.out.println("公司为：" + company);
        }

    }

    @org.junit.Test
    public void test8(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        RenderingImgMapper mapper = (RenderingImgMapper)beanFactory.getBean("renderingImgMapper");

        List<RenderingImg> renderingImgList = mapper.selectByDesignId(10001);
        for(RenderingImg renderingImg : renderingImgList){
            System.out.println("公司为：" + renderingImg);
        }
    }

    @org.junit.Test
    public void test9() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompanyCollectionService service = (CompanyCollectionService) beanFactory.getBean("companyCollectionServiceImpl");

        CompanyCollection collection = new CompanyCollection(10002,10007,new Date(),null,null,0);
        Integer counts = service.save(collection);

        System.out.println("行数为:" + counts);
    }

    @org.junit.Test
    public void test10(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        CompanyCollectionService service = (CompanyCollectionService)beanFactory.getBean("companyCollectionServiceImpl");

        List<CompanyCollection> companyCollectionList = service.queryCompanyCollection(10002);
        for(CompanyCollection collection: companyCollectionList){
            System.out.println("收藏为：" + collection);
        }
    }


    @org.junit.Test
    public void test13(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        ReceiveAddressMapper mapper = (ReceiveAddressMapper)beanFactory.getBean("receiveAddressMapper");
        ReceiveAddress receiveAddress = new ReceiveAddress(10002,"详细区","xxxxx","陈伟霆",10002,1,1,null,"18856496446");
        Integer rows = mapper.updateByPrimaryKey(receiveAddress);
        System.out.println("行数为:" +rows);
    }



 }
