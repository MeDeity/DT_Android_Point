package com.dots.hex;

/**
 * 进制转化工具类
 * Created by fengwenhua on 2017/1/26.
 */

@SuppressWarnings("unused")
public class HexUtils {

    /**常用的进制枚举*/
    public enum Hex{
        /**二进制*/HEX_2(2),
        /**8进制*/HEX_8(8),
        /**10进制*/HEX_10(10),
        /**16进制*/HEX_16(16);

        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        Hex(int code){this.code = code;}
    }
    /**
     * 10进制转hex进制
     * @param hex 目标进制
     * @param  number 10进制数
     * 因为该方法可以直接调用Integer.toBinaryString获取,因此不对外暴露
     * */
    private static String hex10ToHex(Hex hex,int number){
        switch (hex){
            case HEX_2:
                return Integer.toBinaryString(number);
            case HEX_8:
                return Integer.toOctalString(number);
            case HEX_10:
                return String.valueOf(number);//10进制则原样返回
            case HEX_16:
                return Integer.toBinaryString(number);
        }
        return Integer.toHexString(number);
    }

    /**
     * 2进制/8进制/16进制转10进制有现成的方法可以调用
     * {@link valueOf (String string, int radix}
     *
     * 10进制 转 2进制/8进制/16进制转有现成的方法可以调用
     * toHexString toOctalString toBinaryString
     * */


    /**
     * 进制互转
     * {@code String.valueOf(String string, int radix)}
     * 16->2 16->8
     * 8->2 8->16
     * 2->8 2->10
     * @param original 原始进制
     * @param target 目标进制
     */
    public static String hex2Hex(Hex original,Hex target,String data) throws NumberFormatException{
        return hex10ToHex(target,Integer.valueOf(data,original.code));
    }


}
