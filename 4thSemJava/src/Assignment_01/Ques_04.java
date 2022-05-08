package Assignment_01;

public class Ques_04 {
	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);
		ClassThree obj1 = new ClassThree();

	}

}

class ClassOne
{
	ClassOne(int x)
	{
		System.out.println("Inside Class One (x =  "+x+")");
	}
}

class ClassTwo extends ClassOne
{
	ClassTwo()
	{
		super(10); // calls the constructor of ClassOne
		System.out.println("Inside Class Two");
	}
}

class ClassThree extends ClassTwo
{
	ClassThree(int y)
	{
		
		System.out.println("Inside Class Three (y = "+y+")");
	}
	ClassThree()
	{
		
		System.out.println("Inside Class Three (Default)");
	}
	
}