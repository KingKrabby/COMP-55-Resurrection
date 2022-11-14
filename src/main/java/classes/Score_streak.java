package classes;
public class Score_streak{
	
	
	private int streak = 0; //initializes streak to start at 0
	
	private int score = 0; // user start at 0 points
	private int failCount = 0; // user starts at 0 fail count
	
	//accessor
	int get_score() {
		return score;
	}
	int get_streak() {
		return streak;
	}
	int get_failCount() {
		return failCount;
	}
	
	// increments score by one for each successive combo
	void incrementScore() {
		score ++;
	}
	//add to fail count
	void incrementFail() {
		failCount ++;
	}
	//reset fail count
	void reset_fail() {
		failCount = 0;
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