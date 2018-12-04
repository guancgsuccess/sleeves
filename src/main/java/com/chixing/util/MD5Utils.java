package com.chixing.util;


import java.security.MessageDigest;


/**
 * MD5Utils : 对密码进行加密解密
 */
    public class MD5Utils {

        // MD5加码。32位
        public static String MD5(String inStr) {
            MessageDigest md5 = null;
            try {
                md5 = MessageDigest.getInstance("MD5");
            } catch (Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
                return "";
            }

            char[] charArray = inStr.toCharArray();
            byte[] byteArray = new byte[charArray.length];

            for (int i = 0; i < charArray.length; i++)
                byteArray[i] = (byte) charArray[i];

            byte[] md5Bytes = md5.digest(byteArray);

            StringBuffer hexValue = new StringBuffer();

            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16)
                    hexValue.append("0");
                hexValue.append(Integer.toHexString(val));
            }

            return hexValue.toString();
        }


        // 可逆的加密算法(进一步加密)
        public static String KL(String inStr) {

            char[] a = inStr.toCharArray();
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 't');
            }
            String s = new String(a);
            return s;
        }

        // 加密后解密
        public static String JM(String inStr) {
            char[] a = inStr.toCharArray();
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 't');
            }
            String k = new String(a);
            return k;
        }

        // 测试主函数
        public static void main(String args[]) {
            String s = new String("abc123");
            System.out.println("000000000000000000000");
            System.out.println("原始：" + s);
            System.out.println("MD5后：" + MD5(s));
            System.out.println("MD5后再加密：" + KL(MD5(s)));
            System.out.println("解密为MD5后的：" + JM(KL(MD5(s))));
            System.out.println("MD5后：" + MD5(s));
        }

    }




