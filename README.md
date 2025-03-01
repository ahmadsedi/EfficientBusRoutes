# Efficient Bus Routes
The government has decided to reduce costs by eliminating redundant bus lines. Bus lines are redundant, if they can cover by other bus lines. In other
words if a bus line overlaps another bus line, either in head or tail of the line, the overlapped one can be eliminated. 
  
## Problem
To solve the issue, the information of lines which includes all stops are provided through a two dimension integer array (int[][]). Each row in the provided array
represents one bus route from start to end. For example array = {{2, 4}, {5, 8}} represents two buses lines. The first line starts from stop '2' and ends at stop '4', the other bus line
starts from stop '5' and ends at '8'. These two lines don't have any overlap, but if they came as {{2, 5}, {4, 8}} they 
had overlap at the end of first line, and start of the second one. 

The project hosted in this repository uses Java functional programming to process the array and returns the number of lines that could be eliminated.

## Test Cases
Given: {{2, 4}, {3, 6}, {3, 9}, {5, 7}} -> expected: 3 <br>
Given: {{2, 4}, {3, 6}} -> expected: 1 <br>
Given: {{2, 4}, {5, 6}} -> expected: 0 <br>
Given: {}} -> expected: 0 <br>

## Setup/Requirements
* Java 11 or up
* Maven 3
