package com.chixing.util;
import com.qiniu.util.Auth;

public class UploadImgUtil {

    private static final String ACCESS_KEY="JcizXMVETronZfp-PGoIjB8U6Ms7HCthUKV1JX1I";
    private static final String SECRET_KEY="v1WsaLefVlyewHwMHNKtfT-_qNic_oLpYSXBvjM0";
    private static final String BUCKET_NAME="15m-images-space";
    private static  Long DEAD_LINE =System.currentTimeMillis()/1000L+3600;

    /**
     * 生成uptoken
     * @return 返回uptoken
     */
    public static String getUpToken(){
        Auth auth=Auth.create(ACCESS_KEY,SECRET_KEY);
        return  auth.uploadTokenWithDeadline(BUCKET_NAME,null, DEAD_LINE,null,true);
    }
}
