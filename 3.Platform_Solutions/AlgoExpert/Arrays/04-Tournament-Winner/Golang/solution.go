package main

const HOME_TEAM_WON = 1

func TournamentWinner(competitions [][]string, results []int) string {
	// Write your code here.
	var winner string
	winningScore := 0
	teamScores := make(map[string]int)

	for i, competition := range competitions {
		homeTeam := competition[0]
		awayTeam := competition[1]

		if _, ok := teamScores[homeTeam]; !ok {
			teamScores[homeTeam] = 0
		}

		if _, ok := teamScores[awayTeam]; !ok {
			teamScores[awayTeam] = 0
		}

		if results[i] == HOME_TEAM_WON {
			teamScores[homeTeam] = teamScores[homeTeam] + 3
		} else {
			teamScores[awayTeam] = teamScores[awayTeam] + 3
		}
	}

	for key, value := range teamScores {
		if winner == "" || value > winningScore {
			winner = key
			winningScore = value
		}
	}
	return winner
}
