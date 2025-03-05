
def bubbleSort(array):
    array_length = len(array)

    # If array is empty or with 1 element then it's sorted
    if array_length == 0 or array_length == 1:
        return array

    # Optimization technique. The end of the array is sorted each
    # run so we move the unsorted limit to not waste runs on things
    # that already have been sorted
    limit = array_length - 1
    is_sorted = False

    while not is_sorted:
        is_sorted = True
        for i in range(limit):
            if array[i] > array[i + 1]:
                swap(i, i + 1, array)
                # If a swap happenend we know the arrow wasn't sorted
                # so set to false to initiate another run to recheck
                is_sorted= False
                
        # moves the window of the unsorted portion by 1
        limit -= 1

    return array


def swap (index1, index2, array):
    temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
