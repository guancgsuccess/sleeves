package com.chixing.service;

import com.chixing.entity.Rendering;
import com.chixing.util.PageModel;
import com.chixing.util.RenderingPageModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RenderingService {

    //根据效果图主键查询效果图
    Rendering queryRenderingById(Integer renderingId);

    //获得所有效果图的信息
    List<Rendering> queryRenderingAll();


    //获得效果图的数量
    Integer queryRenderingAllCount();

    //根据页数分配
    List<Rendering> queryRenderingAllByPage(RenderingPageModel<Rendering> page);



    //多条件查询效果图
    List<Rendering> getRenderingByConditions(Object[] args);

    //查询符合条件的效果图个数
    Integer getCountByConditions(Object[] args);



}
