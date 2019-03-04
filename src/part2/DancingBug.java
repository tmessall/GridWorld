import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int[] turns;
	private int turnLooper;

	public DancingBug(int[] turns) {
		this.turns = turns;
		turnLooper = 0;
	}

	public void act() {
		for (int i = 0; i < turns[turnLooper]; i++) {
			turn();
		}
		turnLooper++;
		if (turnLooper >= turns.length) {
			turnLooper = 0;
		}
		super.act();
	}
}
