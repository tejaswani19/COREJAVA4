package Assignment_01;

import java.util.Scanner;
public class Ques_03 {
	public static void main(String[] args) {
		
		testClass obj = new testClass();
		obj.display();

	}

}

interface In1
{
	void display();
}

class testClass implements In1
{
	public void display()
	{
		Scanner ob = new Scanner(System.in);
		int p = ob.nextInt();
		int i,m=0,flag=0;      
		m=p/2;      
		if(p==0||p==1)
			System.out.println(p+" is not prime number");      
		else
		{  
			for(i=2;i<=m;i++)
			{      
				if(p%i==0)
				{      
					System.out.println(p+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(p+" is prime number"); }  
		}
	}
}