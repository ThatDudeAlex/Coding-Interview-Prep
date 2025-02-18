/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {

    if (head === null)
        return null
    else if (head.next === null)
        return head

    head = reverseLinkedList(head)
    return head
};


const reverseLinkedList = head => {
    let currentNode = head;
    let prevNode = null;
    let nextNode = null;

    while (currentNode != null) {
        nextNode = currentNode.next
        currentNode.next = prevNode
        prevNode = currentNode
        currentNode = nextNode
    }
    return prevNode;
}