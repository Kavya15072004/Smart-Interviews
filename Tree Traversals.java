/*
Given an array of unique elements, construct a Binary Search Tree and print the PreOrder, InOrder and PostOrder Traversals of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the PreOrder, InOrder and PostOrder Traversals of the Binary Search Tree, separate each traversal by newline. Separate the output of different test cases with an extra newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

1 2 3 4 5 
1 2 3 4 5 
5 4 3 2 1 

3 2 1 4 5 
1 2 3 4 5 
1 2 5 4 3 

4 0 1 5 15 7 17 
0 1 4 5 7 15 17 
1 0 7 17 15 5 4 
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
        this.right=null;
        this.left=null;
    }
}
class insert
{
    public Node ins(Node root,int k)
    {
        if(root==null)
        {
            return (new Node(k));
            //return root;
        }
        if(root.data>k)
        {
            root.left=ins(root.left,k);
        }
        if(root.data<k)
        {
            root.right=ins(root.right,k);
        }
        return root;
        
    }
    public void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
     public void preorder(Node root)
    {
         if(root==null)
         {
             return;
         }
        System.out.print(root.data+" ");
          preorder(root.left);
        preorder(root.right);
    }
     public void postorder(Node root)
    {
         if(root==null)
         {
             return;
         }
        postorder(root.left);
        postorder(root.right);
          System.out.print(root.data+" ");
    }
    
     
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        insert i=new insert();
        int t=sc.nextInt();
        for(int o=0;o<t;o++)
        {
            int n=sc.nextInt();
            Node root=null;
            for(int j=0;j<n;j++)
            {
                int v=sc.nextInt();
                root=i.ins(root,v);
            }
            i.preorder(root);
                        System.out.println(" ");

            i.inorder(root);
                        System.out.println(" ");

            i.postorder(root);
                        System.out.println(" ");

            System.out.println(" ");
        }
        
    }
}
