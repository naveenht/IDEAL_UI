package com.ideal.constants;

public final class IdealConstants {
	
	private IdealConstants() {
		
	}
	
	private static final String RESOURCESPATH =System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH =RESOURCESPATH+"/executables/chromedriver.exe";
	private static final String CONFIGPATH =RESOURCESPATH+"/config/config.properties";
	public static final int EXPLICITWAIT=10;
	
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}

	public static String getConfigFilepath() {
		return CONFIGPATH;
	}

}
