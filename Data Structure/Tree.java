import java.util.*;
import java.lang.*;
import java.io.*;
class TreeNode{
     int key;
     TreeNode left;
     TreeNode right;

    public TreeNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public TreeNode(){
        key=0;
        left=null;
        right=null;
    }
}
public class Tree{
    TreeNode root;
    //creating node
    public Tree(int key)
    {
        this.root=new TreeNode(key);
    }
    public Tree()
    {
        root=null;
    }
    //Pre-Order traversal of a binary tree
    public void preOrder(TreeNode node)
    {
        if(node==null)
            return;

        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void preOrder()
    {
        preOrder(root);
    }
    //Post-Order traversal of a binary tree
    public void postOrder(TreeNode node)
    {
        if(node==null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }
    public void postOrder()
    {
        postOrder(root);
    }
    //In-Order traversal of a binary tree
    public void inOrder(TreeNode node)
    {
        if(node==null)
            return;

        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.key);
    }
    public void inOrder()
    {
        inOrder(root);
    }
    //main method
    public static void main(String[] args)
    {
        Tree t=new Tree();
        t.root=new TreeNode(23);
        t.root.left=new TreeNode(34);
        t.root.right=new TreeNode(45);
        t.root.left.left=new TreeNode(6567);
        t.root.right.left=new TreeNode(4545);
        t.root.left.right=new TreeNode(89);
        System.out.println("Pre order");
        t.preOrder();
        System.out.println("post order");
        t.postOrder();
        System.out.println("in order");
        t.inOrder();
    }

}