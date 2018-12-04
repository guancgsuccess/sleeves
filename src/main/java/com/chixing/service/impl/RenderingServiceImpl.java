package com.chixing.service.impl;

import com.chixing.entity.Rendering;
import com.chixing.mapper.RenderingMapper;
import com.chixing.service.RenderingService;
import com.chixing.util.PageModel;
import com.chixing.util.RenderingPageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RenderingServiceImpl implements RenderingService {

    @Autowired
    private RenderingMapper renderingMapper;


    @Override
    public Rendering queryRenderingById(Integer renderingId) {
        Rendering rendering1 = renderingMapper.selectByPrimaryKey(renderingId);
        return rendering1;
    }

    @Override
    public List<Rendering> queryRenderingAll() {
        List<Rendering> renderingList = renderingMapper.selectRenderingAll();
        return renderingList;
    }


    @Override
    public Integer queryRenderingAllCount() {
        Integer renderingAllCounts = renderingMapper.selectRenderingAllCount();
        return renderingAllCounts;
    }

    @Override
    public List<Rendering> queryRenderingAllByPage(RenderingPageModel<Rendering> page) {
        List<Rendering> renderingList = renderingMapper.selectRenderingAllByPage(page);
        return renderingList;
    }

    @Override
    public List<Rendering> getRenderingByConditions(Object[] args) {
        HashMap<String ,Object> param = new HashMap<>();
        //(renderingStyle,renderingHouseType,minRenderingArea,maxRenderingArea,startRecord,pageSize);
        System.out.println("args = "+ args[0] +"," +args[1]+","+args[2]+","+args[3]+","+args[4]);

        param.put("renderingStyle",args[0]);
        param.put("renderingHouseType",args[1]);
        param.put("minRenderingArea",args[2]);
        param.put("maxRenderingArea",args[3]);
        param.put("startRecord",((RenderingPageModel)args[4]).getStartRecord());
        param.put("pageSize",((RenderingPageModel)args[4]).getPageSize());
        System.out.println("param = "+param);

        List<Rendering> renderingList = renderingMapper.selectRenderingByConditions(param);

        return renderingList;
    }


    @Override
    public Integer getCountByConditions(Object[] args) {
        HashMap<String ,Object> param = new HashMap<>();
        //(renderingStyle,renderingHouseType,minRenderingArea,maxRenderingArea,startRecord,pageSize);
        System.out.println("args = "+ args[0] +"," +args[1]+","+args[2]+","+args[3]+","+args[4]);

        param.put("renderingStyle",args[0]);
        param.put("renderingHouseType",args[1]);
        param.put("minRenderingArea",args[2]);
        param.put("maxRenderingArea",args[3]);
        param.put("startRecord",((RenderingPageModel)args[4]).getStartRecord());
        param.put("pageSize",((RenderingPageModel)args[4]).getPageSize());
        System.out.println("param = "+param);

        Integer count = renderingMapper.selectCountByConditions(param);
        return count;
    }

}
