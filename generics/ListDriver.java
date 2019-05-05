public class ListDriver {

    public static void main(String[] args) {


        // Note that we are not using string or int primitives to initialize
        // This is because the generic datatype is initialized using the Object class
        List<String> glist = new List<String>(10);
        glist.add("Milk");
        glist.add("Eggs");
        glist.add("Bacon");
        System.out.println("grocery list: " + glist.toString());

        List<Integer> nlist = new List<Integer>(5);
        nlist.add(5);
        nlist.add(3);
        nlist.add(9);
        System.out.println("number list: " + nlist.toString()); 
    
    }
}

