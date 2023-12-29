public interface MyList<E>{

    void addFirst(E element);
    void addLast(E element);
    int size();
    E getOfIndex(int index);
}