package com.chixing.mapper;

import com.chixing.entity.Company;
import com.chixing.entity.RenderingImg;
import com.chixing.entity.RenderingImgExample;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * RenderingImgMapper继承基类
 */
@Repository
public interface RenderingImgMapper extends MyBatisBaseDao<RenderingImg,Integer> {

    List<RenderingImg> selectByExample(RenderingImgExample example);

    //根据公司id查询图片
    List<RenderingImg> selectByCompanyId(Integer companyId);

    //根据效果图id查询图片
    List<RenderingImg> selectByRenderingId(Integer renderingId);

    //根据方案id查询对应的图片集合
    List<RenderingImg> selectByDesignId(Integer designId);
}