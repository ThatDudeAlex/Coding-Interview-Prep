def moveElementToEnd(array, toMove):
    # Write your code here.
    start_pointer = 0
    end_pointer = len(array) -1

    while end_pointer > start_pointer:
      start_value = array[start_pointer]
      end_value   = array[end_pointer]

      if end_value == toMove:
         end_pointer -= 1
      elif start_value != toMove:
        start_pointer += 1
      elif start_value == toMove:
        swap(start_pointer, end_pointer, array)
        start_pointer += 1
        end_pointer -=1
    
    return array

def swap(idx1, idx2, array):
   tmp = array[idx1]
   array[idx1] = array[idx2]
   array[idx2] = tmp