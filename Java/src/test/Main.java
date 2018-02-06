package test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import test.TRy;

public class Main {
 public static void main(String[] args) {
	Training tr = new Training();
	TRy t = new TRy();

	System.out.println(tr.doubleInt(5));
	System.err.println(t.doubleInt(5));
	System.out.println(t.decrese(5));
	
	t.setS(25);
	System.out.println(t.doubleInt(5));
	System.out.println(tr.doubleInt(2));
	
//	Training s = new TRy();
//	TRy r = (TRy) new Training();
	
	List<Integer> inputList = Arrays.asList(1,2,2,3,4,5,5);
	Set inputSet = new HashSet<>(inputList);
	System.out.println("inputList: "+inputList.size());
	System.out.println("inputSet: "+inputSet.size());
	
	for (Object ints : inputSet) {
		System.out.print(ints+"\t");
	}
	

	
	}
}