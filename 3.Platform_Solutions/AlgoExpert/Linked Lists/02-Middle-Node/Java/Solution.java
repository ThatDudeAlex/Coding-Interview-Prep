
class Solution {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList middleNode(LinkedList linkedList) {
    // Write your code here.
    if (linkedList == null || linkedList.next == null)
      return linkedList;

    int listSize = 0;
    int middle = 0;
    LinkedList middleNode = null;
    LinkedList currNode = linkedList;

    // get LL size - O(n) time
    while (currNode != null) {
      currNode = currNode.next;
      listSize++;
    }

    if ((listSize / 2) == 0) {
      middle = (listSize / 2) + 1;
    } else {
      middle = (listSize / 2);
    }

    middleNode = linkedList;
    for (int i = 0; i < middle; i++) {
      middleNode = middleNode.next;
    }

    return middleNode;
  }
}
