package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/23 10:13
 * Description:我的优惠券界面
 */

public class CouponPage extends VP2 {

    public static String ID_COUNPONBACKMY = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_TITLE = "com.staff.wuliangye:id/title";
    public static String ID_GETCOUPON = "com.staff.wuliangye:id/title_right_txt";
    public static String ID_TABLE = "android.support.v7.app.ActionBar$Tab";
    public static String ID_GOGETCOUPON = "com.staff.wuliangye:id/tv_get";
    public static String ID_NOMSG = "com.staff.wuliangye:id/tv_no_message";
    //优惠券集市
    public static String ID_MARKETBACKCOUPON = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_MARKETTITLE = "com.staff.wuliangye:id/title";
    public static String ID_COUPONLISTS = "com.staff.wuliangye:id/lv_coupon";

    /**
     *优惠券界面返回到我的界面
     *@author jianbin.zhong
     *@time 2018/5/23 10:23
     */
    public static void couponBackMy(){
        clickById(ID_COUNPONBACKMY);
    }

    /**
     *获取我的优惠券title
     *@author jianbin.zhong
     *@time 2018/5/23 10:23
     */
    public static String getTtile() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *获取“领取优惠券”text
     *@author jianbin.zhong
     *@time 2018/5/23 10:24
     */
    public static String getGetCouponTex() throws UiObjectNotFoundException {
        return getTex(ID_GETCOUPON);
    }

    /**
     *点击领取优惠券
     *@author jianbin.zhong
     *@time 2018/5/23 10:25
     */
    public static void clickGetCoupon(){
        clickById(ID_GETCOUPON);
    }
    
    /**
     *获取“暂无优惠券”几个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:27
     */
    public static String getNoMsgTex() throws UiObjectNotFoundException {
        return getTex(ID_NOMSG);
    }

    /**
     *获取“去领取”text
     *@author jianbin.zhong
     *@time 2018/5/23 10:28
     */
    public static String getGoGetCouponTex() throws UiObjectNotFoundException {
        return getTex(ID_GOGETCOUPON);
    }

    /**
     *点击去领取
     *@author jianbin.zhong
     *@time 2018/5/23 10:29
     */
    public static void clickGoGetCoupon(){
        clickById(ID_GOGETCOUPON);
    }

    /**
     *点击“未使用”
     *@author jianbin.zhong
     *@time 2018/5/23 10:33
     */
    public static void clickNoUse() throws UiObjectNotFoundException {
        clickById(ID_TABLE,0);
    }

    /**
     *获取“未使用”三个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:35
     */
    public static String getNoUseTex() throws UiObjectNotFoundException {
        return getObjectById(ID_TABLE,0).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *点击“已使用”
     *@author jianbin.zhong
     *@time 2018/5/23 10:36
     */
    public static void clickHasUse() throws UiObjectNotFoundException {
        clickById(ID_TABLE,1);
    }

    /**
     *获取已使用三个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:37
     */
    public static String getHasUseTex() throws UiObjectNotFoundException {
        return getObjectById(ID_TABLE,1).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击已失效
     *@author jianbin.zhong
     *@time 2018/5/23 10:40
     */
    public static void clickOutUse() throws UiObjectNotFoundException {
        clickById(ID_TABLE,2);
    }

    /**
     *获取“已失效”三个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:42
     */
    public static String getOutUseTex() throws UiObjectNotFoundException {
        return getObjectById(ID_TABLE,2).getChild(new UiSelector().index(2)).getText();
    }

    /**
     *优惠券集市界面返回到优惠券界面
     *@author jianbin.zhong
     *@time 2018/5/23 10:53
     */
    public static void marketBackCoupon(){
        clickById(ID_MARKETBACKCOUPON);
    }

    /**
     *获取优惠券集市的title
     *@author jianbin.zhong
     *@time 2018/5/23 11:21
     */
    public static String getMarketTitle() throws UiObjectNotFoundException {
        return getTex(ID_MARKETTITLE);
    }



}