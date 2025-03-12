
# O(n²) Runtime
def zero_matrix(matrix):
    m = len(matrix)
    n = len(matrix[0])

    row_set = set()
    col_set = set()

    for row in range(m):
        for col in range(n):
            if matrix[row][col] == 0:
                if row not in row_set and col not in col_set:
                    zero_row_and_col(matrix, row, col)
                    row_set.add(row)
                    col_set.add(col)
    

def zero_row_and_col(matrix, row, col):
    row_idx = 0
    col_idx = 0

    while col_idx < len(matrix[0]):
        matrix[row][col_idx] = 0
        col_idx += 1

    while row_idx < len(matrix):
        matrix[row_idx][col] = 0
        row_idx += 1