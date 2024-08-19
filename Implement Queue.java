/*
Perform Enqueue and Dequeue operations on a queue. Implement Queue and avoid using inbuilt library.

Input Format

First line of input contains T - number of operations. Its followed by T lines, each line contains either "Enqueue x" or "Dequeue".

Constraints

1 <= T <= 10000
-100 <= x <= 100

Output Format

For each "Dequeue" operation, print the dequeued element, separated by newline. If the queue is empty, print "Empty".


Sample Input 0

8
Enqueue 5
Dequeue
Dequeue
Enqueue 10
Enqueue -15
Dequeue
Enqueue -10
Dequeue
Sample Output 0

5
Empty
10
-15
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;

public class Solution {
    int rear=-1,front=-1;
    public void enqueue(int x,int ar[])
    {
        rear+=1;
        ar[rear]=x;
    }
    public void dequeue(int ar[])
    {
        if(rear==front)
        {
            System.out.println("Empty");
        }
        else
        {
            front+=1;
            System.out.println(ar[front]);
            
        }
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int t=sc.nextInt();
        int ar[]=new int[t];
        for(int i=0;i<t;i++)
        {
            String q=sc.next();
            if(q.substring(0,1).equals("E"))
            {
                int x=sc.nextInt();
                s.enqueue(x,ar);
            }
            else
            {
                s.dequeue(ar);
            }
        }
        
    }
}
