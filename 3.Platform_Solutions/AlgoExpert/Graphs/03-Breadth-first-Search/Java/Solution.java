import java.util.*;

class Solution {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();
    
    public Node(String name) {
      this.name = name;
    }
    
    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
      Queue<Node> queue = new LinkedList<>();
      Node currentNode = this;
      array.add(currentNode.name);
      addChildToQueue(currentNode, queue);
      
      while (queue.size() > 0) {
        currentNode = queue.poll();
        array.add(currentNode.name);
        addChildToQueue(currentNode, queue);
      }
      
      return array;
    }
    
    private void addChildToQueue(Node currentNode, Queue<Node> queue) {
      for (Node child : currentNode.children)
      queue.add(child);
    }
    
    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}

