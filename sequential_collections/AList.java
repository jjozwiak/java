import java.util.ArrayList;

public class AList {

    public static void main(String[] args) {
        
        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(100);
        grades.add(90);
        grades.add(80);
        grades.add(70);
        grades.add(60);

        int total = 0;

        /*
        for (int i = 0; i < grades.size(); ++i) {
            total += grades.get(i);            
        }*/

        for (Integer grade : grades) {
            total += grade;
        }

        System.out.println("Num of grades: " + grades.size());
        System.out.println("Average:  " + total / grades.size());

        grades.remove(4);

        System.out.println("Num of grades: " + grades.size());

        grades.add(95);
        grades.add(88);
        grades.add(92);

        System.out.println("Num of grades: " + grades.size()); 


    }

}
