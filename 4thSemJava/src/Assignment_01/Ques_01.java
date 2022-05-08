package Assignment_01;

public class Ques_01 {


	public static void main(String[] args) {
		Student obj1 = new Student("Abhay", 18, 'A', 82);
		Student obj2 = new Student("Bhavesh", 19, 'A', 77);
		Student obj3 = new Student("Chanu", 22, 'A', 78);
		Student obj4 = new Student("Deepak", 20, 'A', 58);
		Student obj5 = new Student("Ekta", 19, 'A', 34);
		Student obj6 = new Student("Fatima", 18, 'A', 98);
		//Getting the result 
		Student result = new Student();
		result.get_avg();
		

	}

}

class Student
{
	String name;
	int age;
	char Section;
	int percentage; //assuming percentage to be discrete value
	static int avg_per = 0;
	
	Student()
	{
		age = 0;
		percentage = 0;
	}
	Student(String s, int a, char sec, int per) // Constructor name should be equal to class name
	{
		name = s;
		age = a;
		Section = sec;
		percentage = per;
		avg_per += per;
	}
	
	void get_avg()
	{
		int average = avg_per/6;
		System.out.println("Average is "+average+"%"); 
	}
}