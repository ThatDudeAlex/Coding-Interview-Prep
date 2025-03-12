
from collections import deque

# Solution with queue - O(n²)
def rotate_matrix(matrix):
    if len(matrix) == 1:    # returns if 1x1 matrix
        return

    queue = deque()
    length = len(matrix)

    column = length - 1

    # Adds the values each column from right-to-left
    # into the queue
    while column >= 0:
        for row in range(length):
            queue.append(matrix[row][column])
        column -= 1

    # Perform 90 degree rotation (clockwise)
    for row in range(length):
        for col in range(length):
            matrix[row][col] = queue.popleft()



