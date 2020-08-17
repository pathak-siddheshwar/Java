import java.util.*;
import java.lang.*;
import java.io.*;
class BSTNode{
    int key;
    BSTNode left;
    BSTNode right;

   public BSTNode(int key) {
       this.key = key;
       this.left = null;
       this.right = null;
   }

   public BSTNode(){
       key=0;
       left=null;
       right=null;
   }

   public int getKey() {
       return key;
   }

   public void setKey(int key) {
       this.key = key;
   }

   public BSTNode getLeft() {
       return left;
   }

   public void setLeft(BSTNode left) {
       this.left = left;
   }

   public BSTNode getRight() {
       return right;
   }

   public void setRight(BSTNode right) {
       this.right = right;
   }
}
public class BinarySearchTree{
   BSTNode root;
   //creating node
//    public BinarySearchTree(int key)
//    {
//        this.root=new BSTNode(key);
//    }
   public BinarySearchTree()
   {
       root=null;
   }

   //Inserting according to the binary search tree properties
   public void insert(int key)
   {
       root=insert(root,key);
   }

   public BSTNode insert(BSTNode n,int key)
   {
       if(n==null)
       {
           n=new BSTNode(key);
           return n;
       }
        if(key<n.key)
            n.left=insert(n.left,key);
        else if(n.key<key)
            n.right=insert(n.right,key);
       
        return n;
    }


   //Pre-Order traversal of a binary BinarySearchTree
   public void preOrder(BSTNode node)
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
   //Post-Order traversal of a binary BinarySearchTree
   public void postOrder(BSTNode node)
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
   //In-Order traversal of a binary BinarySearchTree
   public void inOrder(BSTNode node)
   {
       if(node!=null){
        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
       }
   }
   public void inOrder()
   {
       inOrder(root);
   }
   
   //method to delete a particular node from the tree
   public void delete(int key)
   {
       root=delete(root,key);
   }
   
   public BSTNode delete(BSTNode node,int key)
   {
       //if tree is empty
        if(node==null)
        {
            return node;
        }
        //if key is less than the root.key traverse to the left of the tree
        else if(node.key>key)
        {
            node.left=delete(node.left,key);
        }
        //if the key is more than the root.key traverse to the right of the tree
        else if(node.key<key)
        {
            node.right=delete(node.right,key);
        }
        //if the key is equal to the root.key than this node is to be deleted
        else
        {
            //node with only one child or no child
            if(node.left==null)
             return node.right;
            else if(node.right==null)
             return node.left;
            
            //deleting the inorder successor of the right subtree(smallest of the right sub tree)
            node.key=minValue(node.right);
            node.right=delete(node.right, node.key);
        }
        return node;
   }

   public int minValue(BSTNode node)
   {
       int min=node.key;
       while(node.left!=null)
       {
           min=node.left.key;
           node=node.left;
       }
       return min;
   }


   //searching a value in a binary search tree
   public void search(int key)
   {
       search(root,key);
   }

   public void search(BSTNode node, int key)
   {
        if(node==null)
        {
            System.out.println("key not found");
            return;
        }
        if(node.key==key)
        {
            System.out.println("key found");
        }

        if(key<node.key)
            search(node.left,key);
        else if(key>node.key)
            search(node.right,key);
   }
   //main method
   public static void main(String[] args)
   {
       BinarySearchTree t=new BinarySearchTree();
       t.insert(128);
       t.insert(111);
       t.insert(212);
       t.insert(129);
       t.insert(42);
       t.insert(119);
       t.insert(118);
       System.out.println("in order traversal");
       t.inOrder();
        t.delete(111);
        System.out.println("in order traversal");
       t.inOrder();
       t.search(134545);
   }

}