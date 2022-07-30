package test;

class Node
{
    int nodeData;
    Node left, right;

    Node(int item)
    {
    	nodeData = item;
        left = right = null;
    }
}

public class Main {

	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
    
    //Driver Code
    public static void main (String[] args)
    {
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);

        convertBSTToSkewedTree(node);
        traverseSkewedTree(headNode);
    }
   
    static void convertBSTToSkewedTree(Node root)
    {
       
        // Initial case
        if(root == null)
        {
            return;
        }

        convertBSTToSkewedTree(root.left);

        Node rightNode = root.right;
       
        //If tree is not defined
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

       convertBSTToSkewedTree(rightNode);
    }
   
    
    static void traverseSkewedTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.nodeData + " ");
        traverseSkewedTree(root.right);       
    }
   
}
