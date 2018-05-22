package projects.wlye.utils;

import android.content.res.AssetManager;
import android.os.Environment;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import helper.base.VP2;

/**
 * Author:jianbin.zhong
 * Date: 2018/5/16 14:38
 * Description:
 */

//notes:暂时未找到读取Properties文件的方法，此类暂时无法使用
public class PropertiesUtils extends VP2{

    private static Logger logger = Logger.getLogger(PropertiesUtils.class.getName());
    public static String filePath = "wlye.properties";

    /**
     *获取配置文件下的用户名
     *@author jianbin.zhong
     *@time 2018/5/16 15:14
     */
    public static String getUserName(){
        String config= Environment.getExternalStorageDirectory()+ File.separator+"wlye.properties";
        logger.info("file path: "+config);
        return getValue(config, "USERNAME");
    }

    /**
     *获取配置文件下的电话号码
     *@author jianbin.zhong
     *@time 2018/5/16 15:16
     */
    public static String getPhoneNumber(){
        return getValue(filePath, "PHONENUMBER");
    }

    /**
     *获取配置文件下的机关分会
     *@author jianbin.zhong
     *@time 2018/5/16 15:17
     */
    public static String getBranch(){
        return getValue(filePath, "BRANCH");
    }

/*    *//**
     *读取配置文件filepath，并取出key对应的value值
     *@author jianbin.zhong
     *@time 2018/5/16 15:21
     *//*
    public static String getValue(String filePath, String key) {
        String value = null;
        Properties properties = new Properties();
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            properties.load(bufferedReader);
            value = properties.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }*/

   /* public static String getValue(String filePath, String key) {
        String value = null;
        Properties properties = new Properties();
        try {
            properties.load(context.getClass().getClassLoader().getResourceAsStream(filePath));
            value = properties.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }*/

    public static String getValue(String filePath, String key){
        Properties pps = new Properties();
        File file=new File(filePath);
        if (file.exists()){
            try {
                InputStream in = new BufferedInputStream(new FileInputStream(filePath));
                pps.load(in);
                String value = pps.getProperty(key);
                System.out.println(key + " = " + value);
                return value;
            }catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }else{
            return null;
        }
    }

}