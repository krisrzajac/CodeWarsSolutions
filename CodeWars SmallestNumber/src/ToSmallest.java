

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
    	
        char[] charArray = Long.toString(n).toCharArray();
        //find lowest number (0-9) in char array
        int lowestNumberFound = 9;
        for(char c : charArray)
        {
        	if(c-0<=lowestNumberFound)
        		lowestNumberFound = c-0;
        	
        }
        
        //find where to put low number -
        //starting from left to right checking if c is less
        int indexOfSwap = 0;
        for(int i = charArray.length-1; i >=0;i--)
        {
        	if(lowestNumberFound<(charArray[i]-0))
        		indexOfSwap = i;
        }
        
        
        //swap the numbers at indexs
        char tempStore = charArray[charArray.length-1];
        charArray[charArray.length-1]=charArray[indexOfSwap];
        charArray[indexOfSwap] = tempStore;
        String solution = new String(charArray);
        System.out.println(solution);
        return null;
    }
}