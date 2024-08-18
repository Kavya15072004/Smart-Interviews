/*
Given 2 numbers, find their LCM and HCF.
Note: Do not use any inbuilt functions/libraries for your main logic.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each contains 2 numbers A and B.

Constraints

1 <= T <= 105
1 <= A,B <= 109

Output Format

For each test case, print their LCM and HCF separated by space, separated by newline.

Sample Input 0

4
4 710
13 1
6 4
605904 996510762
Sample Output 0

1420 2
13 1
12 2
7740895599216 78
Explanation 0

Self Explanatory
*/
def gcd(a,b):
    while b:
        a,b=b,a%b
    return a
def lcm(a,b):
    return(a*b)//gcd(a,b)
T = int(input())
for _ in range(T):
    A,B=map(int,input().split())
    LCM=lcm(A,B)
    HCF=gcd(A,B)
    print(LCM, HCF)
