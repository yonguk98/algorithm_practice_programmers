n = int(input())
queen = [0] * n
visited = [False] * n
count = 0


def check(current):
    for row in range(current):
        if queen[current] == queen[row] or current - row == abs(
            queen[current] - queen[row]
        ):
            return False
    return True


def backtracking(depth):
    global count
    if depth == n:
        count += 1
        return None

    for col in range(n):
        if visited[col] is True:
            continue
        queen[depth] = col
        if check(depth):
            visited[col] = True
            backtracking(depth + 1)
            visited[col] = False


backtracking(0)
print(count)
