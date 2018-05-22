package projects.wlye.pages;

import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/21 16:43
 * Description:工会服务页面元素以及相关元素的操作
 */

public class UnionPages extends VP2{

    public static String ID_UNION = "com.staff.wuliangye:id/rb_msg";//工会服务的button id
    public static String ID_INFORMATION = "com.staff.wuliangye:id/ll_activity";//咨询的ID，但是并不能获取相应的text，需要get child().text="资讯"或者index=0
    public static String ID_SERVICE = "com.staff.wuliangye:id/ll_news";//服务的ID，但是并不能获取相应的text，需要get child().text="服务"或者index=0

    /**
     *获取“资讯”两个字
     *@author jianbin.zhong
     *@time 2018/5/21 16:56
     */
    public static String getInformationTex() throws UiObjectNotFoundException {
        return getObjectById(ID_INFORMATION).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *判断资讯下的光标是否存在
     *@author jianbin.zhong
     *@time 2018/5/21 17:08
     */
    public static boolean isInformationCursor() throws UiObjectNotFoundException {
        if (getObjectById(ID_INFORMATION).getChild(new UiSelector().index(1)).exists()){
            return true;
        }else {
            return false;
        }
    }

    /**
     *点击资讯
     *@author jianbin.zhong
     *@time 2018/5/21 17:00
     */
    public static void clickInformation() throws UiObjectNotFoundException {
        getObjectById(ID_INFORMATION).getChild(new UiSelector().index(0)).click();
    }

    /**
     *跳转到“资讯”两个字
     *@author jianbin.zhong
     *@time 2018/5/21 17:02
     */
    public static void navToInformation() throws UiObjectNotFoundException {
        getObjectById(ID_INFORMATION).getChild(new UiSelector().index(0)).click();
    }

    /**
     *获取“服务”两个字
     *@author jianbin.zhong
     *@time 2018/5/21 17:05
     */
    public static String getServerTex() throws UiObjectNotFoundException {
        return getObjectById(ID_SERVICE).getChild(new UiSelector().index(0)).getText();
    }

    /**
     *点击服务
     *@author jianbin.zhong
     *@time 2018/5/21 17:06
     */
    public static void clickService() throws UiObjectNotFoundException {
        getObjectById(ID_SERVICE).getChild(new UiSelector().index(0)).click();
    }

    /**
     *跳转到服务界面
     *@author jianbin.zhong
     *@time 2018/5/21 17:11
     */
    public static void navToService() throws UiObjectNotFoundException {
        getObjectById(ID_SERVICE).getChild(new UiSelector().index(0)).click();
    }

    /**
     *判断服务下的光标是否存在
     *@author jianbin.zhong
     *@time 2018/5/21 17:13
     */
    public static boolean isServiceCursor() throws UiObjectNotFoundException {
        if (getObjectById(ID_SERVICE).getChild(new UiSelector().index(1)).exists()){
            return true;
        }else {
            return false;
        }
    }

}