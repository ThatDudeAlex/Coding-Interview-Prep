def mergeSort(array):
    sort(array, 0, len(array) - 1)
    return array


def sort(array, lower_bound, upper_bound):
    if lower_bound >= upper_bound:
        return

    mid_point = lower_bound + (upper_bound - lower_bound) // 2

    sort(array, lower_bound, mid_point)  # leftPartition
    sort(array, mid_point + 1, upper_bound)  # rightPartition

    aux_array = create_aux_array(array, lower_bound, upper_bound, mid_point)
    copy_aux_contents(array, aux_array, lower_bound, upper_bound)


def create_aux_array(array, lower_bound, upper_bound, mid_point):
    aux_array = [0] * (upper_bound - lower_bound + 1)
    left_pointer = lower_bound
    right_pointer = mid_point + 1
    aux_Index = 0

    while left_pointer <= mid_point or right_pointer <= upper_bound:
        if left_pointer > mid_point or (right_pointer <= upper_bound and array[right_pointer] < array[left_pointer]):
            aux_array[aux_Index] = array[right_pointer]
            right_pointer += 1
        else:
            aux_array[aux_Index] = array[left_pointer]
            left_pointer += 1

        aux_Index += 1

    return aux_array


def copy_aux_contents(array, aux_array, lower_bound, upper_bound):
    for i in range(lower_bound, upper_bound + 1):
        array[i] = aux_array[i - lower_bound]
