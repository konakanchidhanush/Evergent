package com.evergent.CoreJAVA.ExceptionHandelings;
class ExcesiveCoffeeConsumedException extends RuntimeException
{
	protected int cups;

	ExcesiveCoffeeConsumedException(String message)
	{
		System.out.println("You have consumed so much coffee!!!!!Have a break"+message);
	}
	ExcesiveCoffeeConsumedException(int cups)
	{
		this.cups=cups;
	}

}
public class OmCoffee {
	protected int cups=5;
public void myData() throws ExcesiveCoffeeConsumedException
{
	if(cups>=5)
	{
		throw new ExcesiveCoffeeConsumedException("hello");
	}
	else
	{
		System.out.println("You have saved office property!!");
	}
}
	public static void main(String[] args) {
		try
		{
			OmCoffee a = new OmCoffee();
			a.myData();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
