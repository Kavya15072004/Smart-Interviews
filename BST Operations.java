/*
You are given Q queries. Each query can be one of four types:
1 X: Insert an integer X into the binary search tree.
2 X: Delete X from the tree.
(If the node has both child present, replace it with the smallest value from its right sub-tree)
3 X: Print "Yes" if the value exists in the binary search tree, print "No" otherwise.
4: Print the Preorder traversal of the binary search tree.
Input Format

First line of input contains T - number of test cases.
The second line contains Q - the number of queries.
The Q subsequent lines each contain 2 integers A - the type of query and X - the value to be processed in the query (except for query of type 4).

Constraints

1 <= T <= 100
1 <= Q <= 100
1 <= A <= 4
-105 <= X <= 105

Output Format

For each test case, print the result, separated by newline. If no such result exists, print "null".

Sample Input 0

2
8
1 4
1 2
1 6
1 8
2 2
3 3
4
3 1
7
1 5
1 7
1 3
4
3 3
2 3
3 3
Sample Output 0

Case #1:
No
4 6 8
No
Case #2:
5 3 7
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

    Node delete(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = delete(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int testCase = 1; testCase <= T; testCase++) {
            System.out.println("Case #" + testCase + ":");

            int Q = scanner.nextInt();
            BST bst = new BST();

            for (int i = 0; i < Q; i++) {
                int type = scanner.nextInt();
                int value = (type == 4) ? 0 : scanner.nextInt();

                switch (type) {
                    case 1:
                        bst.insert(value);
                        break;
                    case 2:
                        bst.root = bst.delete(bst.root, value);
                        break;
                    case 3:
                        System.out.println(bst.search(value) ? "Yes" : "No");
                        break;
                    case 4:
                        bst.printPreOrder(bst.root);
                        System.out.println();
                        break;
                }
            }
        }

        scanner.close();
    }
}
