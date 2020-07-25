import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    BstNode root;

    public class BstNode{

        int data;
        BstNode left;
        BstNode right;

        public BstNode(int data){

            this.data = data;
            this.left = this.right = null;
        }
    }

    public BST() {

        this.root = null;
    }

    public void insert(int data){

        root = insertRec(root, data);
    }

    //recursive method to insert data in order to make tree balanced

    public BstNode insertRec(BstNode root, int data){

        if(root == null){
            root = new BstNode(data);
            return root;
        }
        if(data<root.data){
            root.left = insertRec(root.left, data);
        } else{
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(){

        inOrderRec(root);
    }

    //recursive method to traverse trough BTS in order
    public void inOrderRec(BstNode root){

        if(root != null){
            inOrderRec(root.left); // first gets to the least node on the left side and then prints in  the increasing order
            System.out.println(root.data);
            inOrderRec(root.right);  // after sout because all the data on the right is in an increasing order
        }
    }

    // Iterative approach going down to the left
    public int findMinIterative(){
        BstNode temp = root;

        while(temp.left != null){
            temp = temp.left;
        }

        return temp.data;
    }

    public int findMin(){

        return findMinRec(root).data;
    }

    public BstNode findMinRec(BstNode root){

        if(root == null){
            return null;
        } else if(root.left == null){
            return root;
        }

        return findMinRec(root.left);
    }

    public int findMaxIterative(){

        BstNode temp = root;

        while(temp.right != null){
            temp = temp.right;
        }

        return temp.data;
    }

    public int findMax(){

        return findMaxRec(root).data;
    }

    public BstNode findMaxRec(BstNode root){

        if(root == null){
            return null;
        } else if(root.right == null){
            return root;
        }

        return findMaxRec(root.right);
    }


    public int findHeight(){
        return findHeightRec(root);
    }

    public int findHeightRec(BstNode root){

        if(root == null){
            return -1;
        }

        return max(findHeightRec(root.left), findHeightRec(root.right)) + 1;
    }

    public int max(int a, int b){

        if(a<b){
            return a;
        } else{
            return b;
        }

    }


    public void preOrder(){
        preOrderRec(root);
    }

    public void preOrderRec(BstNode root){

        if(root != null){
            System.out.println(root.data);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }

    public void postOrderRec(BstNode root){

        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data);
        }
    }

    public void levelOrder(){
        if(root == null){
            return;
        }

        Queue<BstNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            BstNode current = q.element();
            q.remove();
            System.out.println(current.data);
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
        }
    }
}
