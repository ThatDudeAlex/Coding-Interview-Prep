/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function (head) {
    let linkedString = [];


    if (head == null || head.next == null)
        return true;

    while (head !== null) {
        linkedString.push(head.val);
        head = head.next;
    }

    while (true) {
        if (linkedString.length <= 1)
            return true;
        else if (linkedString.shift() !== linkedString.pop())
            return false;
    }
};