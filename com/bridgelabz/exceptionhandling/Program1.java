/**
 * @author :Pramila0526
 * Date    :14/11/2019
 *  
 */

package com.bridgelabz.exceptionhandling;

public class Program1 
{
   public static void main(String[] args) 
	{
		int j=0;
		int i=8;
		int k=0;
		try
		{
			 k=i/j;	
			 System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide by zero " +e);
		}
	    catch(Exception e) 
		//This exception is used when we do not know
	    //the exact type of exception.This should be written in the end
		{
	     System.out.println("Unknown Exception");
		}
		System.out.println(k);
     }

}
