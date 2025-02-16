def tournamentWinner(competitions, results):
    # Write your code here.
    winner = None
    winning_score = 0
    team_scores = {}

    for i in range(len(competitions)):
        home_team = competitions[i][0]
        away_team = competitions[i][1]

        team_scores.setdefault(home_team, 0)
        team_scores.setdefault(away_team, 0)

        if results[i] == 1:
            team_scores[home_team] = team_scores[home_team] + 3
        else:
            team_scores[away_team] = team_scores[away_team] + 3

    for key, value in team_scores.items():
        if winner == None or value > winning_score:
            winner = key
            winning_score = value
            
    return winner
