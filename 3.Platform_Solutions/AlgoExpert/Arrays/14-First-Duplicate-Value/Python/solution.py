def firstDuplicateValue(array):
  # Write your code here.
  unique_values = set()

  for i in range(len(array)):
    curr_num = array[i]
    
    if curr_num in unique_values:
      return curr_num
    
    unique_values.add(curr_num)

  return -1
