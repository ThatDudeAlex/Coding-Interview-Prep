package main

func TwoNumberSum(array []int, target int) []int {
	// Write your code here.
	numbers_seen := make(map[int]bool) // pseudo set

	for _, number := range array {
		match := target - number

		if _, ok := numbers_seen[match]; ok {
			return []int{match, number}
		}
		numbers_seen[number] = true
	}
	return []int{}
}
