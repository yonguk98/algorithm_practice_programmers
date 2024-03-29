def solution(players, callings):
    rank = {player: idx for idx, player in enumerate(players)}
    for name in callings:
        current_rank = rank[name]

        rank[name] -= 1
        rank[players[current_rank - 1]] += 1

        players[current_rank - 1], players[current_rank] = (
            name,
            players[current_rank - 1],
        )

    return players