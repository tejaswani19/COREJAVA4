package Assignment_01;
import java.util.Scanner;

public class Ques_11 {
	public static void main(String[] args) {
		
		Arithmetic obj  = new Arithmetic();
		Scanner ob = new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		
		a = (a > b)?obj.add(a, b):obj.sub(a, b);
		System.out.println("The result is: "+a);
	}
}


class Arithmetic
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	int sub(int a, int b)
	{
		int res = a - b;
		if(res < 0)
		{
			return 0;
		}
		return res;
	}
}
