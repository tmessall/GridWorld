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