package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/22 14:35
 * Description:专项基金界面
 */

public class SpecialPage extends VP2 {

    public static String ID_SPECIALBACKMY = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_TITLE = "com.staff.wuliangye:id/title";
    public static String ID_BILL = "com.staff.wuliangye:id/title_right_txt";
    public static String ID_NOMSG = "com.staff.wuliangye:id/tv_no_message";
    public static String ID_CONTENT = "android:id/content";

    /**
     *专项资金界面返回到我的界面
     *@author jianbin.zhong
     *@time 2018/5/23 9:59
     */
    public static void specialBackMy(){
        clickById(ID_SPECIALBACKMY);
    }

    /**
     *获取专项资金的title
     *@author jianbin.zhong
     *@time 2018/5/23 10:00
     */
    public static String getSpecialTitle() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *获取“账单”两个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:01
     */
    public static String getBillTex() throws UiObjectNotFoundException {
        return getTex(ID_BILL);
    }

    /**
     *进入“账单”界面
     *@author jianbin.zhong
     *@time 2018/5/23 10:02
     */
    public static void navToBill(){
        clickById(ID_BILL);
    }

    /**
     *获取“暂无专项资金”几个字
     *@author jianbin.zhong
     *@time 2018/5/23 10:04
     */
    public static String getNoMsgTex() throws UiObjectNotFoundException {
        return getTex(ID_NOMSG);
    }
    
    /**
     *获取专项资金描述
     *@author jianbin.zhong
     *@time 2018/5/23 10:08
     */
    public static String getSpecialDescTex() throws UiObjectNotFoundException {
        return getObjectById(ID_CONTENT).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(2)).getText();
    }

}