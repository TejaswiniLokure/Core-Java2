package com.te.Learnjava8.thread;

class Sample1 extends Thread {
	public void run() {
		for(int i=0;i<=3;i++)
		{
			System.out.println("first thread is running");	
		}
		
	}
}
class Sample2 extends Thread{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("second thread is running");	
		}
		
	}
}

public class Threadmain {
	public static void main(String[] args) {
		Sample1 samp1=new Sample1();
		Sample2 samp2=new Sample2();
//	    samp1.start();
//	    samp2.start();
        samp1.run();
	}
}
