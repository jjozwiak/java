public class List<T> {

    private T[] dataStore;
    private int size;
    private int pos;

    public List(int listSize) {
        size = listSize;
        pos = 0;
        dataStore = (T[]) new Object[size];
    }

    public void add(T item) {
        dataStore[pos] = item;
        ++pos;
    }

    public String toString() {
        String items = "";
        for(int i = 0; i < pos; ++i) {
            items += dataStore[i] + " "; 
        }
        return items;
    }
}
