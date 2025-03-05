def threeNumberSum(array, targetSum):
    # Write your code here.
    if len(array) < 3:
        return []

    triplets = list()
    array.sort()

    for i in range(len(array)):
        curr_value = array[i]
        left_pointer = i + 1
        right_pointer = len(array) - 1

        while left_pointer < right_pointer:
            curr_sum = curr_value + array[left_pointer] + array[right_pointer]

            if curr_sum == targetSum:
                triplet = [curr_value, array[left_pointer], array[right_pointer]]
                triplets.append(triplet)
                left_pointer += 1
                right_pointer  -= 1
            elif curr_sum < targetSum:
                left_pointer += 1
            elif curr_sum > targetSum:
                right_pointer  -= 1
                
    return triplets
