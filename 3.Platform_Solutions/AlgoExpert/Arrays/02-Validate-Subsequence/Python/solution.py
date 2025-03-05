def isValidSubsequence(array, sequence):
    # Write your code here.
    currSequenceIdx = 0
    
    for number in array:
        if sequence[currSequenceIdx] == number:
            currSequenceIdx += 1
    
        if currSequenceIdx == len(sequence):
            return True
    
    return False