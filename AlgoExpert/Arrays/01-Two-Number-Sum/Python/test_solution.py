import json
import os
import unittest
from solution import twoNumberSum  # Import function

# ✅ Load test cases from JSON file
test_case_path = os.path.join(os.path.dirname(__file__), "../testcases.json")

with open(test_case_path, "r") as file:
    test_cases = json.load(file)

def validate_output(result, expected):
    """
    Validate output (order-independent check).
    :param result: List[int] - The output from twoNumberSum function.
    :param expected: List[List[int]] - The list of valid answers.
    :return: bool - True if output matches any valid expected output.
    """
    if not result and not expected:
        return True  # If both are empty, they match

    return any(result == valid or result == valid[::-1] for valid in expected)


class TestTwoNumberSum(unittest.TestCase):
    """Unit tests for twoNumberSum function."""

    def test_all_cases(self): 
        """Iterate through test cases from JSON."""
        for test in test_cases:
            with self.subTest(test_name=test["name"]):
                array = test["inputs"]["array"]
                target_sum = test["inputs"]["targetSum"]
                expected = test["expected"]

                result = twoNumberSum(array, target_sum)
                success = validate_output(result, expected)
  
                if success:
                    print(f"\n✅ Passed: {test['name']}")

                self.assertTrue(success, msg=f"""
                ❌ Failed: {test['name']}

                Input: nums = {array}, target = {target_sum}

                Expected 1 of the following: {expected}

                Got: {result}
                """)

if __name__ == "__main__":
    unittest.main()
