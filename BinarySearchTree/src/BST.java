import org.w3c.dom.Node;

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
}
