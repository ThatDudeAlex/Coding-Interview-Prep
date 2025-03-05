def quickSort(array):
    sort(array, 0, len(array) - 1)
    return array

def sort(array, lower_bound, upper_bound):
    # Single Element
    if lower_bound >= upper_bound:
        return

    pivot = lower_bound
    pivot_value = array[pivot]
    left_pointer = lower_bound + 1
    right_pointer = upper_bound

    while left_pointer <= right_pointer:
        if (array[left_pointer] > pivot_value) and (array[right_pointer] <= pivot_value):
            swap(array, left_pointer, right_pointer)
            left_pointer += 1
            right_pointer -= 1
            
        elif array[left_pointer] <= pivot_value:
            left_pointer += 1
        
        elif array[right_pointer] > pivot_value:
            right_pointer -= 1

    swap(array, pivot, right_pointer)
    sort(array, lower_bound, right_pointer - 1)
    sort(array, right_pointer + 1, upper_bound)


# Pythonic swap function
def swap(array, index1, index2):
    array[index1], array[index2] = array[index2], array[index1]
