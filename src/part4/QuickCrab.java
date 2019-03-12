import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	public ArrayList<Location> getMoveLocations() {
		ArrayList<Location> locs = new ArrayList<Location>();
		Location spot = getLocation();
		Grid<Actor> gr = getGrid();
		int dir = getDirection();
		int left = dir - 90;
		int right = dir + 90;
		Location spotLeft = spot.getAdjacentLocation(left);
		Location spotRight = spot.getAdjacentLocation(right);
		Location spotLeftTwo = spotLeft.getAdjacentLocation(left);
		Location spotRightTwo = spotRight.getAdjacentLocation(right);
		if (gr.isValid(spotLeftTwo)) {
			if (gr.get(spotLeft) == null && gr.get(spotLeftTwo) == null) {
				locs.add(spotLeftTwo);
			}
		}
		if (gr.isValid(spotRightTwo)) {
			if (gr.get(spotRight) == null && gr.get(spotRightTwo) == null) {
				locs.add(spotRightTwo);
			}
		}
		return locs;
	}

}
