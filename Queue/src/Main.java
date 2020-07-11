public class Main {

    public static void main(String[] args){

        Queue<String> queue = new Queue<>();
        String s1 = "Akmal";
        String s2 = "Talci";
        String s3 = "Gabbo";
        String s4 = "Vuk";

        System.out.println(queue.isEmpty()); // true

        queue.enqueue(s1);
        queue.enqueue(s2);
        queue.enqueue(s3);
        System.out.println(queue.dequeue()); // Akmal
        System.out.println(queue.dequeue()); // Talcii
    }
}
