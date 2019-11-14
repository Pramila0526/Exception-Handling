package com.bridgelabz.exceptionhandling;

public class Program5
{

	public static void main(String[] args) 
	{
	
	try
	{
		int k=5;
		if(k<10)
		{
			throw new  MyException("Errorrrr");
			
		}
		System.out.println(k);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	}
	 class MyException extends Exception
	{
	  
	private static final long serialVersionUID = 1L;  //by default

	public MyException(String msg)
		{
			super(msg);
		}
	}

