/**
 * @author :Pramila0526
 * Date    :14/11/2019
 *  
 */

package com.bridgelabz.exceptionhandling;
public class Program2 
{
  public static void main(String[] args) 
	{
		int i=8;
		int a[]=new int[4];
		int k=0;
	   	int j=2;
		try
		{
		     k=i/j;
			
			for(int c=0;c<=2;c++)
			{
				a[k]=k+1;
			}
			for(int value:a )
			{
				System.out.println(value);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide by zero" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Minimum value is 4 " +e);
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception" +e);
		}
		
	   }
	}


