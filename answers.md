# Part 1

## Do You Know?

### Set 1

1. No, the bug does not always move to a new location. Sometimes it will turn instead.

2. Forwards (the direction the antennae are facing)

3. The bug turns 45 degrees to the right if it does not move.

4. The bug leaves a flower behind after it moves.

5. When the bug is at the edge, so long as there is not an edge directly in front of it, its behavior is unchanged. When the edge is in front of it, it will turn to the right 45 degrees until it is unobstructed, and can move forwards.

6. The bug will turn 45 degrees to the right and then move forwards.
7. No, flowers do not move.

8. Flowers become less intense in their red color with each step.

9. No, the rock is only an obstruction for the bug.

10. A bug and a flower can occupy the same location, but a rock must be by itself.

## Exercises

1. setDirection Table

Degrees 	Compass Direction
=======     =================
0 			North
45 			Northeast
90			East
135			Southeast
180			South
225 		Southwest
270 		West
315			Northwest
360 		North

2. The bug can be moved in any direction, to any spot, as far as is possible on the grid. If the bug is told to move outside the grid, it throws an illegalExpression error.

3. The setColor(java.awt.Color) method.

4. The bug disappeared


# Part 2

## Do You Know?

### Set 2

1. To make sure the bug does not try to move outside of its box.

2. To count how many grids the bug has moved in order to make sure it does not try to move outside its box.

3. Because when steps == sideLength, it means the bug has reached the edge of its box, so it must turn 90 degrees to the right in order to not leave the box..

4. Because BoxBug extends Bug, and that means it can do anything a bug can do, including move.

5. Yes, because it will always take x steps and turn.

6. If it runs into something, yes. If there is a rock in front of it, it can no longer move, so it will turn to avoid it.

7. After it reaches the boundary of the box and turns 90 degrees.

## Exercises

1. The CircleBug turns 45 degrees instead of 90, so it creates an octagon shape instead of a square.

2. Write code

3. Write code

4. Write code

5. Create a new BoxBug, and do a world.add(Location, BoxBug) to add a new one to the grid.


# Part 3

## Do You Know?

### Set 3

1. loc1.getRow()

2. false

3. 4, 4

4. 135

5. It is fed a direction when called

### Set 4

1. ArrayList<Location> getOccupiedLocations() to obtain a count of the objects in the grid (each occupied location contains an object), and then getNumRows() * getNumCols() to find the number of locations, and subtract the number of occupied from the number of total locations to obtain a count of all of the empty locations in a bounded grid.

2. isValid(new Location(10, 10))

3. Because Grid is an interface is something larger which allows other things to interact, such as locations and objects in this case. As such, the way it does that is beyond our view, but what matters is we can make other objects interact in grids.

4. No, if a grid was unbounded it could have a very large number of objects in it, and the number of objects could change. An ArrayList adapts to changes in list sizes better than an Array, and will not have empty spots if something is removed. As such, an ArrayList is the better option.

### Set 5

1. Color, Direction, and Location

2. Blue and North

3. Because there are many kinds of the Actor class which have to interact with each other, rather than just being a platform for other classes to interact with each other.

4. No, the actor cannot put itself into a grid twice because one of the preconditions of doing this is that the actor is not contained within a grid. The same goes for removing itself twice, as one of the preconditions is that the actor is contained within a grid. If the actor is put in, removed, and put back in, it is replaced and is a new actor. This can be tested by changing the color, then removing an actor then replacing it. The actor is reset.

5. setDirection(getDirection() + 90)

### Set 6

1.  Location next = loc.getAdjacentLocation(getDirection());
	if (!gr.isValid(next)) {
		return false;
	}

2.  Actor neighbor = gr.get(next);     
	return (neighbor == null) || (neighbor instanceof Flower); 

3. isValid(Location loc), get(Location loc) are both used to make sure that there is not an obstruction and that there is a real location in front of the bug.

4. getAdjacentLocation(int direction) is used to get the location in front of the bug in so that grid can check that location for existence/a rock.

5. getGrid() and getLocation() are both used to ensure that the actor can move, and the location/grid are used to check other instances that would prevent movement (such as a rock).

6. It removes itself from the grid.

7. A flower has to be put in the grid after the bug has moved, so getLocation() would not work for that instance. In the other two times that loc is used, though, it would be okay to use getLocation() instead of creating a variable.

8. Because the bug passes its color to the flower.

9. Yes, a flower is always added to the bugs location at the beginning of the move() function at the end.

10. flower.putSelfInGrid(gr, loc);

11. 4 times

## Group Activity

1.  a. The jumper will move forwards one step, then try to jump again.
	b. The jumper will move forwards once then turn to the right.
	c. It will turn to the right and see if it is facing the edge of the grid still.
	d. It will move forwards once then try to jump again.
	e. It will jump over it, if possible.
	f. If it can can jump or not.

2.  a. The Bug class, it is fairly similar in behavior and Jumper is only slightly more 	complicated.
	b. The Bug class is similar. 
	c. No, the way it moves just has to be different.
	d. act() should be overwritten.
	e. canJump(), to test if the jumper can jump, and jump(), to make the jumper jump.
	f. Create a tester and add various objects in front to see whether or not it works.


# Part 4

## Do You Know?

### Set 7

1. getGrid(), getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove(), getNeighbors(), getLocation(), removeSelfFromGrid(), getEmptyAdjacentLocations(), moveTo()

2. getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove()

3. No, the getActors() method should be suitable for all critter daughter classes because it is simply looking at what actors are around the critter.

4. It could simply save the locations of all of them, it could remove them if they are not of a certain type and then save the locations of the ones that were not removed, or it could randomly pick N actors and remove them then save those locations.

5. getMoveLocations(), selectMoveLocation(), and moveTo(Location). The first one finds what locations are unoccupied (or occupied by an actor that will be removed) and the critter could theoretically move to. The second decides which among this list of locations the critter will move to, and the third moves the critter to the decided location.

6. Because a critter is just an actor that processes other actors, and as such does not need a constructor because it is a basic actor.

### Set 8

1. Because a ChameleonCritter overrides the methods that are invoked in act, without overriding act itself.

2. Because after the ChameleonCritter begins facing towards whatever object it copied the color of, it moves in exactly the same way as a critter.

3. By adding it to the makeMove() method of the Chameleon Critter.

4. Because the process of searching all the neighboring locations for actors does not need to be changed, even though the behavior of a ChameleonCritter changes some.

5. The Actor Class

6. getGrid()

### Set 9

1. Because it inherits the only restriction it needs for processing actors from the Critter class.

2. It looks at all the locations in front (frontleft, front, frontright) and if there is an actor therre then it adds that actor to a list of actors. Then, in the processActors() (which is given down from critter), it eats all actors in the list that are not rocks or critters. It will eat all actors that are any other type.

3. Because the crab can only move left or right, so those are the only two locations that have to be checked.

4. (4, 3), (4, 4), (4, 5)

5. They both pick an adjacent locations to move to, but the crabs can only be right or left.

6. It checks if the locations to its right and left are occupied, and turns if they both are.

7. Because CrabCritters don't eat other critters, and a CrabCritter is a type of critter.

## Group Activity

1. RainbowCritters randomly select one of the four objects in the corner, then turn into that color. After that, they remove all surrounding objects that are the same color as them, then move like a critter. If there is not an object in any of the four corners, the RainbowCritter will brighten its color and then push all objects in the surrounding area away, and move like a critter.