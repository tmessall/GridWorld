import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0) {
			return;
		}
		for (Actor act : actors) {
			if (act instanceof Rock) {
				act.removeSelfFromGrid();
			}
		}
	}

}
