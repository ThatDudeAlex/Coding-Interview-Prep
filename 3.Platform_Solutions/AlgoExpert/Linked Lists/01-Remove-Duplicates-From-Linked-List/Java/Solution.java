
public LinkedList(int value) {
  this.value = value;
  this.next = null;
}
}

public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
  // Write your code here.
  if (linkedList == null) { // base case
  return linkedList;
}

LinkedList prevNode = linkedList;
LinkedList currNode = linkedList.next;

while (currNode != null) {
  if (prevNode.value != currNode.value) {
    prevNode.next = currNode;
    prevNode = currNode;
    currNode = currNode.next;
  } else {
    LinkedList next = currNode.next;
    currNode.next = null;
    currNode = next;
  }
}

prevNode.next = null;
return linkedList;
}
}

