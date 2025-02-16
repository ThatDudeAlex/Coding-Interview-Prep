# This is an input class. Do not edit.
class BST:
  def __init__(self, value):
    self.value = value
    self.left = None
    self.right = None


def validateBst(tree):
  # Write your code here.
  return validateBstHelper(tree, float('-inf'), float('inf'))

def validateBstHelper(root, lower_bound, upper_bound):
  if root.value < lower_bound or root.value >= upper_bound:
    return False
  
  if root.left != None and not validateBstHelper(root.left, lower_bound, root.value):
    return False
  
  if root.right != None and not validateBstHelper(root.right, root.value, upper_bound):
    return False
  
  return True