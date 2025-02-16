import java.util.*;

class Solution {
  // Do not edit the class below except
  // for the depthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();
    
    public Node(String name) {
      this.name = name;
    }
    
    public List<String> depthFirstSearch(List<String> array) {
      // Write your code here.
      if (!hasChildren()) {
        array.add(this.name);
        return array;
      }
      
      array.add(name);
      
      for (Node child : this.children) {
        child.depthFirstSearch(array);
      }
      
      return array;
    }
    
    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
    
    private boolean hasChildren() {
      return this.children.size() > 0;
    }
  }
}

