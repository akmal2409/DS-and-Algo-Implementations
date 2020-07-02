import java.awt.dnd.DnDConstants;

public class Main {
    public static void main(String[] args){
        DNode n1 = new DNode("Talija");
        DNode n2 = new DNode("Akmal");
        DNode n3 = new DNode("Gabbo");
        DNode n4 = new DNode("Vuk");
        DNode n5 = new DNode("Teodor");

        DLinkedList listOfNames = new DLinkedList();
        listOfNames.insertFirst(n1);
        listOfNames.insertFirst(n3);

        /*
        Output should be n3 -> n1 > n4 > n2
         */
        listOfNames.printAll();
        System.out.println("------------------------");
        listOfNames.insertAfter(n1,n5);
        listOfNames.printAll();
        /*
        Output should be n3 -> n1 > n5 > n4 > n2
         */
        System.out.println("------------------------");
        System.out.println(listOfNames.removeFirst());
        // Should output n3 = "Gabbo"
        System.out.println("-------------------------");
        System.out.println(listOfNames.removeLast());
        // Should output n2 = "Akmal"

    }
}
