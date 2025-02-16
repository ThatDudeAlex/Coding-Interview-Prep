def isMonotonic(array):
    # Write your code here.
    if len(array) <= 2:
      return True
    
    start_index = skipDuplicates(array)
    prev_value = array[start_index]
    is_inceasing = False

    if start_index == len(array) - 1:
      return True
    
    if prev_value < array[start_index + 1]:
      is_inceasing = True
    
    for i in range(start_index, len(array) - 1):
      if is_inceasing:
        if array[i + 1] < prev_value:
          return False
        prev_value = array[i + 1]

      else:
        if array[i + 1] > prev_value:
          return False
        prev_value = array[i + 1]

    return True


def skipDuplicates(array):
    if array[0] != array[1]:
        return 0
    
    for i in range(len(array) - 1):
        if array[i] != array[i + 1]:
            return i
    
    return len(array) - 1
