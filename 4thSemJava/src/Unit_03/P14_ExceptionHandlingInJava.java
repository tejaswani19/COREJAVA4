package Unit_03;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Error & exception?
 * at the point of occurrence of error we cannot cover recover but we can recover the exception
 * if a program can handle a situation by itself-exception
 * checked exception
 * unchecked exception
 * 
 * terminal: javac sampleclass.java
 *           java sampleclass.java
 *           
 * try and catch block?
 * sensitive code in try block,else in catch
 * If a code is broken in try then will it always go in catch? : Depends on whether you have used exception catch 
   which will catch all the exceptions if any of it remains.
 * Multiple catch is possible only if parent class comes after child class exceptions.
 * Throws is used when it generates a warning that it will not catch the code.
 * Finally is used for code readability, and it would always run if the exception has occurred or not because if
   the exception comes it would run,  if exception does not come it  would run,
   and if it is caught then also it runs. 
 * Checked or compile time exceptions are those when complier knows that the exception is not handled and it 
   forces you to use try and catch.
 * If the compiler catches the exception at compile time then the program would not compile and then the compiler 
   forces you to use try and catch to avoid the exception.
 * If any exception bypasses the compiler process and break at run time then it is called run time exception
  
 */

public class P14_ExceptionHandlingInJava {
	
	public static void main(String args[])
	{
		ABCDE obj = new ABCDE();
		//obj.BasicException1();
		//obj.BasicException2();
		//obj.InputMismatchException();
		//obj.StackOverflow();
		//obj.IndexOutOfBoundException();
		//String newstring = null;
		//obj.NullPointerException(newstring);
		//obj.useOfThrow(15);
		//obj.useOfThrows_And_Finally();
		//obj.checkedAndUncheckedException();
		//obj.manualExceptionThrow();
		
	}
}

class ABCDE
{
	void BasicException1()
	{
		//sensitive code
		int a = 100/0;
		System.out.println(a);
		System.out.println("Yes Done!!");
	}
	
	void BasicException2()
	{
		try {
			
			//sensitive code
			int b=0;
			int a = 100/b;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	void MultipleCatch()
	{
		try {
			
			//sensitive code
			int b=0;
			int a = 100/b;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//java.util.InputMismatchException
	void InputMismatchException()
	{
		Scanner ob = new Scanner (System.in);
		try 
		{	
			int a = ob.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException e)
		{
			e.getMessage();
			System.out.println("Input Mismatch!!");
		}
		ob.close();
	}
	
	void StackOverflow()
	{
		//Error cannot be handled in any scenario only exception can be handled.
		try {

			//sensitive code
			int a=1;
			while(a>0)
			{
				a++;
				System.out.print(a+" ");
			}
			System.out.println("Overflow!!");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Overflow!!");
		}
	}
	
	void IndexOutOfBoundException()
	{
		try {

			//sensitive code
			int a[] = {1,2,3,4,5};
			for(int i=0;i<10;i++)
			System.out.print(a[i]+" ");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void NullPointerException(String str)
	{
		try {
			System.out.println(str.length());
		}

		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void useOfThrow(int age) throws Exception, ArithmeticException, IOException
	{

		if (age < 18)
		{
			throw new Exception();
		} 
		else 
		{
			System.out.println("You are allowed to enter");
		}

	}

	/*
	 * Sometime you don't need to handle the Exception When in multi chain calling
	 * is there, then it can be handled by the supper most method then inner methods
	 * need not to handle it there
	 */
	
	void useOfThrows_And_Finally() 
	{

		try 
		{
			useOfThrow(17);
		} 
		catch (ArithmeticException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void checkedAndUncheckedException() 
	{

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try 
		{
			useOfThrow(19);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void manualExceptionThrow() 
	{

		try 
		{

			// Have to use try and Catch here!
			calculateArea(-1);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	void calculateArea(int r) throws ManualException 
	{
		if (r < 0) 
		{
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);
	}
}

@SuppressWarnings("serial")
class ManualException extends Exception 
{
	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}
}