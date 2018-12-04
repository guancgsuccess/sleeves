package com.chixing.controllerr;

import com.chixing.util.UploadImgUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @GetMapping("getToken")
    @ResponseBody
    public Map<String,String> generateUpToken(){
        Map<String,String> result=new HashMap<>(1);
        result.put("uptoken", UploadImgUtil.getUpToken());
        return result;
    }
}
