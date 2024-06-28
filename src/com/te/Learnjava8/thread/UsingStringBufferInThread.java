package com.te.Learnjava8.thread;

class Thread1 extends Thread {
	private StringBuffer stringbuffer;

	public StringBuffer getStringbuffer() {
		return stringbuffer;
	}

	@Override
	public void run() {
		System.out.println("Thread1 starts");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread1 stop");
	}

}

class Thread2 implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread2 starts");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread2 stop");

	}

}

public class UsingStringBufferInThread {
	public static void main(String[] args) {
		Thread1 thread = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread thread3 = new Thread(thread2);
		thread.start();
		thread3.start();

	}

}
