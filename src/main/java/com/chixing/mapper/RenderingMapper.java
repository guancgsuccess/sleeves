package com.chixing.mapper;

import com.chixing.entity.Rendering;
import com.chixing.entity.RenderingExample;
import com.chixing.util.PageModel;
import com.chixing.util.RenderingPageModel;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * RenderingMapper继承基类
 */
@Repository
public interface RenderingMapper extends MyBatisBaseDao<Rendering, Integer> {




    //根据页数分配
    List<Rendering> selectRenderingAllByPage(PageModel<Rendering> page);



    //获得所有效果图的信息
    List<Rendering> selectRenderingAll();

    //获得效果图的数量
    Integer selectRenderingAllCount();

    //根据页数分配
    List<Rendering> selectRenderingAllByPage(RenderingPageModel<Rendering> page);

    List<Rendering> selectByExample(RenderingExample example);

    //多条件查询效果图
    List<Rendering> selectRenderingByConditions(HashMap<String ,Object> hashMap);

    //查询符合条件的效果图个数
    public Integer selectCountByConditions(HashMap<String ,Object> hashMap);


}