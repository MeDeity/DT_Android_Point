package com.dots.hex;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * 时间工具类
 * Created by fengwenhua on 2017/2/3.
 */

@SuppressWarnings("unused")
public class TimeFormatUtils {
    public final static SimpleDateFormat DATE_FORMAT_1 = new SimpleDateFormat("yyyyMMddHHmmss", Locale.CHINESE);
    public final static SimpleDateFormat DATE_FORMAT_2 = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.CHINESE);/**精确到毫秒*/
    public final static SimpleDateFormat DATE_FORMAT_3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINESE);
    public final static SimpleDateFormat DATE_FORMAT_4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINESE);
}
