package main

func IsValidSubsequence(array []int, sequence []int) bool {
	// Write your code here.
	currSequenceIdx := 0

	for _, number := range array {
		if sequence[currSequenceIdx] == number {
			currSequenceIdx++
		}

		if currSequenceIdx == len(sequence) {
			return true
		}
	}
	return false
}
