import java.util.PriorityQueue;

public class Line {

    public static void main(String[] args) {
        
        PriorityQueue<String> line = new PriorityQueue<String>();

        line.add("David");
        line.add("Cynthia");
        line.add("Aaron");
        line.add("Mark");
        line.add("Emily");


        for (String name : line) {
            System.out.println(name);
        }

        line.poll();

        System.out.println("_____________________________________________");

        for (String name : line) {
            System.out.println(name);
        }
        
        System.out.println("_____________________________________________");

        System.out.println("The head: " + line.peek());
    }
}
