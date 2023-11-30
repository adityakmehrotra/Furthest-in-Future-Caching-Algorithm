# Furthest-in-Future-Caching-Algorithm

Implementing the Furthest-in-Future Algorithm for page caching.

## Furthest Algorithm in the Future Cache Paging Problem

### Problem Input Description
For each instance, the first line will be a positive integer, giving the number of pages in the cache. The second line of the instance will be a positive integer giving the number of page requests. The third and final line of each instance will be space delimited positive integers which will be the request sequence.

### Problem Output Description
For each instance, your program should output the number of page faults achieved by furthest in the future paging assuming the cache is initially empty at the start of processing the page request sequence. One output should be given per line.

### Sample Input
3<br>
2<br>
7<br>
1 2 3 2 3 1 2<br>
4<br>
12<br>
12 3 33 14 12 20 12 3 14 33 12 20<br>
3<br>
20<br>
1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 <br>

### Sample Output


### Sample Input and Output Description
The sample input has three instances. The first has a cache which holds 2 pages. It then has a request sequence of 7 pages. The second has a cache which holds 4 pages and a request sequence of 12 pages. The third has a cache which holds 3 pages and a request sequence of 20 pages.

### Time Complexity
The time complexity of the optimal weighted interval scheduling problem is **O(n * log(n))**.
