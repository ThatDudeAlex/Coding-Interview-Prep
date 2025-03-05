def insertionSort(array):
    array_length = len(array)

    if array_length <= 1:
        return array

    for i in range(1, array_length):
        j = i

        while j > 0 and array[j] < array[j - 1]:
            swap(j, j - 1, array)
            j -= 1
            
    return array

# Pythonic way of swapping values
def swap (index1, index2, array):
    array[index1], array[index2] = array[index2], array[index1]
