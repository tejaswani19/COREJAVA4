package Assignment_01;
import java.util.Scanner;

public class Ques_06 {
public static void main(String[] args) {
		
		SumSub obj  = new SumSub();
		Scanner ob = new Scanner(System.in);
		int a = ob.nextInt();
		int b = ob.nextInt();
		
		a = (a > b)?obj.add(a, b):obj.sub(a, b);
		System.out.println("The result is: "+a);
	}

}


class SumSub
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