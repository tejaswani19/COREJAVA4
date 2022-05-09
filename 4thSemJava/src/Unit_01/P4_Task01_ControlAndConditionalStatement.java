package Unit_01;

/*
# Control Statements and Conditional Statements:
- Java provides three types of control flow statetments.
- Decision Making Statements
   - if Statement
   - switch statement
- Loop statements
   - do while loop
   - while loop 
   - for loop 
   - for-each loop 
- Jump statements
   - break statement
   - continue statement
*/

public class P4_Task01_ControlAndConditionalStatement {
	public static void main(String[] args) {
		Statement obj = new Statement();
		
		obj.DecisionMakingStatement();
		obj.LoopStatement();
		obj.JumpStatement();
	}
}

class Statement {
	void DecisionMakingStatement() {
		int x = 10; int y = 12;
		if(x + y < 10) {
			System.out.println("x + y is less than 10");
		} else {
			System.out.println("x + y is greater than 20");
		}
		
		int num = 2;
		
		//can we use char instead of int as num??
		
		switch(num) { //switch(expression)
		case 0 : //case value1:
			System.out.println("Number is 0");
			break;
		case 1 : 
			System.out.println("Number is 1");
			break;
		default : 
			System.out.println(num);
		}
	}
	
	void LoopStatement()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;	
		}
		System.out.println("The sum of first n natural number is" + sum); //concatenation is done to print the value of sum along with the written statement
		
		String[] names= {"Java","C","Python","Javascript","R"};
		System.out.println("Printing the contents of array names:\n");
		
		//For-each loop
		for(String name:names)
		{
			System.out.println(name); //name is the variable used for accessing all the values of our string "names"
			
		}
		int i=0;
		System.out.println("Printing the list of first 10 even numbers");
		while(i<=10)
		{
			System.out.println(i);
			i=i+2;
			
		}
	    i=0; //assigning value again to i so that it can be used for do-while loop 
	    System.out.println("Printing the list of first 10 even numbers\n");
	    do {
	    	System.out.println(i);
	    	i=i+2;
	    }while(i<=10);
	}
		
	void JumpStatement() {
			
			//Break
			for(int  i = 0; i <= 10; i++) {
				System.out.println(i);
				if(i == 6) {
					break;
				}
				System.out.println(i);
			}
			
			//Continue
			for(int i = 0; i <= 10; i++) {
				if(i == 6) {
					continue;
				}
				System.out.println(i);
			}
		}
	}