package com.te.Learnjava8.thread;

public class LearnThread1 {
	public static void main(String[] args) {
		Thread thread=	new Thread();
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		
	}

}
