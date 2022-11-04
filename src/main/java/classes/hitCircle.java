package classes;

public class hitCircle {
	public int hitCircleX;
	public int hitCircleY;
	
	hitCircle(int x, int y) {
			hitCircleX = x;
			hitCircleY = y;
	}		

	public boolean isHit(double currentBeat, double spawnOnBeat) { 
		//currentBeat will be from conductor and spawnOnBeat will be from Food
		if ((currentBeat <= (spawnOnBeat + 0.25)) && currentBeat >= (spawnOnBeat - 0.25)) {
			return true;
		}
		else {
			return false;
		}
	}


}