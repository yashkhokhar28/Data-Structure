import java.util.Scanner;
import java.util.Stack;

class BST {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int a) {
            data = a;
            left = right = null;
        }
    }

    void Insert(int a) {
        Node node = new Node(a);
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (temp.left != null || temp.right != null) {
                if (node.data > temp.data && temp.right != null) {
                    temp = temp.right;
                } else if (node.data < temp.data && temp.left != null) {
                    temp = temp.left;
                } else {
                    break;
                }
            }
            if (node.data >= temp.data) {
                temp.right = node;
            } else {
                temp.left = node;
            }
        }
    }

    void inOrder() {
        if (root == null) {
            System.out.println("Empty !!!");
        } else {
            Node temp = root;
            Stack<Node> stack = new Stack<>();
            while (temp != null || stack.size() > 0) {
                while (temp != null) {
                    stack.push(temp);
                    temp = temp.left;
                }
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    void preOrder() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    void postOrder() {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (stack1.size() > 0) {
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) {
                stack1.push(temp.left);
            }
            if (temp.right != null) {
                stack1.push(temp.right);
            }
        }
        while (stack2.size() > 0) {
            Node temp = stack2.pop();
            System.out.print(temp.data + " ");
        }
    }

    void deleteLeafNode(int a) {
        Node parent = null;
        Node temp = root;
        while (temp.left != null && temp.data != a) {
            parent = temp;
            if (a > temp.data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        if (temp.left == null && temp.right == null) {
            if (parent.data > temp.data) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
    }

    void deleteOneChild(int a) {
        Node parent = null;
        Node temp = root;
        while (temp != null && temp.data != a) {
            parent = temp;
            if (a > temp.data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }

        if (temp.left != null && temp.right == null) {
            if (temp.data > parent.data) {
                parent.right = temp.left;
            } else {
                parent.left = temp.left;
            }
            if (temp.left != null && temp.right == null) {
                if (temp.data > parent.data) {
                    parent.left = temp.left;
                } else {
                    parent.right = temp.right;
                }
            }
        }
        if (temp.left == null && temp.right != null) {
            if (temp.data > parent.data) {
                parent.right = temp.right;
            } else {
                parent.left = temp.right;
            }
        }
    }

    void deleteTwoChild(int a) {
        Node parent = null;
        Node temp = root;

        while (temp != null && temp.data != a) {
            parent = temp;
            if (a > temp.data) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }

        if (temp.left != null && temp.right != null) {
            Node t = inorderSuccesor(temp);
            temp.data = t.data;
        }
    }

    Node inorderSuccesor(Node n) {
        boolean rightchild = true;
        Node parent = n;
        n = n.right;
        if (n.left != null) {
            rightchild = false;
        }
        while (n.left != null) {
            parent = n;
            n = n.left;
        }
        if (rightchild) {
            parent.right = n.right;
        } else {
            parent.left = n.right;
        }
        return n;
    }
}


public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST b1 = new BST();
        b1.Insert(8);
        b1.Insert(3);
        b1.Insert(11);
        b1.Insert(5);
        b1.Insert(9);
        b1.Insert(12);
        b1.Insert(13);
        b1.Insert(4);
        b1.Insert(6);
        b1.Insert(20);

//        System.out.println("Leaf Node Delete ");
//        b1.deleteLeafNode(20);
//        System.out.println();
//
//        System.out.println("Delete One Child Parent");
//        b1.deleteOneChild(12);
//        System.out.println();
//
//        System.out.println("Delete Two Chile Parent");
//        b1.deleteTwoChild(8);
//        System.out.println();

        System.out.println("Preorder Traversal");
        b1.preOrder();
        System.out.println();

        System.out.println("Inorder Traversal");
        b1.inOrder();
        System.out.println();

        System.out.println("Postorder Traversal");
        b1.postOrder();
        System.out.println();
    }
}
