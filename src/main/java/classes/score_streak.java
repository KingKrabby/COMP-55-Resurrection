package classes;
public class score_streak{
	int streak = 0; //initializes streak to start at 0
	
	int score = 0; // user start at 0 points
	int failCount = 0; // user starts at 0 fail count
	
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