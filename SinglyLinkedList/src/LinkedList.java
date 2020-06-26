public class LinkedList {
    private Node head;
    private long size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void insertFirst(Node node){
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }

    public void removeFirst(){
        Node deleted = this.head;
        head = deleted.getNext();
        deleted.setNext(null);
        this.size--;
    }

    public void printList(){
        while(this.head != null){
            System.out.println(this.head.getData());
            this.head = this.head.getNext();
        }
    }
}
