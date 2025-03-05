def minHeightBst(array):
  return minHeightBstHelper(array, 0, len(array) - 1)

def minHeightBstHelper(array, lower_bound, upper_bound):
  if upper_bound < lower_bound:
    return None
  
  middle = (lower_bound + upper_bound) // 2 # Integer division
  root = BST(array[middle])

  root.left  = minHeightBstHelper(array, lower_bound, middle -1)
  root.right = minHeightBstHelper(array, middle + 1, upper_bound)

  return root
    


class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)
