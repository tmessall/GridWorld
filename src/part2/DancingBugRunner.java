import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		int[] turns = new int[] {2, 3, 7, 4, 5, 2, 3};
		DancingBug max = new DancingBug(turns);
		max.setColor(Color.CYAN);
		world.add(new Location(4, 4), max);
		world.show();
	}
}