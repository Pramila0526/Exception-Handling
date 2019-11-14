/**
 * @author :Pramila0526
 * Date    :14/11/2019
 *  
 */

package com.bridgelabz.exceptionhandling;
public class Program4 
{
public static void main(String args[])
{
	int i=5;
	try
	{
		if(i<10) 
		{
			throw new Exception("Error"); //or only /throw new Exception();
		}
	}	
		catch(Exception e)
		{
			System.out.println(e);
	    }
	}
}
