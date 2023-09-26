n, m = 8, 4
section = [2, 3, 6]


def solution(n, m, section):
    # start = section[0]
    # count = 1
    # cover = start + m - 1
    # for i in range(1, len(section)):
    #     if section[i] <= cover:
    #         continue
    #     else:
    #         count += 1
    #         start = section[i]
    #         cover = start + m - 1
    # return count

    prev = section[0]
    count = 1
    for sec in section:
        if sec - prev >= m:
            prev = sec
            count += 1
    return count


print(solution(n, m, section))
