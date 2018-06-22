package projects.wlye.pages.subpages.submainpages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/6/21 16:27
 * Description:现金红包界面
 */

public class BJPage extends VP2{

    public static String ID_TITLE = "com.staff.wuliangye:id/title";//title “现金红包”
    public static String ID_LEFT = "com.staff.wuliangye:id/rl_left";//返回
    public static String ID_TIPS = "com.staff.wuliangye:id/iv_tips";//红包说明"?"
    public static String ID_KNOW = "com.staff.wuliangye:id/btn_know";//红包说明里的我知道了
    public static String ID_WEBVIEW = "com.staff.wuliangye:id/webview";//H5,红包说明内容
    public static String ID_HBNO = "com.staff.wuliangye:id/tv_no";//红包数量
    public static String ID_MONEY = "com.staff.wuliangye:id/tv_money";//金额
    public static String ID_NOMSG = "com.staff.wuliangye:id/tv_no_message";//暂无红包
    public static String ID_LV = "com.staff.wuliangye:id/lv";

    /**
     *获取“现金红包”title四个字
     *@author jianbin.zhong
     *@time 2018/6/21 16:38
     */
    public static String getTitleTex() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *离开现金红包界面
     *@author jianbin.zhong
     *@time 2018/6/21 16:38
     */
    public static void clickLeft(){
        clickById(ID_LEFT);
    }

    /**
     *点击查看红包说明
     *@author jianbin.zhong
     *@time 2018/6/21 16:40
     */
    public static void clickTips(){
        clickById(ID_TIPS);
    }

    /**
     *点击现金红包说明里的“我知道了”
     *@author jianbin.zhong
     *@time 2018/6/21 16:45
     */
    public static void clickKnow(){
        clickById(ID_KNOW);
    }

    /**
     *获取“我知道了”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 16:46
     */
    public static String getKnowTex() throws UiObjectNotFoundException {
        return getTex(ID_KNOW);
    }

    /**
     *获取现金红包说明的所有h5文字
     *@author jianbin.zhong
     *@time 2018/6/21 16:48
     */
    public static String getExplainTex() throws UiObjectNotFoundException {
        //此方法未验证，慎用
        return getTex(ID_WEBVIEW);
    }

    /**
     *获取红包数量
     *@author jianbin.zhong
     *@time 2018/6/21 16:53
     */
    public static String getHbno() throws UiObjectNotFoundException {
        return getTex(ID_HBNO);
    }

    /**
     *获取“X.XX元”
     *@author jianbin.zhong
     *@time 2018/6/21 16:54
     */
    public static String getMoney() throws UiObjectNotFoundException {
        return getTex(ID_MONEY);
    }

    /**
     *获取“现金红包次日到账”几个字
     *@author jianbin.zhong
     *@time 2018/6/21 16:52
     */
    public static String getDaoZhangTex() throws UiObjectNotFoundException {
        return getObjectById(ID_LV).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(1)).getText();
    }

    /**
     *获取“暂无红包”四个字
     *@author jianbin.zhong
     *@time 2018/6/21 16:55
     */
    public static String getNoMsgTex() throws UiObjectNotFoundException {
        return getTex(ID_NOMSG);
    }
}