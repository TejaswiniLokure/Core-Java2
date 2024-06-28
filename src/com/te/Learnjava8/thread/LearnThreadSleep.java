package com.te.Learnjava8.thread;

public class LearnThreadSleep {
	public static void leftTreadSleep(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			leftTreadSleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ends");
		
	}

}
