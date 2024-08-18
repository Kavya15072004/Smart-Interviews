/*
The Tower of Hanoi (also called the Tower of Brahma or Lucas') is a mathematical game or puzzle. It consists of three rods, and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.

The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
Only one disk can be moved at a time.
Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
No disk may be placed on top of a smaller disk.
Your task is that given N disks, print the minimum number of moves required in order to solve the problem, followed by the actual moves.

Assumptions
1. The rods are named A, B and C.
2. All the disks are initially placed on rod A.
3. You have to move all the disks from rod A to rod C.

Input Format

First line of input contains T - number of test cases. Its followed by T lines, each line containing a single number denoting the number of disks.

Constraints

1 <= T <= 10
1 <= N <= 15

Output Format

For each test case, print the minimum number of moves required in order to solve the problem, followed by the actual moves, separated by newline. Refer sample output for more details.

Sample Input 0

2
1
3
Sample Output 0

1
Move 1 from A to C
7
Move 1 from A to C
Move 2 from A to B
Move 1 from C to B
Move 3 from A to C
Move 1 from B to A
Move 2 from B to C
Move 1 from A to C
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
   public static int cnt=0;
    public void toh1(int n,char src,char aux,char dest)
    {
      if(n==1)
        {
          cnt+=1;
            return;
        }
        toh1(n-1,src,dest,aux);
       // System.out.println("Move "+n+" from "+src+" to "+dest);
        toh1(1,src,aux,dest);
        toh1(n-1,aux,src,dest);  
    }
    void toh(int n,char src,char aux,char dest)
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,src,dest,aux);
        System.out.println("Move "+n+" from "+src+" to "+dest);
        toh(n-1,aux,src,dest);
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            char src='A';
            char aux='B';
            char dest='C';
            s.toh1(n,src,aux,dest);
           System.out.println(cnt);
            cnt=0;
            s.toh(n,src,aux,dest);
            
        }
    }
}
