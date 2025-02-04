# Efficient Bus Routes 
## Problem
The government has decided to reduce costs by eliminating bus lines which have overlap. 
If a bus line has overlap with another bus line, either in head or tail of its route, that bus line can be eliminated 
and be replaced by the whole another one. For that, we an object of int[][], in that each row represents one bus route from start to end.
For example array = {{2, 4}, {5, 8}} represents two bus lines. The first line starts from stop '2' and ends at stop '4', the other bus line
starts from stop '5' and ends at '8'. These two lines don't have any overlap, but if they came as {{2, 5}, {4, 8}} they 
had overlap at the end of first line, and start of the second one. 
Write a method, which receives this array and returns the number of lines that could be eliminated by this plan.
Examples: <br><br>
{{2, 4}, {3, 6}, {3, 9}, {5, 7}} -> 3 <br>
{{2, 4}, {3, 6}} -> 1 <br>
{{2, 4}, {5, 6}} -> 0 <br>
{}} -> 0 <br>

## Setup/Requirements
* Java 11 or up
* Maven 3
