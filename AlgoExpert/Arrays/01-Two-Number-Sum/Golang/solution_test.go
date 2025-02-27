package main

import (
	"encoding/json"
	"fmt"
	"os"
	"reflect"
	"testing"
)

// ✅ Struct to match the JSON structure
type TestCase struct {
	Inputs struct {
		Array     []int `json:"array"`
		TargetSum int   `json:"targetSum"`
	} `json:"inputs"`
	Expected [][]int `json:"expected"`
	Name     string  `json:"name"`
}

// ✅ Reads and parses `testcases.json`
func loadTestCases(filename string) ([]TestCase, error) {
	data, err := os.ReadFile(filename)
	if err != nil {
		return nil, err
	}

	var testCases []TestCase
	err = json.Unmarshal(data, &testCases)
	if err != nil {
		return nil, err
	}

	return testCases, nil
}

// ✅ Runs all test cases from `testcases.json`
func TestTwoNumberSum(t *testing.T) {
	// Load test cases
	testCases, err := loadTestCases("../testcases.json")
	if err != nil {
		t.Fatalf("Failed to load test cases: %v", err)
	}

	// Run test cases
	for _, test := range testCases {
		t.Run(test.Name, func(t *testing.T) {
			result := TwoNumberSum(test.Inputs.Array, test.Inputs.TargetSum)

			// Check if result matches any expected pair (order doesn't matter)
			pass := false
			if len(test.Expected) == 0 && len(result) == 0 {
				pass = true
			} else {
				for _, expected := range test.Expected {
					if reflect.DeepEqual(result, expected) || (len(result) == 2 && result[0] == expected[1] && result[1] == expected[0]) {
						pass = true
						break
					}
				}
			}

			if !pass {
				t.Errorf("❌ Failed: %s\n   Input: nums = %v, target = %d\n   Expected: %v, Got: %v\n",
					test.Name, test.Inputs.Array, test.Inputs.TargetSum, test.Expected, result)
			} else {
				fmt.Printf("✅ Passed: %s\n", test.Name)
			}
		})
	}
}
