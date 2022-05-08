package Assignment_01;

public class Ques_08 {
	
	int[] delete(int []a, int n, int index)
	{
		
		for(int i = index + 1; i < n; i++)
		{
			a[i - 1] = a[i];
		}
		a[n - 1] = 0;
		return a;
	}
	
	void print_array(int []a ,int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = a.length;
		
		Ques_08 obj = new Ques_08();
		obj.delete(a, n, 3);
		obj.print_array(a, n);
		
	}

}
