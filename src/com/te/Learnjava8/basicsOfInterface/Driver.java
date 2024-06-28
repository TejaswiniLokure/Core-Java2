package com.te.Learnjava8.basicsOfInterface;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter osType");

		String osType = sc.next();
		// MiuiOS miuiOS=new MiuiOS();
		// OxygenOS oxygenOS=new OxygenOS();
		// FuntouchOS funtouchOS=new FuntouchOS();
		AndroidOS android = Helpercls.helper(osType);
		android.camara();
		android.photoEdit();
		android.selfie();

	}

}
