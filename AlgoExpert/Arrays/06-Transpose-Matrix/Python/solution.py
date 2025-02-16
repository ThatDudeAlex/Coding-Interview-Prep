def transposeMatrix(matrix):
    # Write your code here.
    rows = len(matrix[0])
    cols = len(matrix)
    transpose = [[0 for _ in range(cols)] for _ in range(rows)]

    for col in range(rows):
        for row in range(cols):
            transpose[col][row] = matrix[row][col]
            
    return transpose
