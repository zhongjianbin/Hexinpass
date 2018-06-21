package projects.wlye.pages;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import java.util.logging.Logger;

import helper.base.VP2;
import helper.squareup.spoon.Spoon;

/**
 * Author:jianbin.zhong
 * Date: 2018/4/28 15:46
 * Description:
 */
public class HomePages extends VP2{

    private static Logger logger = Logger.getLogger(HomePages.class.getName());

    public static String ID_HOME = "com.staff.wuliangye:id/rb_home";
    public static String ID_UNION = "com.staff.wuliangye:id/rb_msg";
    public static String ID_MY = "com.staff.wuliangye:id/rb_my";
    //消息
    public static String ID_MSG = "com.staff.wuliangye:id/rl_msg";
    public static String ID_COMMONBAR = "com.staff.wuliangye:id/rl_common_bar"; //消息数目
    public static String ID_MSGTITLE = "com.staff.wuliangye:id/title";//我的消息
    //banner
    public static String ID_BANNERTITLE = "com.staff.wuliangye:id/tv_banner_title";//banner标题
    public static String ID_BANNERCOUNT = "com.staff.wuliangye:id/circleIndicator";//banner圆点
    public static String ID_BANNERBUTTOM = "com.staff.wuliangye:id/iv_banner_bottom";//banner圆点
    //普惠扫码、现金红包、全部商户、便民缴费、电影选座
    public static String ID_PAY = "com.staff.wuliangye:id/ll_pay";//普惠扫码
    public static String ID_BJ = "com.staff.wuliangye:id/ll_bj";//现金红包
    public static String ID_ACTIVITY = "com.staff.wuliangye:id/ll_activity";//工会活动
    public static String ID_STUFF = "com.staff.wuliangye:id/ll_stuff";//素质提升
    public static String ID_LIFE = "com.staff.wuliangye:id/ll_life";//全部商户
    public static String ID_FILM = "com.staff.wuliangye:id/ll_film";//电影选座
    public static String ID_CHARGE = "com.staff.wuliangye:id/ll_charge";//便民缴费
    public static String ID_FLFW = "com.staff.wuliangye:id/ll_flfw";//法律服务
    public static String ID_XLJY = "com.staff.wuliangye:id/ll_xljy";//心理减压
    public static String ID_HZBZ = "com.staff.wuliangye:id/ll_hzbz";//互助保障

    //会员专享
    public static String ID_CUSTOM = "com.staff.wuliangye:id/ll_line_label_m";
    public static String ID_SHOP = "com.staff.wuliangye:id/iv_shop";//普惠商城
    public static String ID_MS = "com.staff.wuliangye:id/iv_ms";//限时秒杀
    public static String ID_FINANCE = "com.staff.wuliangye:id/iv_finance";//普惠金融
    //附近商户
    public static String ID_BUSINESS = "com.staff.wuliangye:id/ll_line_label_m1";
    public static String ID_BUSINESSLIST = "com.staff.wuliangye:id/list_item";//所有商户
    public static String ID_BUSINESSPIC = "com.staff.wuliangye:id/business_pic";
    public static String ID_BUSINESSNAME = "com.staff.wuliangye:id/business_name";
    public static String ID_BUSINESSDISTANCE = "com.staff.wuliangye:id/distance_text";
    public static String ID_BUSINESSRAT = "com.staff.wuliangye:id/ratingBar";
    public static String ID_BUSINESSCATE = "com.staff.wuliangye:id/sub_category";
    public static String ID_BUSINESSCIRCLE = "com.staff.wuliangye:id/tv_circle";

    /**
     *点击跳转到工会服务界面
     *@author jianbin.zhong
     *@time 2018/5/24 14:28
     */
    public static void navToUnionPage(){
        clickById(ID_UNION);
        Spoon.screenshot("navToUnionPage");
    }

    /**
     *跳转到我的界面
     *@author jianbin.zhong
     *@time 2018/5/24 14:30
     */
    public static void navToMyPage(){
        clickById(ID_MY);
        Spoon.screenshot("navToMyPage");
    }

    /**
     *点击右上角的消息button,进入我的消息
     *@author jianbin.zhong
     *@time 2018/5/24 14:32
     */
    public static void clickMsg(){
        clickById(ID_MSG);
        Spoon.screenshot("clickMsg");
    }

    /**
     *消息界面获取“我的消息”title
     *@author jianbin.zhong
     *@time 2018/5/24 15:50
     */
    public static String getMsgTitle() throws UiObjectNotFoundException {
        return getTex(ID_MSGTITLE);
    }
    
    /**
     *获取消息数目
     *@author jianbin.zhong
     *@time 2018/5/24 14:35
     */
    public static String getMsgCounts() throws UiObjectNotFoundException {
        return getObjectById(ID_COMMONBAR).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *获取第index banner的title
     *@author jianbin.zhong
     *@time 2018/5/24 14:38
     */
    public static String getBannerTitle(int index) throws UiObjectNotFoundException {
        return getObjectById(ID_BANNERTITLE,index).getText();
    }

    /**
     *获取banner的个数
     *@author jianbin.zhong
     *@time 2018/5/24 14:44
     */
    public static int getBannerCount() throws UiObjectNotFoundException {
        return getObjectById(ID_BANNERCOUNT).getChildCount();
    }

    /**
     *点击进入普惠扫码
     *@author jianbin.zhong
     *@time 2018/5/24 14:46
     */
    public static void navToPay(){
        clickById(ID_PAY);
        Spoon.screenshot("navToPay");
    }

    /**
     *获取“普惠扫码”四个字
     *@author jianbin.zhong
     *@time 2018/5/24 14:47
     */
    public static String getPayTex() throws UiObjectNotFoundException {
        return getObjectById(ID_PAY).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入现金红包
     *@author jianbin.zhong
     *@time 2018/5/24 14:48
     */
    public static void navToBj(){
        clickById(ID_BJ);
        Spoon.screenshot("navToJb");
    }

    /**
     *获取“现金红包”四个字
     *@author jianbin.zhong
     *@time 2018/5/24 14:49
     */
    public static String getBjTex() throws UiObjectNotFoundException {
        return getObjectById(ID_BJ).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入到工会活动界面
     *@author jianbin.zhong
     *@time 2018/6/21 15:30
     */
    public static void navToActivity(){
        clickById(ID_ACTIVITY);
        Spoon.screenshot("navToActivity");
    }

    /**
     *获取“工会活动四个字”
     *@author jianbin.zhong
     *@time 2018/6/21 15:32
     */
    public static String getActiTex() throws UiObjectNotFoundException {
        return getObjectById(ID_ACTIVITY).getChild(new UiSelector().index(1)).getText();
    }
    
    /**
     *点击进入素质提升
     *@author jianbin.zhong
     *@time 2018/6/21 15:34
     */
    public static void navToStuff(){
        clickById(ID_STUFF);
        Spoon.screenshot("navToStuff");
    }

    /**
     *获取“素质提升”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 15:35
     */
    public static String getStuffTex() throws UiObjectNotFoundException {
        return getObjectById(ID_STUFF).getChild(new UiSelector().index(1)).getText();
    }


    /**
     *点击进入全部商户界面
     *@author jianbin.zhong
     *@time 2018/5/24 14:51
     */
    public static void navToLife(){
        clickById(ID_LIFE);
        Spoon.screenshot("navToLife");
    }

    /**
     *获取“全部商户”四个字
     *@author jianbin.zhong
     *@time 2018/5/24 14:53
     */
    public static String getLifeTex() throws UiObjectNotFoundException {
        return getObjectById(ID_LIFE).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入便民缴费界面
     *@author jianbin.zhong
     *@time 2018/5/24 14:54
     */
    public static void navToCharge(){
        clickById(ID_CHARGE);
        Spoon.screenshot("navToCharge");
    }
    
    /**
     *获取"便民缴费"四个字
     *@author jianbin.zhong
     *@time 2018/5/24 14:55
     */
    public static String getChargeTex() throws UiObjectNotFoundException {
        return getObjectById(ID_CHARGE).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入法律服务界面
     *@author jianbin.zhong
     *@time 2018/6/21 15:38
     */
    public static void navToFlfw(){
        clickById(ID_FLFW);
        Spoon.screenshot("navToFlfw");
    }

    /**
     *获取“法律服务”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 15:40
     */
    public static String getFlfwTex() throws UiObjectNotFoundException {
        return getObjectById(ID_FLFW).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入心理减压
     *@author jianbin.zhong
     *@time 2018/6/21 15:42
     */
    public static void navToXljy(){
        clickById(ID_XLJY);
        Spoon.screenshot("navToXljy");
    }

    /**
     *获取“心理减压”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 15:43
     */
    public static String getXljyTex() throws UiObjectNotFoundException {
        return getObjectById(ID_XLJY).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入互助保障
     *@author jianbin.zhong
     *@time 2018/6/21 15:44
     */
    public static void navToHzbz(){
        clickById(ID_HZBZ);
        Spoon.screenshot("navToHzbz");
    }

    /**
     *获取“互助保障”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 15:45
     */
    public static String getHzbzTex() throws UiObjectNotFoundException {
        return getObjectById(ID_HZBZ).getChild(new UiSelector().index(1)).getText();
    }


    /**
     *跳转进入电影选座
     *@author jianbin.zhong
     *@time 2018/5/24 14:56
     */
    public static void navToFilm(){
        clickById(ID_FILM);
        Spoon.screenshot("navToFilm");
    }
    
    /**
     *获取“电影选座”四个字
     *@author jianbin.zhong
     *@time 2018/5/24 14:57
     */
    public static String getFilmTex() throws UiObjectNotFoundException {
        return getObjectById(ID_FILM).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *获取“会员专享四个字”
     *@author jianbin.zhong
     *@time 2018/5/24 14:59
     */
    public static String getCustomTex() throws UiObjectNotFoundException {
        return getObjectById(ID_CUSTOM).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *点击进入普惠商城
     *@author jianbin.zhong
     *@time 2018/5/24 15:02
     */
    public static void navToShop(){
        clickById(ID_SHOP);
        Spoon.screenshot("navToShop");
    }

    /**
     *点击进入限时秒杀
     *@author jianbin.zhong
     *@time 2018/5/24 15:02
     */
    public static void navToMs(){
        clickById(ID_MS);
        Spoon.screenshot("navToMs");
    }

    /**
     *点击进入普惠金融
     *@author jianbin.zhong
     *@time 2018/5/24 15:03
     */
    public static void navToFinance(){
        clickById(ID_FINANCE);
        Spoon.screenshot("navToFinance");
    }
    
    /**
     *获取商户的个数
     *@author jianbin.zhong
     *@time 2018/5/24 15:21
     */
    public static int getBusinessCount() throws UiObjectNotFoundException {
        return getObjectById(ID_BUSINESSLIST).getChildCount();
    }

    /**
     *获取index索引的商户
     *@author jianbin.zhong
     *@time 2018/5/24 15:10
     */
    public static UiObject getIndexItemObject(int index) throws UiObjectNotFoundException {
        UiObject indexItemObject = null;
        indexItemObject =getObjectById(ID_BUSINESSLIST).getChild(new UiSelector().index(index)).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(1));
        return indexItemObject;
    }

    /**
     *点击进入第index个商户(index从0开始)
     *@author jianbin.zhong
     *@time 2018/5/24 15:17
     */
    public static void navToIndexBusiness(int index) throws UiObjectNotFoundException {
        //可能需要添加滑动屏幕动作
        if (index > getBusinessCount()){
            logger.info("erro index out of range");
        }else {
            getObjectById(ID_BUSINESSLIST).getChild(new UiSelector().index(index)).click();
        }

    }

    /**
     *获取第index商户的名称
     *@author jianbin.zhong
     *@time 2018/5/24 15:19
     */
    public static String getBusinessName(int index) throws UiObjectNotFoundException {
        //可能需要添加滑动屏幕的动作
        if (index > getBusinessCount()){
            logger.info("error index out of range");
            return null;
        }else {
            return getIndexItemObject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_BUSINESSNAME)).getText();
        }
        }

    /**
     *获取第index商户的距离
     *@author jianbin.zhong
     *@time 2018/5/24 15:26
     */
    public static String getBusinessDistance(int index) throws UiObjectNotFoundException {
        if (index > getBusinessCount()){
            logger.info("error index out of range");
            return null;
        }else {
            return getIndexItemObject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_BUSINESSDISTANCE)).getText();
        }
    }

    /**
     *获取第index商户的circle
     *@author jianbin.zhong
     *@time 2018/5/24 15:27
     */
    public static String getBusinessCircle(int index) throws UiObjectNotFoundException {
        if (index > getBusinessCount()){
            logger.info("error index out of range");
            return null;
        }else {
            return getIndexItemObject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_BUSINESSCIRCLE)).getText();
        }
    }
}