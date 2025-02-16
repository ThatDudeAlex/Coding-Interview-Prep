import java.util.*;

class Solution {
  public String[] commonCharacters(String[] strings) {
    // Write your code here.
    Set<Character> commonSet = null;
    
    for (int i = 0; i < strings.length; i++) {
      Set<Character> currentSet = new HashSet<>();
      String currString = strings[i];
      
      for (int j = 0; j < currString.length(); j++) {
        if (commonSet == null) {
          currentSet.add(currString.charAt(j));
        }
        else if (commonSet.contains(currString.charAt(j))) {
          currentSet.add(currString.charAt(j));
        }
      }
      
      commonSet = currentSet;
    }
    
    String[] output = new String[commonSet.size()];
    int i = 0;
    
    for (Character commonChar : commonSet) {
      output[i++] = String.valueOf(commonChar);
    }
    
    return output;
  }
}

