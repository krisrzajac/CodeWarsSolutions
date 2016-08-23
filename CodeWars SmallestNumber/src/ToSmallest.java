import java.lang.*;
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