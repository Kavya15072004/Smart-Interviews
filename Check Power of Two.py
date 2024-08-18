/*
Given a number, check if it is a power of 2.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single positive integer.

Constraints

1 <= T <= 10000
1 <= N <= 1018

Output Format

For each test case, print "True" or "False", separated by new line.

Sample Input 0

5
1
8
10
25
512
Sample Output 0

True
True
False
False
True
Explanation 0

Self Explanatory
*/
l=[1]
for i in range(1,100):
    l.append(l[i-1]*2)
for i in range(int(input())):
    m=int(input())
    if(m in l):
        print("True")
    else:
        print("False")
    
