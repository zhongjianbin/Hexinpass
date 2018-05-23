package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObjectNotFoundException;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/23 15:50
 * Description:
 */

public class AboutPage extends VP2{

    public static String ID_BACK = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_TITLE = "com.staff.wuliangye:id/title";
    public static String ID_ABOUTVERSION1 = "com.staff.wuliangye:id/tv_version";
    public static String ID_ABOUTDESC = "com.staff.wuliangye:id/tv_platform_desc";
    public static String ID_ABOUTPHONE = "com.staff.wuliangye:id/tv_phone";
    public static String ID_ABOUTVERSION2 = "com.staff.wuliangye:id/tv_version1";
    public static String ID_ABOUTUPDATE = "com.staff.wuliangye:id/tv_update";

    /**
     *about 界面返回到我的界面
     *@author jianbin.zhong
     *@time 2018/5/23 15:58
     */
    public static void aboutBackMy(){
        clickById(ID_BACK);
    }

    /**
     *获取关于五粮液家园的title
     *@author jianbin.zhong
     *@time 2018/5/23 15:59
     */
    public static String getAboutTitle() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *获取关于关于五粮液家园下图标下的版本
     *@author jianbin.zhong
     *@time 2018/5/23 16:00
     */
    public static String getAboutVersion1() throws UiObjectNotFoundException {
        return getTex(ID_ABOUTVERSION1);
    }

    /**
     *获取“五粮液家园平台协议”text
     *@author jianbin.zhong
     *@time 2018/5/23 16:01
     */
    public static String getAboutDescTex() throws UiObjectNotFoundException {
        return getTex(ID_ABOUTDESC);
    }

    /**
     *查看五粮液家园平台协议
     *@author jianbin.zhong
     *@time 2018/5/23 16:12
     */
    public static void navToProtocol(){
        clickById(ID_ABOUTDESC);
    }

    /**
     *查看协议界面返回到about界面
     *@author jianbin.zhong
     *@time 2018/5/23 16:16
     */
    public static void protocolBackAbout(){
        clickById(ID_BACK);
    }

    /**
     *协议详情界面获取“五粮液结缘介绍”几个字
     *@author jianbin.zhong
     *@time 2018/5/23 16:17
     */
    public static String getProtocolIntro() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *点击查看协议
     *@author jianbin.zhong
     *@time 2018/5/23 16:02
     */
    public static void clickDesc(){
        clickById(ID_ABOUTDESC);
    }

    /**
     *获取客服电话号码
     *@author jianbin.zhong
     *@time 2018/5/23 16:02
     */
    public static String getPhone() throws UiObjectNotFoundException {
        return getTex(ID_ABOUTPHONE);
    }

    /**
     *获取客服电话号码下的版本text
     *@author jianbin.zhong
     *@time 2018/5/23 16:03
     */
    public static String getVersion2() throws UiObjectNotFoundException {
        return getTex(ID_ABOUTVERSION2);
    }

    /**
     *获取“更新”两个字
     *@author jianbin.zhong
     *@time 2018/5/23 16:04
     */
    public static String getUpdateTex() throws UiObjectNotFoundException {
        return getTex(ID_ABOUTUPDATE);
    }

    /**
     *点击更新
     *@author jianbin.zhong
     *@time 2018/5/23 16:04
     */
    public static void clickUpdate(){
        clickById(ID_ABOUTUPDATE);
    }

    /**
     *获取“客服电话四个字”
     *@author jianbin.zhong
     *@time 2018/5/23 16:09
     */
    public static String getKeFuDianHuaTex() throws UiObjectNotFoundException {
        return getObjectByText("客服电话").getText();
    }

    /**
     *获取“当前版本”四个字
     *@author jianbin.zhong
     *@time 2018/5/23 16:10
     */
    public static String getNowVersion() throws UiObjectNotFoundException {
        return getObjectByText("当前版本").getText();
    }
}