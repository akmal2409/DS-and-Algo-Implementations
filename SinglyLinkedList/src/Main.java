public class Main {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Node n1 = new Node("Alex");
        Node n2 = new Node("Akmal");
        Node n3 = new Node("Talija");
        Node n4 = new Node("Vuk");
        list.insertFirst(n2);
        list.insertFirst(n1);
        list.insertFirst(n3);
        list.insertFirst(n4);
        list.printList();
    }
}
