package com.te.Learnjava8.exception;

public class bankBalanceChecking extends RuntimeException { //it is unchecked exception
  public bankBalanceChecking(String message)
  {
	  super(message);
  }
}
