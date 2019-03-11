import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

import java.util.ArrayList;

public class BlusterCritter extends Critter {

	private int courage;

	public BlusterCritter(int courage) {
		this.courage = courage;
	}

	public ArrayList<Actor> getActors() {
		Grid<Actor> gr = getGrid();
		Location spot = getLocation();
		ArrayList<Actor> actors = gr.getNeighbors(getLocation());
		if (gr.isValid(spot.getAdjacentLocation(Location.NORTHEAST))) {
			Location topRight = spot.getAdjacentLocation(Location.NORTHEAST);
			Location[] locList = new Location[5];
			locList[0] = topRight.getAdjacentLocation(Location.NORTHWEST);
			locList[1] = topRight.getAdjacentLocation(Location.NORTH);
			locList[2] = topRight.getAdjacentLocation(Location.NORTHEAST);
			locList[3] = topRight.getAdjacentLocation(Location.EAST);
			locList[4] = topRight.getAdjacentLocation(Location.SOUTHEAST);
			for (Location loc : locList) {
				if (gr.isValid(loc)) {
					Actor act = gr.get(loc);
					if (act != null) {
						actors.add(act);
					}
				}
			}
		}
		if (gr.isValid(spot.getAdjacentLocation(Location.SOUTHEAST))) {
			Location botRight = spot.getAdjacentLocation(Location.SOUTHEAST);
			Location[] locList = new Location[4];
			locList[0] = botRight.getAdjacentLocation(Location.EAST);
			locList[1] = botRight.getAdjacentLocation(Location.SOUTHEAST);
			locList[2] = botRight.getAdjacentLocation(Location.SOUTH);
			locList[3] = botRight.getAdjacentLocation(Location.SOUTHWEST);
			for (Location loc : locList) {
				if (gr.isValid(loc)) {
					Actor act = gr.get(loc);
					if (act != null) {
						actors.add(act);
					}
				}
			}
		}	
		if (gr.isValid(spot.getAdjacentLocation(Location.SOUTHWEST))) {
			Location botLeft = spot.getAdjacentLocation(Location.SOUTHWEST);
			Location[] locList = new Location[4];
			locList[0] = botLeft.getAdjacentLocation(Location.SOUTH);
			locList[1] = botLeft.getAdjacentLocation(Location.SOUTHWEST);
			locList[2] = botLeft.getAdjacentLocation(Location.WEST);
			locList[3] = botLeft.getAdjacentLocation(Location.NORTHWEST);
			for (Location loc : locList) {
				if (gr.isValid(loc)) {
					Actor act = gr.get(loc);
					if (act != null) {
						actors.add(act);
					}
				}
			}
		}
		if (gr.isValid(spot.getAdjacentLocation(Location.NORTHWEST))) {
			Location topLeft = spot.getAdjacentLocation(Location.NORTHWEST);
			Location[] locList = new Location[3];
			locList[0] = topLeft.getAdjacentLocation(Location.WEST);
			locList[1] = topLeft.getAdjacentLocation(Location.NORTHWEST);
			locList[2] = topLeft.getAdjacentLocation(Location.NORTH);
			for (Location loc : locList) {
				if (gr.isValid(loc)) {
					Actor act = gr.get(loc);
					if (act != null) {
						actors.add(act);
					}
				}
			}
		}	
		return actors;
	}

	public void processActors(ArrayList<Actor> actors) {
		int critterCounter = 0;
		for (Actor act : actors) {
			if (act instanceof Critter) {
				critterCounter++;
			}
		}

		if (critterCounter >= courage) {
			setColor(getColor().darker().darker());
		} else {
			setColor(getColor().brighter().brighter());
		}
	}

}
