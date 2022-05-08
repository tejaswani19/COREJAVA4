package Assignment_01;

public class Ques_07 {
	public static void main(String[] args) {
		// count of object created 
		// count of display() method called
		Employee1 obj1 = new Employee1();
		Employee1 obj2 = new Employee1();
		Employee1 obj3 = new Employee1();
		Employee1 obj4 = new Employee1();
		obj2.display();
		obj3.display();
		obj4.display();
		Employee1 obj5 = new Employee1();
		obj5.print();
	}
}

class Employee1
{
	static int object_count = 0;
	static int method_count = 0;
	Employee1()
	{
		object_count ++;
	}
	
	void display()
	{
		method_count++;
	}
	
	void print()
	{
		System.out.println("Object count "+ object_count + "\nMethod count "+method_count);
	}
}