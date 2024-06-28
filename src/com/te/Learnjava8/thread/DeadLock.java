package com.te.Learnjava8.thread;
class Resource01{
	public synchronized void resource01(Resource02 r2)
	{
		System.out.println("using resource02");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		r2.resource02(this);
		System.out.println("resource02 resource executed");
	}
}
class Resource02
{
	public synchronized void resource02(Resource01 r1)
	{
		System.out.println("using resource01");
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		r1.resource01(this);
		System.out.println("resource02 resource executed");
	}
	
}

public class DeadLock {
	public static void main(String[] args) {
		Resource01 resource01=new Resource01();
		Resource02 resource02=new Resource02();
		Thread thread1=new Thread(()-> resource01.resource01(resource02));
		Thread thread2=new Thread(()-> resource02.resource02(resource01));
		thread1.start();
		thread2.start();
	}

}
