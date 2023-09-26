name = ["may", "kein", "kain", "radi"]
yearning = [5, 10, 1, 3]
photo = [
    ["may", "kein", "kain", "radi"],
    ["may", "kein", "brin", "deny"],
    ["kon", "kain", "may", "coni"],
]


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


print(solution(name, yearning, photo))
