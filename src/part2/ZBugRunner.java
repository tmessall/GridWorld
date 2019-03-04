import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ZBugRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		ZBug joe = new ZBug(5);
		joe.setColor(Color.CYAN);
		joe.turn();
		joe.turn();
		world.add(new Location(3, 3), joe);
		world.show();
	}
}