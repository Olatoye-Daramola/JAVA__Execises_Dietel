package DataStructure;

public interface List {
    boolean isEmpty();
    void add(int element);
    void add(int element, int position);
    void remove(int element);
    int size();
    int get(int position);
    int getIndexOf(int element);
    int getCapacity();
    void insert(int element,int index);
}
