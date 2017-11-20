package refresh.listview.com.talentmanagement.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qufl
 *         日期公共类
 */

public class DateUtil {


    private static SimpleDateFormat sf = null;

    /* 获取系统时间 格式为："yyyy/MM/dd " */
    public static String getCurrentDate() {
        Date d = new Date();
        sf = new SimpleDateFormat("yyyy/MM/dd");
        return sf.format(d);
    }

    /**
     * 获取系统时间 格式为："yyyy年MM月dd日 "
     */
    public static String getCurrentToDate() {
        Date d = new Date();
        sf = new SimpleDateFormat("yyyy年MM月dd日");
        return sf.format(d);
    }

    /**
     * 获取系统时间 格式为："yyyy年MM月 "
     */
    public static String getCurrentYearMonth() {
        Date d = new Date();
        sf = new SimpleDateFormat("yyyy年MM月");
        return sf.format(d);
    }

    /* 时间戳转换成字符窜 */
    public static String getDateToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy/MM/dd");
        return sf.format(d);
    }

    /**
     * 时间戳转换成字符窜
     * 只显示年月
     */
    public static String getYearToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy/MM");
        return sf.format(d);
    }

    /**
     * 时间戳转换成字符窜
     * 显示月份时间
     */
    public static String getMonthToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("MM-dd HH:mm");
        return sf.format(d);
    }

    /**
     * 时间戳转换成字符窜
     * 显示yy-MM-dd HH:mm
     */
    public static String getToString(long time) {
        Date d = new Date(time);
        sf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return sf.format(d);
    }

    /**
     * 将字符串转为时间戳yyyy/mm/dd
     */
    public static long getStringToDate(String time) {
        sf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
            date = sf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    //把日期转为字符串
    public static String ConverToString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

        return df.format(date);
    }

    //把字符串转为日期
    public static Date ConverToDate(String strDate) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy/MM");
        return df.parse(strDate);
    }

    /**
     * 格式化字符串
     *
     * @param dateStr
     * @return
     * @throws Exception
     */
    public static String formatDateStr(String dateStr) throws Exception {
        Date date = ConverToDate(dateStr);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }

    /**
     * 时间字符串转化为时间戳
     *
     * @param dateStr yyyy/MM
     * @return
     * @throws Exception
     */
    public static long cover2Time(String dateStr) throws Exception {
        Date date = ConverToDate(dateStr);
        return date.getTime();
    }

    /**
     * 把字符串转为日期yyyy/MM/dd
     */
    public static Date ConverToYear(String strDate) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        return df.parse(strDate);
    }

    /**
     * 格式化字符串
     *
     * @param dateStr
     * @return
     * @throws Exception
     */
    public static String formatYearStr(String dateStr) throws Exception {
        Date date = ConverToYear(dateStr);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }


    /**
     * 把yyyy/mm转化为yyyy年mm月dd日
     */
    public static String getReplaceDate(String dateStr) {
        String date = dateStr.replace("/", "年") + "月1日";
        return date;

    }

    /**
     * 把yyyy/mm/dd转化为yyyy年mm月dd日
     */
    public static String getReplaceYear(String dateStr) {
        String date = dateStr.replaceFirst("/", "年").replace("/", "月") + "日";
        return date;

    }

}
