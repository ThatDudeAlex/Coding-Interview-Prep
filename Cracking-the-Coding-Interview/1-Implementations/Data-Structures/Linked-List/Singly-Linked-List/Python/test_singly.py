import unittest
from singly import LinkedList
import json

class TestLinkedList(unittest.TestCase):

    def setUp(self):
        with open('../testcases.json', 'r') as f:
            self.test_cases = json.load(f)

    def test_linked_list(self):
        for test_case in self.test_cases:
            print(f"Testing: {test_case['description']}")
            linked_list = None

            for operation in test_case['operations']:
                op_name = operation['operation']
                args = operation.get('arguments', {})
                expected = operation.get('expected')

                if op_name == 'init':
                    linked_list = LinkedList(**args)
                elif op_name == 'getSize':
                    self.assertEqual(linked_list.get_size(), expected)
                elif op_name == 'hasValue':
                    self.assertEqual(linked_list.has_value(**args), expected)
                elif op_name == 'insertHead':
                    self.assertEqual(linked_list.insert_head(**args), expected)
                elif op_name == 'insertTail':
                    self.assertEqual(linked_list.insert_tail(**args), expected)
                elif op_name == 'insertAtIndex':
                    self.assertEqual(linked_list.insert_at_index(**args), expected)
                elif op_name == 'deleteHead':
                    self.assertEqual(linked_list.delete_head(), expected)
                elif op_name == 'deleteTail':
                    self.assertEqual(linked_list.delete_tail(), expected)
                elif op_name == 'deleteAtIndex':
                    self.assertEqual(linked_list.delete_at_index(**args), expected)
                else:
                    self.fail(f"Unknown operation: {op_name}")

if __name__ == '__main__':
    unittest.main()