package com.chixing.service.impl;

import com.chixing.entity.RenderingImg;
import com.chixing.entity.RenderingImgExample;
import com.chixing.mapper.RenderingImgMapper;
import com.chixing.service.RenderingImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenderingImgServiceImpl implements RenderingImgService {

    @Autowired
    private RenderingImgMapper renderingImgMapper;

    @Override
    public List<RenderingImg> queryByRenderingId(Integer renderingId) {
        RenderingImgExample renderingImgExample = new RenderingImgExample();
        renderingImgExample.createCriteria().andRenderingIdEqualTo(renderingId);
        return renderingImgMapper.selectByExample(renderingImgExample);
    }


    @Override
    public RenderingImg queryFirstImgByRenderingId(Integer renderingId) {
        RenderingImgExample renderingImgExample = new RenderingImgExample();
        renderingImgExample.createCriteria().andRenderingIdEqualTo(renderingId).andRenderingSortnoEqualTo(1);
        return renderingImgMapper.selectByExample(renderingImgExample).get(0);
    }

    @Override
    public List<RenderingImg> selectByCompanyId(Integer companyId) {
        return renderingImgMapper.selectByCompanyId(companyId);
    }

    @Override
    public List<RenderingImg> selectByRenderingId(Integer renderingId) {
        return renderingImgMapper.selectByRenderingId(renderingId);
    }

    @Override
    public List<RenderingImg> queryByDesignId(Integer designId) {
        List<RenderingImg> renderingImgList = renderingImgMapper.selectByRenderingId(designId);
        return renderingImgList;
    }


}
