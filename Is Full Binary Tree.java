/*
Given an array of unique elements, construct a Binary Search Tree and check if its a Full Binary Tree [FBT]. A FBT is one in which each node is either a leaf or possesses exactly 2 child nodes.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print "True" if the Binary Search Tree is a FBT, "False" otherwise, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
11
8 3 30 15 40 18 12 17 25 1 7 
7
4 5 15 0 1 7 17 
Sample Output 0

False
True
False
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node right,left;
    Node(int data)
    {
        this.data=data;
    }
}
class Tree
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
    
    boolean isFull(Node root)
    {
        if(root.left==null && root.right==null)
        {
            return true;
        }
        if((root.left==null && root.right!=null ) ||(root.left!=null && root.right==null ))
        {
            return false;
        }
        return isFull(root.left)&&isFull(root.right);
    }
}

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            Node root=null;
            Tree t=new Tree();
            for(int j=0;j<k;j++)
            {
                int h=sc.nextInt();
                root=t.insert(root,h);
            }
            if(t.isFull(root))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
        
        
    }
}
