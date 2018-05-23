package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObject;
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
    public static String ID_COUPONTITLE = "com.staff.wuliangye:id/tv_title";
    public static String ID_COUPONCONTENT = "com.staff.wuliangye:id/tv_content";
    public static String ID_COUPONAMOUNT = "com.staff.wuliangye:id/tv_amount";
    public static String ID_COUPONUSEORGET = "com.staff.wuliangye:id/btn_get";
    //优惠券详情
    public static String ID_COUPONDETAILTEX = "com.staff.wuliangye:id/title";
    public static String ID_DETAILBACKCOUPON = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_COUPONDETAILTITLE = "com.staff.wuliangye:id/tv_title";
    public static String ID_COUPONDETAILDATE = "com.staff.wuliangye:id/tv_date";
    public static String ID_COUPONDETAILAMOUNT = "com.staff.wuliangye:id/tv_amount";
    public static String ID_COUPONDETAILDESC = "com.staff.wuliangye:id/tv_desc";
    public static String ID_COUNPONDETAILUSE = "com.staff.wuliangye:id/btn_use";
    public static String ID_COUPONDETAILTIP = "com.staff.wuliangye:id/tv_tip";
    public static String ID_COUPONDETAILREMARK = "com.staff.wuliangye:id/tv_remark";


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

    /**
     *获取index索引下的优惠券
     *@author jianbin.zhong
     *@time 2018/5/23 14:31
     */
    public static UiObject getCouponUiobject(int index) throws UiObjectNotFoundException {
        UiObject couponUiobject = null;
        int childObjectCount = getObjectById(ID_COUPONLISTS).getChildCount();
        if (childObjectCount == 0){
            System.out.println("获取优惠券出错,请检查是否有优惠券");
        }else {
            if (index > childObjectCount){
                index = childObjectCount;
                System.out.println("输入的索引超过了优惠券的张数，自动认为选取最后一张优惠券");
                couponUiobject = getObjectById(ID_COUPONLISTS).getChild(new UiSelector().index(index));
            }else {
                couponUiobject = getObjectById(ID_COUPONLISTS).getChild(new UiSelector().index(index));
            }
        }
        return couponUiobject;
    }

    /**
     *获取优惠券的描述、金额、title对应的Uiobject
     *@author jianbin.zhong
     *@time 2018/5/23 14:56
     */
    public static UiObject getCouponChildUiobject(int index) throws UiObjectNotFoundException {
        return getCouponUiobject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(1));
    }

    /**
     *获取index索引下的优惠券的标题
     *@author jianbin.zhong
     *@time 2018/5/23 14:46
     */
    public static String getCouponTitle(int index) throws UiObjectNotFoundException {
       return getCouponChildUiobject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_COUPONTITLE)).getText();
    }

    /**
     *获取优惠券的描述
     *@author jianbin.zhong
     *@time 2018/5/23 14:48
     */
    public static String getCouponContent(int index) throws UiObjectNotFoundException {
        return getCouponChildUiobject(index).getChild(new UiSelector().resourceId(ID_COUPONCONTENT)).getText();
    }

    /**
     *获取优惠券的金额
     *@author jianbin.zhong
     *@time 2018/5/23 14:53
     */
    public static String getCounponAmount(int index) throws UiObjectNotFoundException {
        return getCouponChildUiobject(index).getChild(new UiSelector().index(1)).getChild(new UiSelector().resourceId(ID_COUPONAMOUNT)).getText();
    }

    /**
     *获取优惠券“¥”标记
     *@author jianbin.zhong
     *@time 2018/5/23 14:59
     */
    public static String getCouponMoneyTip(int index) throws UiObjectNotFoundException {
        return getCouponChildUiobject(index).getChild(new UiSelector().index(1)).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取优惠券“立即领取”或者“立即使用”字
     *@author jianbin.zhong
     *@time 2018/5/23 15:02
     */
    public static String getCouponUseOrGetTex(int index) throws UiObjectNotFoundException {
        return getCouponUiobject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_COUPONUSEORGET)).getText();
    }

    /**
     *点击“立即领取”或者“立即使用”
     *@author jianbin.zhong
     *@time 2018/5/23 15:05
     */
    public static void useOrGetCoupon(int index) throws UiObjectNotFoundException {
        getCouponUiobject(index).getChild(new UiSelector().index(0)).getChild(new UiSelector().resourceId(ID_COUPONUSEORGET)).click();
    }

    //优惠券详情
    /**
     *优惠券详情界面返回到优惠券界面
     *@author jianbin.zhong
     *@time 2018/5/23 15:17
     */
    public static void detailBackCoupon(){
        clickById(ID_DETAILBACKCOUPON);
    }

    /**
     *获取优惠券详情界面的"详情"字
     *@author jianbin.zhong
     *@time 2018/5/23 15:19
     */
    public static String getCouponDetailTex() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILTEX);
    }

    /**
     *获取优惠券详情界面的优惠券的title
     *@author jianbin.zhong
     *@time 2018/5/23 15:21
     */
    public static String getCouponDetailTitle() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILTITLE);
    }

    /**
     *获取优惠券详情的有效期
     *@author jianbin.zhong
     *@time 2018/5/23 15:22
     */
    public static String getCouponDetailDate() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILDATE);
    }

    /**
     *获取优惠券详情的描述
     *@author jianbin.zhong
     *@time 2018/5/23 15:23
     */
    public static String getCouponDetailDesc() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILDESC);
    }

    /**
     *获取优惠券详情的金额
     *@author jianbin.zhong
     *@time 2018/5/23 15:25
     */
    public static String getCouponDetailAmount() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILAMOUNT);
    }

    /**
     *点击立即使用
     *@author jianbin.zhong
     *@time 2018/5/23 15:27
     */
    public static void clickUseCoupon(){
        clickById(ID_COUNPONDETAILUSE);
    }

    /**
     *获取“立即使用”字体
     *@author jianbin.zhong
     *@time 2018/5/23 15:28
     */
    public static String getCouponDetailUseTex() throws UiObjectNotFoundException {
        return getTex(ID_COUNPONDETAILUSE);
    }
    
    /**
     *获取“使用需知”字体
     *@author jianbin.zhong
     *@time 2018/5/23 15:30
     */
    public static String getCouponDetailTip() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILTIP);
    }

    /**
     *获取优惠券详情的remark字体
     *@author jianbin.zhong
     *@time 2018/5/23 15:31
     */
    public static String getRemarkTex() throws UiObjectNotFoundException {
        return getTex(ID_COUPONDETAILREMARK);
    }
}