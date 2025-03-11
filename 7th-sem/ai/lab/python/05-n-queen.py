def printMatrix(board, N):
    for i in range(N):
        for j in range(N):
            print(board[i][j], end=" ")
        print("")


def isSafe(board, row, col, N):
    # Checks if a queen can be placed at position (row, col)
    for i in range(col):  # Check row (left side)
        if board[row][i] == 1:
            return False
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        # This ensures no two queens are on the
        # same upper diagonal.
        if board[i][j] == 1:
            return False
    for i, j in zip(range(row, N, 1), range(col, -1, -1)):
        # Check lower diagonal (left side)
        if board[i][j] == 1:
            return False
    return True


def solveNQ(board, col, N):
    if col >= N:
        return True

    for i in range(N):
        if isSafe(board, i, col, N):
            board[i][col] = 1
            if solveNQ(board, col + 1, N) is True:
                return True
            board[i][col] = 0
    return False


def main():
    N = int(input("Enter size of the chessboard : "))
    board = [[0] * N for i in range(N)]  # Initialize an N×N board with 0s
    if solveNQ(board, 0, N) is False:
        print("Solution does not exist")
        return False

    printMatrix(board, N)  # Print the solution
    return True


if __name__ == '__main__':
    main()
