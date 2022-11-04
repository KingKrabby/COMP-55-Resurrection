package classes;
public class Score_streak{
	
	
	private int streak = 0; //initializes streak to start at 0
	
	private int score = 0; // user start at 0 points
	private int failCount = 0; // user starts at 0 fail count
	
	//accessor
	private int get_score() {
		return score;
	}
	private int get_streak() {
		return streak;
	}
	private int get_failCount() {
		return failCount;
	}
	
	// increments score by one for each successive combo
	void incrementScore() {
		score ++;
	}
	// increments streak by one for each successive combo
	void incrementStreak() {
		streak ++;
	}
	// score becomes 0 each level
	void reset_score(){
		score =0;
	}
	// streak resets after failed streak.
	void reset_streak() {
		streak = 0;
				
	}
	// 
	int streak_multiplier;
	
}