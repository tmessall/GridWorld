import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	
	private int steps;
	private int sideLength;
	private Boolean firstLegDone;
	private Boolean secondLegDone;
	private Boolean thirdLegDone;

	public ZBug(int length) {
		steps = 0;
		sideLength = length;
		firstLegDone = false;
		secondLegDone = false;
		thirdLegDone = false;
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			if (thirdLegDone) {
				steps = 0;
			} else {
				move();
				steps++;
			}
		} else {
			if (!firstLegDone) {
				turn();
				turn();
				turn();
				steps = 0;
				firstLegDone = true;
			} else if (!secondLegDone) {
				turn();
				turn();
				turn();
				turn();
				turn();
				steps = 0;
				secondLegDone = true;
			} else {
				thirdLegDone = true;
			}
		}
	}
}
