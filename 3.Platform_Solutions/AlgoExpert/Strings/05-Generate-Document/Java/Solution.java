import java.util.*;

class Solution {
  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    Map<Character, Integer> characterFrequency = new HashMap<>();
    Map<Character, Integer> documentCharFrequency = new HashMap<>();
    int charLength = characters.length();
    int docLength = document.length();
    
    if (charLength == 1) {
      characterFrequency.put(characters.charAt(0), 1);
    }
    if (docLength == 1) {
      documentCharFrequency.put(document.charAt(0), 1);
    }
    
    for (int front = 0, back = charLength - 1; front < charLength / 2; front++, back--) {
      updateFrequency(characterFrequency, characters.charAt(front), characters.charAt(back));
    }
    
    for (int front = 0, back = docLength - 1; front < docLength / 2; front++, back--) {
      updateFrequency(documentCharFrequency, document.charAt(front), document.charAt(back));
    }
    
    return canCreateDocument(characterFrequency, documentCharFrequency);
  }
  
  private static void updateFrequency(Map<Character, Integer> map, char front, char back) {
    if (map.containsKey(front)){
      map.put(front, map.get(front) + 1);
    }
    else {
      map.put(front, 1);
    }
    
    if (map.containsKey(back)) {
      map.put(back, map.get(back) + 1);
    }
    else {
      map.put(back, 1);
    }
  }
  
  private static boolean canCreateDocument(Map<Character, Integer> charMap, Map<Character, Integer> docMap) {
    for (Character key : docMap.keySet()) {
      if (!charMap.containsKey(key) || charMap.get(key) < docMap.get(key)) {
        return false;
      }
    }
    
    return true;
  }
}

