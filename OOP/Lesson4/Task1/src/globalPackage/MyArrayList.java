package globalPackage;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
    private E[] array;
    private int currentIndex = -1;

    public MyArrayList(E[] array){
        this.array = array;
    }

    public int size(){
        return currentIndex + 1;
    }

    public void add(E value){
        if (currentIndex + 1 < array.length){
            array[++currentIndex] = value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

    class MyArrayListIterator implements Iterator<E>{
        private Iterator<E> iterator = Arrays.stream(array).iterator();

        // есть ли в моем перечислении следующий элемент
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        // возвращает очередной следующий элемент
        // или возвращает null, если его нет
        @Override
        public E next() {
            return iterator.next();
        }
    }

}
