package baitap12;

public class MyList<E> {
    private  int size = 0;
    static  final int DEFAULT_SIZE = 10;
    public Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }

    }
    void add(int index , E element){

    }
    E remove(int index ){
        return null;
    }
    int size() {
        return size;
    }
    public E clone() {
        return null;
    };
    boolean contains(E o){
        return false;
    }
    int indexOf(E o){
        return 0;
    }
    boolean add(E e){
        return false;
    }
    void ensureCapacity(int minCapacity){
        elements = new Object[minCapacity];
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }

    }
    E get(int i){
        return null;
    }
    void clear(){
        size = 0;
    }
}