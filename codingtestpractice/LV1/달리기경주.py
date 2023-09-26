players = ["mumu", "soe", "poe", "kai", "mine"]
callings = ["kai", "kai", "mine", "mine"]


def solution(players: list, callings: list):
    for name in callings:
        idx = players.index(name)
        second = players[idx - 1]
        players[idx], players[idx - 1] = second, name

    return players


print(solution(players, callings))
