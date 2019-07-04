import java.util.HashSet;

public class Names {
    
    public static void main(String[] args) {
        
        HashSet<String> names = new HashSet<String>();

        names.add("Mia");
        names.add("Jason");
        names.add("David");
        names.add("Josephine");

        System.out.println("There are " + names.size() + " names.");

        for (String name : names) {
            System.out.println(name);
        }


        if (names.contains("Lesia")) {
            System.out.println("Lesia exists");  
        } else {
            System.out.println("Lesia does not exist");
        }

        names.clear();

        System.out.println("There are " + names.size() + " names.");
    }
}


