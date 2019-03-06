import info.gridworld.grid.*;
import info.gridworld.actor.*;

public class Jumper extends Bug {
	
	public Jumper() {
		super();
	}

	public void act() {
		if (canJump()) {
			jump();
		} else if (canMove()) {
			move();
		} else {
			turn();
		}
	}

	public void jump() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location secondNext = next.getAdjacentLocation(getDirection());
		if (gr.isValid(secondNext)) {
			moveTo(secondNext);
		} else {
			removeSelfFromGrid();
		}
	}

	public boolean canJump() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return false;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location secondNext = next.getAdjacentLocation(getDirection());
		if (! gr.isValid(secondNext)) {
			return false;
		}
		Actor obstacle = gr.get(secondNext);
		Actor jumped = gr.get(next);
		if (((obstacle == null) || (obstacle instanceof Flower)) && (jumped != null)) {
			return true;
		} else {
			return false;
		}
	}

}
