def smallestDifference(arrayOne, arrayTwo):
    # Write your code here.
    arrayOne.sort()
    arrayTwo.sort()
    
    pair = [0, 0]
    smallest_diff = float('inf')
    array_one_pointer = 0
    array_two_pointer = 0

    while array_one_pointer < len(arrayOne) and array_two_pointer < len(arrayTwo):
      num1 = arrayOne[array_one_pointer]
      num2 = arrayTwo[array_two_pointer]
      difference = abs(num1 - num2)

      if difference == 0:
         return [num1, num2]
      elif difference < smallest_diff:
         smallest_diff = difference
         pair[0] = num1
         pair[1] = num2

      if num1 > num2:
         array_two_pointer += 1
      else:
         array_one_pointer += 1
    
    return pair
