# Part 1

## Do You Know?

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

1. To make sure the bug does not try to move outside of its box.

2. To count how many grids the bug has moved in order to make sure it does not try to move outside its box.

3. Because when steps == sideLength, it means the bug has reached the edge of its box, so it must turn 90 degrees to the right in order to not leave the box..

4. Because BoxBug extends Bug, and that means it can do anything a bug can do, including move.

5. Yes, because it will always take x steps and turn.

6. If it runs into something, yes. If there is a rock in front of it, it can no longer move, so it will turn to avoid it.

7. After it reaches the boundary of the box and turns 90 degrees.