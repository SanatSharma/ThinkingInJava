package CompetitiveCoding;
/*Time Limit: 2 seconds

Memory Limit: 256MB

You are building a public transport system based on maglev trains to connect a city. There are n stations, with ids ranging from 0 to n-1; and m tracks, where a track is a bi-directional pathway between two stations. You know that it takes tm seconds for the train to travel along track m. Just after you finish building the tracks, the city tells you that they want the travel time between every possible pair of stations (assuming instant train transfers and passenger pickup at the stations) to be no greater than X seconds!

You have hired a contractor that claims, if you give them 10,000 dollars, they can add a magnet to each track in the city, that will make the transit time on each track decrease by 1 second. You can do this many times, but if you add a magnet to a track that already has a travel time of 1 second, it won't get any faster.

Can you meet the city's goals of making a total travel time less than X seconds?

If so, print out the minimum amount of money you have to spend to make the travel time between all pairs of stations less than or equal to X seconds. If it is impossible, print "IMPOSSIBLE".

Input

The first line contains an integer c (1 ≤ c ≤ 10) - the number of test cases to follow.
Each test case will be structured as:
A line containing three integers n m x, where n (2 ≤ n ≤ 200) is the number of stations, m (n ≤ m ≤ 10000) is the number of tracks, and X (1 ≤ X ≤ 1,000,000) is the desired transit time that the city specified.
The next m lines each describe one track, in the format as follows:
s1 s2 t
Where s1 and s2 (0 ≤ s1, s2 < n, s1 ≠ s2) are the ids of the two stations the track connects, and t (1 ≤ t ≤ 10,000) is the current transit time in seconds between the two stations.
It is guaranteed that every station is connected to at least 1 track and there is at most 1 track between any pair of stations.

Output

For each test case, print "IMPOSSIBLE" if the city's desired travel time is physically impossible to meet. If it is not, print out the minimum amount of dollars you would have to spend to reduce the travel time to the desired amount.

Sample Input

4
2 1 8
0 1 6
2 1 0
0 1 6
2 1 4
0 1 6
3 3 2
0 1 3
1 2 3
0 2 5
Sample Output

0
IMPOSSIBLE
20000
20000
Explanation of sample case:

For the first test case, there are two cities, and it takes 6 seconds to travel between stations. The city wants the trip to be no more than 8 seconds. Since this is already true, you don't need to pay the contractor to do anything.

For the second test case, the city wants the travel time to be 0 seconds. This is a bit unreasonable, since no matter how much you pay the contractor, they can only get the trip down to 1 second.

For the third test case, the city wants the trip to be 2 seconds faster, so you have to pay the contractor to install 2 magnets.

For the fourth case, the city looks like the left at first. After one contractor payment, the city looks like the middle one, and after two it looks like the right:

   1          1           1
 3/ \3      2/ \2       1/ \1
 /   \      /   \       /   \
0-----2    0-----2     0-----2
   5          4           3
After 1 payment, the travel time between 0 and 1 is 2 seconds and 1 and 2 is 2 seconds, but between 0 and 2 is still 4.

After 2 payments, the travel time between 0 and 1 is 1 second, the travel time between 1 and 2 is 1 second, and the travel time between 0 and 2 is 2 seconds. These travel times are all ≤ 2, so you don't have to pay the contractor any more. Therefore the minimum magnets added is 2 and the minimum cost is 20,000.
*/
public class Maglev {

}
