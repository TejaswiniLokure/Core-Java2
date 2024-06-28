package com.te.Learnjava8.exception;


public class Voting {
	public static void main(String[] args) {
		int age;
		try
		{
			checkVotingAge(30);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	private static void checkVotingAge( int age) throws Exception {
		// TODO Auto-generated method stub
		
		if(age>=18)
		{
			throw new Exception("Voter is eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	

}
