package utilities;

import drivers.BaseDriver;

public class CommonMethods extends BaseDriver {
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}
 
}
