public class ArrDisplay {

    static <T> void Display(T[] arr) {
        for(int i=0; i < arr.length; ++i) {
            if(arr[i] != null) {
                System.out.println(arr[i]);
            }
        }  
    }

    public static void main(String[] args) {
    
        String[] names = new String[10];
        names[0] = "Joe";
        names[1] = "Emily";
        names[2] = "Slava";
        Display(names);

        Integer[] numbers = new Integer[5];
        numbers[0] = 345;
        numbers[1] = 98676;
        numbers[2] = 8373;
        numbers[3] = 737;
        numbers[4] = 98;
        Display(numbers);

    }


}
    
