package projects.wlye.pages.subpages.submypages;

import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/24 9:27
 * Description:
 */

public class SafetyPage extends VP2 {

    public static String ID_BACK = "com.staff.wuliangye:id/title_left_btn";
    public static String ID_TITLE = "com.staff.wuliangye:id/title";
    public static String ID_SETPAY = "com.staff.wuliangye:id/st_pay";
    public static String ID_SETPWD = "com.staff.wuliangye:id/tv_setting";
    public static String ID_FORGETPWD = "com.staff.wuliangye:id/tv_forget";
    public static String ID_LOGOUT = "com.staff.wuliangye:id/btn_logout";

    public static String ID_ALL = "android:id/content";//整个界面的ID
    //修改支付密码
    public static String ID_DESC = "com.staff.wuliangye:id/tv_desc";
    public static String ID_PWDVISIABLE = "com.staff.wuliangye:id/cbx_visible";
    public static String ID_NEXTCOMMIT = "com.staff.wuliangye:id/next_commit";
    public static String ID_PWDTEX = "com.staff.wuliangye:id/tv_text";
    //忘记支付密码
    public static String ID_LOGINFORM = "com.staff.wuliangye:id/email_login_form";
    public static String ID_CARD = "com.staff.wuliangye:id/et_id_card";
    public static String ID_NEXT = "com.staff.wuliangye:id/btn_next";
    //alter
    public static String ID_ALTERTITLE = "com.staff.wuliangye:id/alertTitle";
    public static String ID_MSG = "android:id/message";
    public static String ID_CANCLE = "android:id/button2";
    public static String ID_CONFIRM = "android:id/button1";

    /**
     *返回上级目录
     *@author jianbin.zhong
     *@time 2018/5/24 9:58
     */
    public static void clickBack(){
        clickById(ID_BACK);
    }

    /**
     *获取title
     *@author jianbin.zhong
     *@time 2018/5/24 10:00
     */
    public static String getTitle() throws UiObjectNotFoundException {
        return getTex(ID_TITLE);
    }

    /**
     *获取免密支付的描述和说明目录
     *@author jianbin.zhong
     *@time 2018/5/24 10:13
     */
    public static UiObject getNoPwdObject() throws UiObjectNotFoundException {
        UiObject couponUiobject = null;
        couponUiobject = getObjectById(ID_ALL).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(2)).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(0)).getChild(new UiSelector().index(0));
        return couponUiobject;
    }

    /**
     *获取“免密支付”四个字
     *@author jianbin.zhong
     *@time 2018/5/24 10:15
     */
    public static String getNoPwdContent() throws UiObjectNotFoundException {
        return getNoPwdObject().getChild(new UiSelector().index(0)).getText();
    }

    /**
     *获取免密支付的描述
     *@author jianbin.zhong
     *@time 2018/5/24 10:17
     */
    public static String getNoPwdDesc() throws UiObjectNotFoundException {
        return getNoPwdObject().getChild(new UiSelector().index(1)).getText();
    }

    /**
     *设置免密支付开关
     *@author jianbin.zhong
     *@time 2018/5/24 10:02
     */
    public static void setPay(){
        clickById(ID_SETPAY);
    }

    /**
     *进入到修改密码界面
     *@author jianbin.zhong
     *@time 2018/5/24 10:03
     */
    public static void navToChangePwd(){
        clickById(ID_SETPWD);
    }
    /**
     *获取“输入支付密码，完成身份验证”几个字
     *@author jianbin.zhong
     *@time 2018/5/24 10:20
     */
    public static String getChangePwdDesc() throws UiObjectNotFoundException {
        return getTex(ID_DESC);
    }



    /**
     *获取“显示密码”几个字
     *@author jianbin.zhong
     *@time 2018/5/24 10:39
     */
    public static String getVisiablePwd() throws UiObjectNotFoundException {
        return getTex(ID_PWDVISIABLE);
    }

    /**
     *点击显示密码
     *@author jianbin.zhong
     *@time 2018/5/24 10:43
     */
    public static void clickVisiablePwd(){
        clickById(ID_PWDVISIABLE);
    }

    /**
     *获取前limit个的密码,索引1开头,如要获取全部的密码，limit=6
     *@author jianbin.zhong
     *@time 2018/5/24 10:54
     */
    public static String getPwd(int limit) throws UiObjectNotFoundException {
        String pwd = null;
        StringBuffer sb = new StringBuffer(null);
        for(int i=1; i<= limit; i++){
            sb.append(getIndexPwd(i));
        }
        return sb.toString();
    }

    /**
     *获取第index个空格的密码
     *@author jianbin.zhong
     *@time 2018/5/24 10:52
     */
    public static String getIndexPwd(int index) throws UiObjectNotFoundException {
        return getTex(ID_PWDTEX+String.valueOf(index));
    }

    /**
     *点击选中密码框，才可以输入密码
     *@author jianbin.zhong
     *@time 2018/5/24 11:04
     */
    public static void clickInputPwd(){
        clickById(ID_PWDTEX+"1");
    }

    /**
     *输入密码
     *@author jianbin.zhong
     *@time 2018/5/24 11:23
     */
    public static void inputPwd(String pwd) throws UiObjectNotFoundException {
        int len =pwd.length();
        for (int i=1, j=0; i <= len; i++, j++){
            setText(ID_PWDTEX+String.valueOf(i),pwd.substring(j,i));
        }
    }

    /**
     *点击下一步
     *@author jianbin.zhong
     *@time 2018/5/24 10:44
     */
    public static void clickNextCommit(){
        clickById(ID_NEXTCOMMIT);
    }

    /**
     *获取“下一步”几个字
     *@author jianbin.zhong
     *@time 2018/5/24 10:45
     */
    public static String getNextCommitTex() throws UiObjectNotFoundException {
        return getTex(ID_NEXTCOMMIT);
    }

    /**
     *进入到忘记密码界面
     *@author jianbin.zhong
     *@time 2018/5/24 10:03
     */
    public static void navToForgetPwd(){
        clickById(ID_FORGETPWD);
    }

    /**
     *点击退出
     *@author jianbin.zhong
     *@time 2018/5/24 10:04
     */
    public static void clickLogout(){
        clickById(ID_LOGOUT);
    }
}