package string;

import java.util.Arrays;
import java.util.List;

public class ArraysTraineng {

	public static void main(String[] args) {
		String[]arr = {"Tree","Forest","Car"};
		List<String>list = Arrays.asList(arr);
		System.out.println(list);
		
		// initializing unsorted int array
	      int intArr[] = {30,20,5,12,55};

	      // sorting array
	      Arrays.sort(intArr);

	      // let us print all the elements available in list
	      System.out.println("The sorted int array is:");
	      for (int number : intArr) {
	         System.out.print(number+"\t");
	      }
	      System.out.println();
	      
	      // entering the value to be searched
	      int searchVal = 12;

	      int retVal = Arrays.binarySearch(intArr,searchVal);
	      
	      System.out.println("The index of element 12 is : " + retVal);
		
		
		String[][] arry = new String[3][2];
		
		
		List<String[]>list2 = Arrays.asList(arry);
		for (String[] strings : list2) {
			System.out.println(strings);
		}
		
		
		
		
		
		
	}
}
