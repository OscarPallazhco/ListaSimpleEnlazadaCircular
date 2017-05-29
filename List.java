
package espol.edu.ec.TDAs;

public interface List <E>{
    public boolean isEmpty();
        public E getElement(int i);
        public int getIndex(E element);
        public boolean add(E element, int i);
        public boolean addFirst(E element);
        public boolean addLast(E element);
        public boolean removeIndex(int index);
        public boolean removeElement(E element);
        public boolean removeFirst();
        public boolean removeLast();
        public List<E> concat(List<E> list);
        public int size();
        public boolean contains(E element);
        public List<E> slicing(int inicio, int fin);
    
}
