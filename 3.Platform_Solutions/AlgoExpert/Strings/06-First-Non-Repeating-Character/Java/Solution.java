import java.util.*;

class Solution {
  /*
  Need an int array of size 26, to represent alphabet
  Iterate the input string
  I can map the current letter to the array by doing “currentLetter - ‘a’”
  See if that letter is marked as 0 in the array, and if it is mark it as the index in the string
  If the letter is marked as 1 in the array then mark it as -1
  Iterate the array
  Return the lowest value found that’s > 0
  Return -1 if we find nothing in the array
  
  */
  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
    int[] alphabeth = new int[26];
    Arrays.fill(alphabeth, Integer.MIN_VALUE);
    
    if (string.length() == 0)
    return -1;
    if (string.length() == 1)
    return 0;
    
    for(int i = 0; i < string.length(); i++) {
      int index = string.charAt(i) - 'a';
      
      if (alphabeth[index] >= 0)
      alphabeth[index] = -1;
      else if (alphabeth[index] == Integer.MIN_VALUE)
      alphabeth[index] = i;
    }
    
    return getFirstNonrepeated(alphabeth);
  }
  
  private int getFirstNonrepeated(int[] alphabeth) {
    int lowestIndex = Integer.MAX_VALUE;
    
    for (int i = 0; i < 26; i++) {
      if (alphabeth[i] > -1 && alphabeth[i] < lowestIndex)
      lowestIndex = alphabeth[i];
    }
    
    if (lowestIndex == Integer.MAX_VALUE)
    return -1;
    
    return lowestIndex;
  }
}

