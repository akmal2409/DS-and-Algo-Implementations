import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args){

        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder();

        System.out.println("/////////////");
        System.out.println(tree.findMinIterative()); // output: 20 passed

        System.out.println("/////////////");
        System.out.println(tree.findMin()); // output: 20 passed

        System.out.println("/////////////");
        System.out.println(tree.findMaxIterative()); // output: 80 passed

        System.out.println("/////////////");
        System.out.println(tree.findMax()); // output: 80 passed

        System.out.println("/////////////");
        System.out.println(tree.findHeight()); // output: 2
    }

}
