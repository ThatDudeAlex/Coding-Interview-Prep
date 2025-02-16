import java.util.*;

class Solution {
  public ArrayList<ArrayList<String>> semordnilap(String[] words) {
    // Write your code here.
    Set<String> wordSet = new HashSet<>();
    ArrayList<ArrayList<String>> output = new ArrayList<>();
    
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      String semordnilap = getSemordnilap(word);
      
      if (wordSet.contains(semordnilap)) {
        ArrayList<String> pair = new ArrayList<>();
        pair.add(word);
        pair.add(semordnilap);
        output.add(pair);
      } else {
        wordSet.add(word);
      }
    }
    
    return output;
  }
  
  private String getSemordnilap(String word) {
    String semordnilap = "";
    
    for (int i = word.length() - 1; i >= 0; i--) {
      semordnilap += word.charAt(i);
    }
    
    return semordnilap;
  }
}

