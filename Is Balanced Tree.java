/*
Given an array of unique elements, construct a Binary Search Tree and check if its balanced. A tree is said to be balanced if for every node, the difference between the height of its child nodes is not greater than 1.

Input Format

First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Constraints

1 <= T <= 1000
1 <= N <= 1000
0 <= ar[i] <= 10000

Output Format

For each test case, print "Yes" if the Binary Search Tree is balanced, "No" otherwise, separated by newline.

Sample Input 0

3
5
1 2 3 4 5 
5
3 2 4 1 5 
7
4 5 15 0 1 7 17 
Sample Output 0

No
Yes
No
Explanation 0

Self Explanatory
  */
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

    int height(Node node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    boolean isBalanced(Node node) {
        if (node == null)
            return true;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right))
            return true;

        return false;
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

            System.out.println(bst.isBalanced(bst.root) ? "Yes" : "No");
        }

        scanner.close();
    }
}
