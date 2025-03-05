def selectionSort(array):
    array_length = len(array)
    
    for i in range(array_length):
        index_of_smallest_number = i

        for j in range(i + 1, array_length):
            if array[j] < array[index_of_smallest_number]:
                index_of_smallest_number = j
        swap(i, index_of_smallest_number, array)
        
    return array

# Pythonic way of swapping values
def swap (index1, index2, array):
    array[index1], array[index2] = array[index2], array[index1]
