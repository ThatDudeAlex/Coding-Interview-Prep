import java.util.*;

class Solution {

  public String tournamentWinner( ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
		String winner = null;
		int winningScore = 0;
		Map<String, Integer> teamScores = new HashMap<>();
		
		for(int i = 0; i < competitions.size(); i++) {
			String homeTeam = competitions.get(i).get(0);
			String awayTeam = competitions.get(i).get(1);
			
			teamScores.putIfAbsent(homeTeam, 0);
			teamScores.putIfAbsent(awayTeam, 0);
			
			if (results.get(i) == 1) {
				teamScores.put(homeTeam, teamScores.get(homeTeam) + 3);
			} else {
				teamScores.put(awayTeam, teamScores.get(awayTeam) + 3);
			}
		}
		
		for (Map.Entry<String, Integer> entry : teamScores.entrySet()) {
			if (winner == null) {
				winner = entry.getKey();
				winningScore = entry.getValue();
			} 
			else if (entry.getValue() > winningScore) {
				winner = entry.getKey();
				winningScore = entry.getValue();
			}
		}
		
    return winner;
  }
}
