package Assignment_01;

public class Ques_02 {
	public static void main(String[] args) {
		
		ABC obj1=new ABC();
		ABC obj2=new ABC();
		ABC obj3=new ABC();
		
		obj1.function();
		obj2.function();
		obj3.function();
		//get result
		obj3.print_count();
	}

}

class ABC
{
	static int count = 0;
	
	void function()
	{
		count++;
	}
	void print_count()
	{
		System.out.println("Number of times 'function' called: "+count);
	}
}