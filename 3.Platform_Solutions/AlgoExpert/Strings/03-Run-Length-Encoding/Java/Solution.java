import java.util.*;

class Solution {
  public String runLengthEncoding(String string) {
    // Write your code here.
    StringBuilder encodedData = new StringBuilder();
    char prevLetter = string.charAt(0);
    int count = 1;
    
    if (string.length() == 1)
    return encodeData(count, prevLetter);
    
    for (int i = 1; i < string.length(); i++) {
      char currentLetter = string.charAt(i);
      
      if (count == 9) {
        encodedData.append(encodeData(count, prevLetter));
        count = 1;
        prevLetter = currentLetter;
      }
      else if (isConsecutive(string, i)) {
        count += 1;
      }
      else if (!isConsecutive(string, i)) {
        encodedData.append(encodeData(count, prevLetter));
        count = 1;
        prevLetter = currentLetter;
      }
    }
    
    encodedData.append(encodeData(count, prevLetter));
    
    return encodedData.toString();
  }
  
  private static boolean isConsecutive(String string, int index) {
    return string.charAt(index) == string.charAt(index - 1);
  }
  
  private static String encodeData(int count, char letter) {
    return String.format("%d%c", count, letter);
  }
}

