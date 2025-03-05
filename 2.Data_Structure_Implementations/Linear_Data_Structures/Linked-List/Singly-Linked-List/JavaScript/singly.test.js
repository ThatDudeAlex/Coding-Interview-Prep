const { LinkedList } = require('./singly'); 
const testCases = require('../testcases.json');

function runTests(testCases) {
  testCases.forEach((testCase, index) => {
    describe(`Test Case ${index + 1}: ${testCase.description}`, () => {
      let linkedList;

      testCase.operations.forEach((operation) => {
        const { operation: opName, arguments: args, expected } = operation;

        if (opName === 'init') {
          it('Initializes the linked list', () => {
            linkedList = new LinkedList(args && args.value);
          });
        } else if (opName === 'getSize') {
          it('Gets the size of the linked list', () => {
            expect(linkedList.getSize()).toBe(expected);
          });
        } else if (opName === 'hasValue') {
          it('Checks if the linked list has a value', () => {
            expect(linkedList.hasValue(args.value)).toBe(expected);
          });
        } else if (opName === 'insertHead') {
          it('Inserts a node at the head', () => {
            expect(linkedList.insertHead(args.value)).toBe(expected);
          });
        } else if (opName === 'insertTail') {
          it('Inserts a node at the tail', () => {
            expect(linkedList.insertTail(args.value)).toBe(expected);
          });
        } else if (opName === 'insertAtIndex') {
          it('Inserts a node at a specific index', () => {
            expect(linkedList.insertAtIndex(args.value, args.index)).toBe(expected);
          });
        } else if (opName === 'deleteHead') {
          it('Deletes the head node', () => {
            expect(linkedList.deleteHead()).toBe(expected);
          });
        } else if (opName === 'deleteTail') {
          it('Deletes the tail node', () => {
            expect(linkedList.deleteTail()).toBe(expected);
          });
        } else if (opName === 'deleteAtIndex') {
          it('Deletes a node at a specific index', () => {
            expect(linkedList.deleteAtIndex(args.index)).toBe(expected);
          });
        } else {
          it(`Unknown operation: ${opName}`, () => {
            fail(`Unknown operation: ${opName}`);
          });
        }
      });
    });
  });
}


runTests(testCases);