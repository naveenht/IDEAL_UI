package com.ideal.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.ideal.constants.IdealConstants;

public class ReadPropertyFiles {
	
	private ReadPropertyFiles() {
		
	}
	
	private static 	Properties property = new Properties();
	private static final Map<String,String> CONFIGMAP = new HashMap<>();
		
	static {
		try {
		FileInputStream file = new FileInputStream(IdealConstants.getConfigFilepath());
		property.load(file);
		
		//normal loop 
		/*
		 * for(Object key: property.keySet()) { CONFIGMAP.put(String.valueOf(key),
		 * String.valueOf(property.get(key))); }
		 */
		//Entryset loop for better useful
		
			for(Map.Entry<Object,Object> entry: property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
		
			//Using lambda for loop
		//	property.entrySet().forEach(entry ->CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Use below method if the property file is huge
	public static String get(String key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key))) {
			throw new Exception("Property name "+key+" is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key);
		
	}
	
	public static String getValue(String key) throws Exception {
		if(Objects.isNull(property.getProperty(key))||Objects.isNull(key)) {
			throw new Exception("Property name "+key+" is not found. Please check config.properties");
		}
		return property.getProperty(key);
		
	}

}
