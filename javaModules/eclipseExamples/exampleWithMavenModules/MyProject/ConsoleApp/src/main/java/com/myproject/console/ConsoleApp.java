package com.myproject.console;

import com.mycompany.common.CommonUtility;

public class ConsoleApp {
	public static void main(String[] args) {
		String appName = CommonUtility.getAppName();
		System.out.println("Welcome to " + appName);
	}
}
