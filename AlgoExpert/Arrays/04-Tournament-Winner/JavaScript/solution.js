function tournamentWinner(competitions, results) {
  // Write your code here.
  let winner = null;
  let winningScore = 0;
  const teamScores = new Map()

  for (let i = 0; i < competitions.length; i++) {
    const homeTeam = competitions[i][0]
    const awayTeam = competitions[i][1]

    if (!teamScores.has(homeTeam))
      teamScores.set(homeTeam, 0)

    if (!teamScores.has(awayTeam))
      teamScores.set(awayTeam, 0)

    if (results[i] == 1) {
      teamScores.set(homeTeam, teamScores.get(homeTeam) + 3)
    } else {
      teamScores.set(awayTeam, teamScores.get(awayTeam) + 3)
    }
  }

  for (const [key, value] of teamScores) {
    if (winner == null || value > winningScore) {
      winner = key
      winningScore = value
    }
  }
  return winner;
}

// Do not edit the line below.
exports.tournamentWinner = tournamentWinner;
