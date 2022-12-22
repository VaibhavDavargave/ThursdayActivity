package com.Question2;

public class InSufficientBalanceException extends RuntimeException {

	private String message;
	public InSufficientBalanceException(String message)
	{
		this.message=message;
		
	}
	
	public InSufficientBalanceException(Throwable cause,String message)
	{
		super(cause);
		this.message=message;
	}
	
	public String getMessage()
	{
		return message;
	}
}
