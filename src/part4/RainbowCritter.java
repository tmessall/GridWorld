import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

import java.util.ArrayList;

public class RainbowCritter extends Critter {
	
	public void processActors(ArrayList<Actor> actors) {
		Location loc = getLocation();
		ArrayList<Actor> cornerActors = new ArrayList<Actor>();
		Grid<Actor> gr = getGrid();
		int dir = getDirection();
		for (Actor a : actors) {
			Location spot = a.getLocation();
			if (loc.getDirectionToward(spot) == 45) {
				cornerActors.add(a);
			} else if (loc.getDirectionToward(spot) == 135) {
				cornerActors.add(a);
			} else if (loc.getDirectionToward(spot) == 225) {
				cornerActors.add(a);
			} else if (loc.getDirectionToward(spot) == 315) {
				cornerActors.add(a);
			}
		}
		if (cornerActors.isEmpty()) {
			setColor(getColor().brighter());
			for (Actor a : actors) {
				Location spot = a.getLocation();
				int dirTowards = loc.getDirectionToward(spot);
				if (gr.isValid(spot.getAdjacentLocation(dirTowards))) {
					if (gr.get(spot.getAdjacentLocation(dirTowards)) == null) {
						a.moveTo(spot.getAdjacentLocation(dirTowards));
					} else {
						a.removeSelfFromGrid();
					}
				} else {
					a.removeSelfFromGrid();
				}
			}
		} else {
			int n = cornerActors.size();
			int r = (int) (Math.random() * n);
			Actor chosen = cornerActors.get(r);
			setColor(chosen.getColor());
			Color col = getColor();
			for (Actor a : actors) {
				if (a.getColor().getRGB() == getColor().getRGB()) {
					a.removeSelfFromGrid();
				}
			}
		}
	}

}
