/**
 * @author :Pramila0526
 * Date    :14/11/2019
 *  
 */

package com.bridgelabz.exceptionhandling;
import java.io.IOException;
import java.util.*;

public class Program3 
{
  public static void main(String[] args) throws IOException
	{
	 int i=8;
	 try(Scanner sc1=new Scanner(System.in)) 
	 //when we are creating this type of 
     //try block we need not to worry 
     //about close the resources 
     //try works to close all the resources
	 
	 {
	 int k;
	 System.out.println("Enter a number");
	 int j=sc1.nextInt();
	 k=i/j;
     System.out.println(k);
	 }
	 }
} 
