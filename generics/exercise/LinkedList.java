public class LinkedList {

    public static void main(String[] args) {

        Node node1 = new Node("Joe Bojangles");
        Node node2 = new Node("Billy Bob");
        Node node3 = new Node("Cpt Kangaroo");

        node1.next = node2;
        node2.next = node3;

        Node footer = new Node("Footet");
        node3.next = footer;

        Node dummy;
        dummy = node1;

        while(dummy.next != null) {
            System.out.println(dummy.getData());
            dummy = dummy.next;
        }

    }
}
    
