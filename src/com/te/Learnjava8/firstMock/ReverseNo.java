package com.te.Learnjava8.firstMock;

public class ReverseNo {
	public static void main(String[] args) {
		int no=12345;
		int rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
	}

}
