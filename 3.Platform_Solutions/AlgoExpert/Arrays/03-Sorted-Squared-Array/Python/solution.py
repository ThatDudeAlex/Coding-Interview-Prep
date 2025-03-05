def sortedSquaredArray(array):
    # Write your code here.
    squared = [0] * len(array)
    leftPointer   = 0
    rightPointer  = len(array) - 1
    squaredIndex  = rightPointer
    
    while leftPointer <= rightPointer:
        leftSquared   = array[leftPointer]  * array[leftPointer]
        rightSquared  = array[rightPointer] * array[rightPointer]
                    
        if leftSquared > rightSquared:
            squared[squaredIndex] = leftSquared
            leftPointer += 1
            squaredIndex -= 1
            
        elif rightSquared >= leftSquared:
            squared[squaredIndex] = rightSquared
            rightPointer -= 1
            squaredIndex -= 1
        
    return squared
