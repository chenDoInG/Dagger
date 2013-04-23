package com.netease.demo;

import com.netease.imagecheck.ImageProcess;
import com.netease.dagger.BrowserEmulator;
/**
 * The demo shows how to use inage contrast to check page style
 * @author Lingfei
 */
public class CheckPageStyle {
	public static void main(String[] args) throws Exception {
		String githubUrl = "https://github.com/";
		String checkPoint = "topbar";
		String folderName = "github";	
		BrowserEmulator be = new BrowserEmulator();
		be.open(githubUrl);//change url to https://github.com/login for contrast, remember change ScreenShotType to 2 in type.properties
		ImageProcess.process(be.getBrowserCore(), folderName, checkPoint, "//div[@class='container clearfix']");
		be.quit();
	}
}
