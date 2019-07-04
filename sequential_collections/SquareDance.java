import java.util.PriorityQueue;
import java.io.*;

public class SquareDance {

    public static void main(String[] args) {
        PriorityQueue<String> men = new PriorityQueue<String>();
        PriorityQueue<String> women = new PriorityQueue<String>();

        String line = null;
        String file = "dance.txt";
        String gender = "";
        BufferedReader input;

        try {
            input = new BufferedReader(new FileReader(file));
            while((line = input.readLine()) != null) {
            
                gender = line.substring(0, 1);

                if (gender.equals("M")) {
                   men.add(line.substring(2));
                } else {
                   women.add(line.substring(2));
                }

            } 
            input.close(); 
        } catch(IOException e) {
            System.out.println("Error opening file");
        }

        while (!men.isEmpty() && !women.isEmpty()) {
            System.out.println("The dance partners will be: " + men.poll() + " " + women.poll());
        }

        if (men.isEmpty()) {
            System.out.println("Women waiting to dance: "); 
            for (String woman : women) {
                System.out.println(woman);
            }
        }

        if (women.isEmpty()) {
            System.out.println("Men waiting to dance: ");
            for (String man : men) {
                System.out.println(man);
            }
        }
    }

}
