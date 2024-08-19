/*
Given an array of unique elements, construct a Binary Search Tree and print the Level Order of the tree.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

For each test case, print the Level Order of the Binary Search Tree, separate each level by newline. Separate the output of different test cases with an extra newline.

Output Format

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

1 
2 
3 
4 
5 

3 
2 4 
1 5 

4 
0 5 
1 15 
7 17 
Explanation 0

Self Explanatory
  */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void printLevelOrder() {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            BST bst = new BST();

            for (int i = 0; i < n; i++) {
                int value = scanner.nextInt();
                bst.insert(value);
            }

            bst.printLevelOrder();

            if (t > 0) {
                System.out.println(); // Extra newline between test cases
            }
        }

        scanner.close();
    }
}
