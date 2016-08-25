import java.util.ArrayList;
import java.util.stream.Collectors;

/*
You have a positive number n consisting of digits. You can do at most one operation: Choosing the index of a digit in the number, remove this digit at that index and insert it back to another place in the number.

Doing so, find the smallest number you can get.

Task:

Return an array or a tuple depending on the language (see "Your Test Cases" Haskell) with

1) the smallest number you got
2) the index i of the digit d you took, i as small as possible
3) the index j (as small as possible) where you insert this digit d to have the smallest number.
Example:

smallest(261235) --> [126235, 2, 0]
126235 is the smallest number gotten by taking 1 at index 2 and putting it at index 0

smallest(209917) --> [29917, 0, 1]

[29917, 1, 0] could be a solution too but index `i` in [29917, 1, 0] is greater than 
index `i` in [29917, 0, 1].
29917 is the smallest number gotten by taking 2 at index 0 and putting it at index 1 which gave 029917 which is the number 29917.

smallest(1000000) --> [1, 0, 6]
 */
public class ToSmallest {
    
    public static long[] smallest(long n) {
        // your code
    	System.out.println("Original number is :: " + n);
    	ArrayList<Integer> aList = new ArrayList<Integer>();
    	int smallestDigitFound = 9;
    	
    	int indexOfSmallestDigitiii = 0;
    	
    	int indexOfNumberToBeReplacedjjj =aList.size()-1;
    	
    	for(char c : Long.toString(n).toCharArray())
    	{
    		aList.add(Character.getNumericValue(c));
    	}
    	int counter = 0;
  
    	for(int i = aList.size()-1; i>=counter;i--)
    	{
    		if(aList.get(i) <=smallestDigitFound)
    		{
    			smallestDigitFound = aList.get(i);
    			indexOfSmallestDigitiii = i;
    		}
    		
    	}
    	
    	for(int i = aList.size()-1; i>=0;i--)
    	{
    		if(aList.get(i)>=smallestDigitFound)
    			indexOfNumberToBeReplacedjjj = i;
    		
    	}
    	System.out.println("i  ::" + indexOfSmallestDigitiii);
    	System.out.println("j  ::" + indexOfNumberToBeReplacedjjj);
    	int temp = aList.remove(indexOfSmallestDigitiii);
    	aList.add(indexOfNumberToBeReplacedjjj, temp);
    	long[] solution = {Long.valueOf(aList.stream().map(Object::toString)
                .collect(Collectors.joining(""))),indexOfSmallestDigitiii, indexOfNumberToBeReplacedjjj};
    	System.out.println(solution[0]);
    	
    	return solution;
    }
    
}