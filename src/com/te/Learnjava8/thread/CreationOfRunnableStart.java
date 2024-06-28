package com.te.Learnjava8.thread;
class MyThread extends Thread
{
	void task()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("threadclass");
		}
	}
	@Override
	public void run()
	{
		task();
	}
}
class MyRunnabelThread implements Runnable
{
	void task()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("runnable"+i);
		}
	}
	@Override
	public void run()
	{
		task();
	}
}

public class CreationOfRunnableStart {
	public static void main(String[] args) {
		//creating a thread using thread class
//		 MyThread mythread= new  MyThread();
////		//creating a thread using runnable interface
//     	Thread runnableThread =new Thread(new MyRunnabelThread () );
//		//using Lambda expression for runnable interface
		Runnable runnableLambdaThread=()->{
		for(int i=0;i<=20;i++)
		{
			System.out.println("lambda"+i);
		}			
		};
//		new Thread(runnableLambdaThread.start());
//		Thread lambdaThread=new Thread(runnableLambdaThread);
//		mythread.start();
//    	runnableThread.start();
//		lambdaThread.start();
		
		
	}

}
