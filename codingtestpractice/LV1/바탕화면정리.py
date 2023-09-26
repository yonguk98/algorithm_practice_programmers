wallpaper = [".#...", "..#..", "...#."]


def solution(wallpaper):
    l_r, l_c = len(wallpaper), len(wallpaper[0])
    x, y = [], []
    for row in range(l_r):
        for col in range(l_c):
            if wallpaper[row][col] == "#":
                x.append(row)
                y.append(col)

    return [min(x), min(y), max(x) + 1, max(y) + 1]


print(solution(wallpaper))
