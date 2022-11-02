package classes;
public class score_streak{
	int streak = 0;
	int score = 0;
	int failCount = 0; 
	void incrementScore() {
		score ++;
	}
	void incrementStreak() {
		streak ++;
	}
	void reset_score(){
		score =0;
	}
	void reset_streak() {
		streak = 0;
				
	}
	int streak_multiplier;
	
}