package projects.wlye.pages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 15:46
 * Description:我的页面元素以及相关元素的操作
 */

public class MyPages extends VP2{

    public static String ID_MY = "com.staff.wuliangye:id/rb_my";
    private static String ID_TITLE = "com.staff.wuliangye:id/title";
    //个人信息
    private static String ID_AVATAR = "com.staff.wuliangye:id/iv_user_icon";
    private static String ID_USERNAME = "com.staff.wuliangye:id/tv_name";
    private static String ID_PHONENUMBER = "com.staff.wuliangye:id/tv_user_level";
    private static String ID_BRANCH = "com.staff.wuliangye:id/btn_ck";
    //普惠钱包
    private static String ID_YUE = "com.staff.wuliangye:id/tv_balance";
    private static String ID_PUHUIWALLET = "com.staff.wuliangye:id/rl_puhui_wallet";
    private static String ID_BALANCEBACK = "com.staff.wuliangye:id/title_left_btn";
    private static String ID_BANLANCETITLE = "com.staff.wuliangye:id/title";
    private static String ID_BILL = "com.staff.wuliangye:id/title_right_txt";
    //专项资金
    private static String ID_SPECIAL = "com.staff.wuliangye:id/rl_special";
    private static String ID_SPECIALTIPS = "com.staff.wuliangye:id/tv_tips";
    //优惠券
    public static String ID_COUPON = "com.staff.wuliangye:id/tv_coupon";



    public static String ID_INTERACTION = "com.staff.wuliangye:id/rl_interaction";
    public static String ID_NAVTOINTERACTION = "com.staff.wuliangye:id/tv_comm_tips";
    private static String ID_MYFAMILY = "com.staff.wuliangye:id/tv_family";
    private static String ID_SAFECENTER = "com.staff.wuliangye:id/tv_safe";
    private static String ID_FEED = "com.staff.wuliangye:id/tv_feed";
    public static String ID_ABOUT = "com.staff.wuliangye:id/tv_about";

    public static String TEX_PUHUIWALLET = "普惠钱包余额";

    /**
     *点击进入我的界面
     *@author jianbin.zhong
     *@time 2018/5/15 16:00
     */
    public static void navToMyPage(){
        clickById(ID_MY);
        Spoon.screenshot("navToMyPage");
    }

    /**
     *获取我的界面的title文字
     *@author jianbin.zhong
     *@time 2018/5/15 15:34
     */
    public static String getTitleTex() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *点击头像
     *@author jianbin.zhong
     *@time 2018/5/15 15:38
     */
    public static void clickAvatar(){
        clickById(ID_AVATAR);
    }

    /**
     *获取用户名
     *@author jianbin.zhong
     *@time 2018/5/15 15:39
     */
    public static String getUsernameTex() throws UiObjectNotFoundException {
        return getTex(ID_USERNAME);
    }

    /**
     *获取电话号码
     *@author jianbin.zhong
     *@time 2018/5/15 15:40
     */
    public static String getPhonenumberTex() throws UiObjectNotFoundException {
        return getTex(ID_PHONENUMBER);
    }

    /**
     *获取用户所在的机关分会名称
     *@author jianbin.zhong
     *@time 2018/5/15 15:41
     */
    public static String getBranchTex() throws UiObjectNotFoundException {
        return getTex(ID_BRANCH);
    }


    //余额
    /**
     *获取普惠钱包的余额金额
     *@author jianbin.zhong
     *@time 2018/5/16 10:07
     */
    public static String getYuETex() throws UiObjectNotFoundException {
        return getTex(ID_YUE);
    }

    /**
     *获取“普惠钱包余额”几个字
     *@author jianbin.zhong
     *@time 2018/5/22 13:58
     */
    public static String getPuHuiWalletTex() throws UiObjectNotFoundException {
       return getObjectById(ID_PUHUIWALLET).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *点击进入普惠钱包余额界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:10
     */
    public static void navToBalance(){
        clickById(ID_YUE);
        Spoon.screenshot("navToBalance");
    }

    //专项资金
    /**
     *获取“我的专项资金”几个字
     *@author jianbin.zhong
     *@time 2018/5/23 9:14
     */
    public static String getSpecialTex() throws UiObjectNotFoundException {
        return getObjectById(ID_SPECIAL).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *进入我的专项资金
     *@author jianbin.zhong
     *@time 2018/5/23 9:15
     */
    public static void navToSpecialTips(){
        clickById(ID_SPECIALTIPS);
    }

    //优惠券
    /**
     *获取“我的优惠券”几个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:12
     */
    public static String getCouponTex() throws UiObjectNotFoundException {
        return getTex(ID_COUPON);
    }

    /**
     *进入到我的优惠券界面
     *@author jianbin.zhong
     *@time 2018/5/23 10:13
     */
    public static void navToCoupon(){
        clickById(ID_COUPON);
    }


    /**
     *获取“沟通咨询四个字”
     *@author jianbin.zhong
     *@time 2018/5/17 14:37
     */
    public static String getInteractionTex() throws UiObjectNotFoundException {
        return getObjectById(ID_INTERACTION).getChild(new UiSelector().className("android.widget.TextView").index(0)).getText();
    }

    /**
     *进入到沟通咨询界面
     *@author jianbin.zhong
     *@time 2018/5/17 14:46
     */
    public static void navToInteraction(){
        clickById(ID_NAVTOINTERACTION);
        Spoon.screenshot("navToInteraction");
    }



    //我的家属
    /**
     *获取“我的家属”四个字
     *@author jianbin.zhong
     *@time 2018/5/16 10:15
     */
    public static String getMyFamilyTex() throws UiObjectNotFoundException {
        return getTex(ID_MYFAMILY);
    }

    /**
     *点击进入我的家属界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:16
     */
    public static void navToMyFamily(){
        clickById(ID_MYFAMILY);
        Spoon.screenshot("navToMyFamily");
    }


    //安全中心
    /**
     *获取“安全中心”四个字
     *@author jianbin.zhong
     *@time 2018/5/16 10:18
     */
    public static String getSafeCenterTex() throws UiObjectNotFoundException {
        return getTex(ID_SAFECENTER);
    }

    /**
     *点击进入安全中心界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:21
     */
    public static void navToSafeCenter(){
        clickById(ID_SAFECENTER);
        Spoon.screenshot("navToSafeCenter");
    }

    //建言献策
    /**
     *获取“建言献策”四个字
     *@author jianbin.zhong
     *@time 2018/5/16 10:24
     */
    public static String getFeedTex() throws UiObjectNotFoundException {
        return getTex(ID_FEED);
    }

    /**
     *进入建言献策界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:25
     */
    public static void navToFeed(){
        clickById(ID_FEED);
        Spoon.screenshot("navToFeed");
    }


    //关于五粮液家园
    /**
     *获取“关于五粮液家园”字体
     *@author jianbin.zhong
     *@time 2018/5/16 10:32
     */
    public static String getAboutTex() throws UiObjectNotFoundException {
        return getTex(ID_ABOUT);
    }
    
    /**
     *进入关于五粮液家园界面
     *@author jianbin.zhong
     *@time 2018/5/16 10:33
     */
    public static void navToAbout(){
        clickById(ID_ABOUT);
    }

}