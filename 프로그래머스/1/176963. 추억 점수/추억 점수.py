def solution(name, yearning, photo):
    answer = []
    d = dict(zip(name, yearning))
    for li in photo:
        count = 0
        for name in li:
            if name in d:
                count += d[name]
        answer.append(count)

    return answer