import java.util.*;

class Solution {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    String output = "";
    
    for (int i = 0; i < str.length(); i++) {
      int asciiValue = (int)str.charAt(i);
      asciiValue += key;
      
      char newLetter = (char)(97 + (asciiValue - 97) % (122 - 97 + 1));
      
      output = output + newLetter;
    }
    
    return output;
  }
}

