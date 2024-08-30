package com.evergent.CoreJAVA.ExceptionHandelings;

class UnsufficientFundsException extends Exception
{
	UnsufficientFundsException(String message)
	{
		super(message);
	}
}
public class UnsufficientFundsExceptionDemo11 {

	public static void funds(int amount) throws UnsufficientFundsException
	{
		if(amount>500)
		{
			throw new UnsufficientFundsException("Insufficinet funds");
		}
		else
		{
			System.out.println("Matter is cleard ");
		}
	}
	public static void main(String[] args) {
try {
	funds(4000);
}
catch(UnsufficientFundsException e)
{
	System.out.println("its ok sometimes happens"+e.getMessage());
}
	}
}
	
