/*
Given an array of unique elements, construct a Binary Search Tree and find the height of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the height of the Binary Search Tree, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

4
2
3
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class ins
{
    Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(root.data<k)
        {
            root.right=insert(root.right,k);
        }
         if(root.data>k)
        {
            root.left=insert(root.left,k);
        }
        return root;
    }
    int hei(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        return Math.max(hei(root.left),hei(root.right))+1;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ins in=new ins();
        int t=sc.nextInt();
        for(int o=0;o<t;o++)
        {
            Node root=null;
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int v=sc.nextInt();
                root=in.insert(root,v);
            }
            System.out.println(in.hei(root));
        }
    }
}
