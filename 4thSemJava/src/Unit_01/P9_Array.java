package Unit_01;

import java.util.Arrays;
import java.util.Scanner;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		// write code here!
		// Way 1 Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void findTheDuplicateElements(int[] arr) {
		// write code here!
		int k;
		// Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		System.out.print("Duplicate Element Found: ");
		for (k = 0; k < arr.length - 1; k++)
			if (arr[k] == arr[k + 1]) {
				System.out.print(arr[k] + " ");
				while (arr[k] == arr[k + 1])
					k++;
			}
		System.out.println();
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!
		int max=arr[0],max2=arr[1],min=arr[0],min2=arr[1];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				{
					max2=max;
					max=arr[i];
				}
			if(max2<arr[i] && arr[i]<max)
				max2=arr[i];	
		}	
		System.out.println("Second Largest Element: "+max2);
		
		for(int i=0;i<arr.length;i++) 
		{
			if(min>arr[i])
			{
				min2=min;
				min=arr[i];
			}
			if(min2>arr[i] && arr[i]>min)
				min2=arr[i];
		}
		System.out.println("Second Smallest Element: "+min2);
		
}

	void leftRotationInAnArray(int[] arr) {
		// write code here!
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++)
			arr[i - 1] = arr[i];
		arr[arr.length - 1] = temp;
		System.out.print("After Left Rotation: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	void removeElementInArray(int[] arr) {
		// write code here!
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter number to be deleted: ");
		int x = ob.nextInt();
		int pos = 0;
		while (arr[pos] != x)
			pos++;
		for (int i = pos + 1; i < arr.length; i++)
			arr[i - 1] = arr[i];
		System.out.print("After Deletion: ");
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		ob.close();
	}

}