/*
Print mirror image of right-angled triangle using '*'. See examples for more details.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line contains a single integer N - the size of the pattern.

Constraints

1 <= T <= 100
1 <= N <= 100

Output Format

For each test case, print the test case number as shown, followed by the pattern, separated by newline.

Sample Input 0

4
2
1
5
10
Sample Output 0

Case #1:
 *
**
Case #2:
*
Case #3:
    *
   **
  ***
 ****
*****
Case #4:
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
Explanation 0

Self Explanatory
*/
n=int(input())
for i in range(n):
        print("Case #"+str(i+1)+":",end="")
        v=int(input())
        for k in range(v+1):
                for j in range(1,v-k+1):
                        print(" ",end="")
                for j in range(v-k+1,v+1):
                        print("*",end="")
                print()
