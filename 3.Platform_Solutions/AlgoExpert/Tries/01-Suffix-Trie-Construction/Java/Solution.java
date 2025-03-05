import java.util.*;

class Solution {
  // Do not edit the class below except for the
  // populateSuffixTrieFrom and contains methods.
  // Feel free to add new properties and methods
  // to the class.
  static class TrieNode {
    Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  }
  
  static class SuffixTrie {
    TrieNode root = new TrieNode();
    char endSymbol = '*';
    
    public SuffixTrie(String str) {
      populateSuffixTrieFrom(str);
    }
    
    public void populateSuffixTrieFrom(String str) {
      for (int i = 0; i < str.length(); i++) {
        insertSubstring(str, i);
      }
    }
    
    private void insertSubstring(String str, int startIdx) {
      TrieNode currNode = root;
      
      for (int i = startIdx; i < str.length(); i++) {
        char letter = str.charAt(i);
        
        if (!hasChild(currNode, letter)) {
          currNode.children.put(letter, new TrieNode());
        }
        
        currNode = currNode.children.get(letter);
      }
      currNode.children.put(endSymbol, null);
    }
    
    private boolean hasChild(TrieNode currNode, char letter) {
      return currNode.children.containsKey(letter);
    }
    
    public boolean contains(String str) {
      // Write your code here.
      TrieNode currNode = root;
      for (Character letter : str.toCharArray()) {
        if (!currNode.children.containsKey(letter)) {
          return false;
        }
        currNode = currNode.children.get(letter);
      }
      
      if (currNode.children.containsKey('*')) {
        return true;
      }
      return false;
    }
  }
}

