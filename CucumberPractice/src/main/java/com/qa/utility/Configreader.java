package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	private Properties prop; 
	/** This method id used to load the properties from properties file
	* 
	* @return
	*/

	public Properties init_prop() {
	prop = new Properties();
	try {
	FileInputStream io = new FileInputStream(".src\\test\\resources\\config\\properties\\properties");
	prop.load(io);
	} catch (FileNotFoundException e) { 
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}

	return prop;
	}

	}


