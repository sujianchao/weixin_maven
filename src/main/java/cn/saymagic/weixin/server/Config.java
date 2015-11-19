package cn.saymagic.weixin.server;

import cn.saymagic.weixin.server.util.MsicUtil;

public class Config {
	
	/** 微信公众号的名称*/
	private static final String NAME="CMSYUN";

	/** 微信公众号的token，用于验证之用*/
	private static final String TOKEN = "cmsyun";
	
	/** 图灵机器人的APPKEY，可在图灵官方申请*/
	private static final String APIKEY = "52c2da11fd197974128a47dfc7058f54"; 
	
    /** 欢迎语 */
	private static final String WELCOME = "欢迎访问CMS云平台：CMSYUN——微营销系统·微信营销，如此简单！";
    
	/** 微信公众号后台APPID */
	private static final String APPID = "";

	/** 微信公众号后台APPSECRET */
	private static final String APPSECRET = "";
	
	public static String getName(){
		return System.getProperty("NAME", NAME);
	}
     
    public static String getToken(){
    	return System.getProperty("TOKREN", TOKEN);
    }
    
    public static String getAPIKey(){
    	return System.getProperty("APIKEY", APIKEY);
    }
    
    public static String getWelcome(){
    	return System.getProperty("WELCOME", WELCOME);
    }
    
    
    public static String getAPPID(){
    	return System.getProperty("APPID", APPID);
    }
    
    public static String getAPPSecret(){
    	return System.getProperty("APPSECRET", APPSECRET);
    }
}