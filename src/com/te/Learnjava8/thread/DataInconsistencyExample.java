package com.te.Learnjava8.thread;
 class Counter{
	 private int count=0;
//	 public synchronized void inrement()
	 public void inrement() {
	 synchronized (this){
		 count++;
	 }
	 }
	 public int getCount()
	 {
		 return count;
	 }
	 
 }

public class DataInconsistencyExample {
	public static void main(String[] args) throws InterruptedException {
		Counter counter=new Counter();
		Thread t1=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				counter.inrement();
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++)
			{
				counter.inrement();
			}
		});
		t1.start();
		t2.join();
		t2.start();
//		t1.join();
//		t2.join();
		System.out.println("final count "+counter.getCount());
	}

}
