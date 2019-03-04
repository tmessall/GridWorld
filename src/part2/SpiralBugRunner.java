import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		SpiralBug joe = new SpiralBug(2);
		joe.setColor(Color.CYAN);
		world.add(new Location(4, 4), joe);
		world.show();
	}
}