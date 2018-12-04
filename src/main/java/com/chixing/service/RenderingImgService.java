package com.chixing.service;

import com.chixing.entity.Company;
import com.chixing.entity.RenderingImg;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface RenderingImgService {


    //根据效果图id查询对应效果图图片（一个效果图可能有多张图片）
    List<RenderingImg> queryByRenderingId(Integer renderingId);

    //根据效果图id 获得效果图的主图片
    RenderingImg queryFirstImgByRenderingId(Integer renderingId);

    //根据公司ID查询效果图
    List<RenderingImg> selectByCompanyId(Integer companyId);

    //根据效果图Id查询效果图片
    List<RenderingImg> selectByRenderingId(Integer renderingId);

    //根据方案id查询对应的图片集合
    List<RenderingImg> queryByDesignId(Integer designId);
}
