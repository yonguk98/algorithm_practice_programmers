park = ["SOO", "OXX", "OOO"]
routes = ["E 2", "S 2", "W 1"]


def solution(park: list, routes: list):
    l_r, l_c = len(park), len(park[0])
    direction = {"N": (-1, 0), "W": (0, -1), "E": (0, 1), "S": (1, 0)}

    for row in range(l_r):
        for col in range(l_c):
            if park[row][col] == "S":
                current = [row, col]

    for rt in routes:
        d, n = rt.split()
        n = int(n)
        move_r, move_c = direction[d][0] * n, direction[d][1] * n

        if 0 <= current[0] + move_r < l_c and 0 <= current[1] + move_c < l_c:
            flag_r, flag_c = True, True
            next_r, next_c = 0, 0
            if move_r > 0:
                for i in range(move_r + 1):
                    next_r = current[0] + i
                    if park[next_r][current[1]] == "X":
                        flag_r = False
                        break
            else:
                for i in range(-1, move_r - 1, -1):
                    next_r = current[0] + i
                    if park[next_r][current[1]] == "X":
                        flag_r = False
                        break
            if move_c > 0:
                for i in range(move_c + 1):
                    next_c = current[1] + i
                    if park[current[0]][next_c] == "X":
                        flag_c = False
                        break
            else:
                for i in range(-1, move_c - 1, -1):
                    next_c = current[1] + i
                    if park[current[0]][next_c] == "X":
                        flag_c = False
                        break

            if flag_c is True and flag_r is True:
                current[0] += move_r
                current[1] += move_c
    return current


print(solution(park, routes))
