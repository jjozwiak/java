public class PairProg {

    public static void main(String[] args) {
    
        Pair<String, Integer> grade1 = new Pair<String, Integer>("John Doe", 85);
        Pair<String, Integer> grade2 = new Pair<String, Integer>("Billy Bob", 95);

        System.out.println(grade1.first() + " - " + grade1.second());

        System.out.println(grade2.first() + " - " + grade2.second());  
        

    }
}
