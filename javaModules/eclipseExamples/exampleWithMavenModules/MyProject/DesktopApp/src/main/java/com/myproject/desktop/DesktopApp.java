package com.myproject.desktop;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import com.mycompany.common.CommonUtility;

public class DesktopApp extends JFrame {
	static String appName = CommonUtility.getAppName();

	public DesktopApp() {
		super(appName);
		init();
	}

	private void init() {
		setLayout(new FlowLayout());
		add(new JLabel("Welcome to " + appName));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 480);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new DesktopApp().setVisible(true);
			}
		});
	}
}
