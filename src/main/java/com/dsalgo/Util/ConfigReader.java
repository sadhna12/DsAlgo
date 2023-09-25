package com.dsalgo.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	// this method is used to load properties file
	// @return properties prop object
	private Properties prop;

	public Properties init_prp() {
		prop = new Properties();
		try {
			System.out.println("Inside properties class");
			FileInputStream ip = new FileInputStream("src\\test\\resources\\config\\config.properties");
			prop.load(ip);

		}

		catch (FileNotFoundException e) {
			// TODO Auto-geerated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
