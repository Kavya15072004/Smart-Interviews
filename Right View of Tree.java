/*
Given an array of unique elements, construct a Binary Search Tree and print the right-view of the tree. Right view of a Tree is the set of nodes visible when tree is viewed from right side.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print the right-view of the Binary Search Tree, separated by newline.

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
3 4 5 
4 5 15 17 
Explanation 0

Self Explanatory
  */
import java.io.*;
import java.util.*;
class Node
{
    int data,depth;
    Node left,right;
    Node(int data,int depth)
    {
        this.data=data;
        this.depth=depth;
    }
}
class Tree
{
    Node insert(Node root,int ele,int dep)
    {
        if(root==null)
            return new Node(ele,dep);
        if(root.data>ele)
            root.left=insert(root.left,ele,dep+1);
        if(root.data<ele)
            root.right=insert(root.right,ele,dep+1);
        return root;
    }
    
    void rightView(Node root,HashSet<Integer> hs)
    {
        if(root==null)
            return;
        if(root.depth==hs.size())
        {
            hs.add(root.data);
            System.out.print(root.data+" ");
        }
        rightView(root.right,hs);
        rightView(root.left,hs);
            
            
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            Tree tr=new Tree();
            Node root=null;
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                int k=sc.nextInt();
                root=tr.insert(root,k,0);
            }
            HashSet<Integer> hs=new HashSet<>();
            tr.rightView(root,hs);
           /* Collections.sort(hs);
            for(int j:hs)
            {
                System.out.print(j+" ");
            }
            */
            System.out.println();
        }
    }
}
