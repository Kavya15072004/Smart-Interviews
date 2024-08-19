/*
Perform push and pop operations on a deque. Implement Deque and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "push_front x" or "push_back x" or "pop_front" or "pop_back".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each of "pop_front" and "pop_back" operations, print the popped element, separated by newline. If the deque is empty, print "Empty".

Sample Input 0

10
push_back 5
pop_front
pop_front
push_back 10
push_front -15
pop_back
push_back -10
push_back 20
pop_front
pop_front
Sample Output 0

5
Empty
10
-15
-10
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        Deque<Integer> de=new ArrayDeque<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String q=sc.next();
            if(q.equals("push_back"))
            {
                int n=sc.nextInt();
                de.addLast(n);
                
            }
            else if(q.equals("push_front"))
            {
                int n=sc.nextInt();
                de.addFirst(n);
                //  System.out.println(de.getFirst());
            }
            else if(q.equals("pop_front"))
            {
                if(de.isEmpty())
                {
                    System.out.println("Empty");
                }
                else
                {
                System.out.println(de.removeFirst());
                }
            }
            else if(q.equals("pop_back"))
            {
                if(de.isEmpty())
                {
                    System.out.println("Empty");
                }
                else
                {
               System.out.println(de.removeLast());
                }
            }
        }
    }
}
