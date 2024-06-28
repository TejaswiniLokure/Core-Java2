package com.te.Learnjava8.exception;

class VotingEligibilityException extends Exception {
	 public VotingEligibilityException(String message) {
		 super(message);
	 }
}

public class VotingEligibility {
	public static void main(String[] args) {
		int age;
		try {
			CheckVotingEligibility(2);
		}
		catch(VotingEligibilityException e)
		{
			System.err.println(e.getMessage());
		}
		
	}

	private static void CheckVotingEligibility(int age) throws VotingEligibilityException  {
		// TODO Auto-generated method stub
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else {
			throw new VotingEligibilityException(" is not eligible to vote");
		}
	}
	

}
