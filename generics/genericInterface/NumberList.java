public class NumberList<T> implements IList<T> {
    
    private T[] dataStore;
    private int size;
    private int pos;

    public NumberList(int listSize) {
        size = listSize;
        pos = 0;
        dataStore = (T[]) new Object[size];
    }

    public void add(T item) {
        dataStore[pos] = item;
        ++pos;
    }

    public T get(int index) {
        return dataStore[index];
    }

}
