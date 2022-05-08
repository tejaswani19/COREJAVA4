package Assignment_01;

import java.util.Scanner;
public class Ques_05 {

	public static void main(String[] args) {
		
		Employee arr[] = new Employee[8];
		String n;int a;String d;int s;
		int total_A_sal = 0;
		int total_B_sal = 0;
		int total_C_sal = 0;
		int total_D_sal = 0;
		Scanner ob = new Scanner(System.in);
		for(int i = 0; i < 8; i++)
		{
			n = ob.next();
			a = ob.nextInt();
			d = ob.next();
			s = ob.nextInt();
			arr[i] = new Employee(n, a, d, s);
			
			if(arr[i].department.equals("A"))
					total_A_sal+=arr[i].salary;
			if(arr[i].department.equals("B"))
					total_B_sal+=arr[i].salary;
			if(arr[i].department.equals("C"))
					total_C_sal+=arr[i].salary;
			if(arr[i].department.equals("D"))
					total_D_sal+=arr[i].salary;
			
		}
		//print total salary
		System.out.println("Salary of Department A: "+total_A_sal);
		System.out.println("Salary of Department B: "+total_B_sal);
		System.out.println("Salary of Department C: "+total_C_sal);
		System.out.println("Salary of Department D: "+total_D_sal);
	}

}

class Employee
{
	String name;
	int age;
	String department;
	int salary;
	
	Employee()
	{
		//Default one
	}
	Employee(String n, int a, String d, int s)
	{
		name = n;
		age = a;
		department = d;
		if(s > 30000)
		{
			salary = 25000;
		}
		else
		{
			salary = s;
		}
	}
	
}