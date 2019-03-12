import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

import java.util.ArrayList;

public class KingCrab extends CrabCritter {
	
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			Location loc = a.getLocation();
			int dir = getLocation().getDirectionToward(loc);
			if (getGrid().isValid(loc.getAdjacentLocation(dir))) {
				if (getGrid().get(loc.getAdjacentLocation(dir)) == null) {
					a.moveTo(loc.getAdjacentLocation(dir));
				} else {
					a.removeSelfFromGrid();
				}
			} else {
				a.removeSelfFromGrid();
			}
		}
	}

}
