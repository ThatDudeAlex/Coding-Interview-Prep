def longestPeak(array):
  # Write your code here.
  if len(array) < 3:
    return 0
  
  prev = array[0]
  longest_peak = 0
  curr_peak = 1
  in_decline = False

  for i in range(1, len(array)):
    curr_number = array[i]

    if prev == curr_number:
      curr_peak = 1
    elif curr_number > prev and not in_decline:
      curr_peak += 1
    elif curr_number > prev and in_decline:
      in_decline = False
      curr_peak = 2
    elif curr_number < prev and not in_decline and curr_peak != 1:
      in_decline = True
      curr_peak += 1
      longest_peak = max(longest_peak, curr_peak)
    elif curr_number < prev and in_decline and curr_peak != 1:
      curr_peak += 1
      longest_peak = max(longest_peak, curr_peak)

    prev = curr_number

  return longest_peak