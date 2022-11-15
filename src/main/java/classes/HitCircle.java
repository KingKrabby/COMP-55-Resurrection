package classes;

public class HitCircle {
	public int hitCircleX;
	public int hitCircleY;
	
	HitCircle(int x, int y) {
			hitCircleX = x;
			hitCircleY = y;
	}		

	/*public boolean isHit(Food currentFood) { 
		//currentBeat will be from conductor and spawnOnBeat will be from Food
		double currentBeat = currentLevel.getConductor().getCurrentBeat(currentLevel);
		double spawnOnBeat = currentFood.getSpawnBeat();
		if ((currentBeat <= (spawnOnBeat + 0.25)) && currentBeat >= (spawnOnBeat - 0.25)) {
			return true;
		}
		else {
			return false;
		}
		
		/*
		 in map:
		 for (int i = 0; i < level1.length(); i++) {
		 	if (level1[i].isHit == true) {
		 	
		 	}
		 	else {
		 	
		 	}
		 }
		 
	}
*/
	
	//need a way to get currentLevel?
	
}