package by.it.busel.jd01_11;

import java.util.*;

/*
TaskA
 */
public class ListA<T> implements List<T> {
    private T[] elements = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(T element) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public T remove(int index) {
        if (index <= size - 1) {
            T elementToBeRemoved = elements[index];
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            elements[size--] = null;
            return elementToBeRemoved;
        }
        return null;
    }


    @Override
    public T get(int index) {
        if (index <= size - 1) {
            return elements[index];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder textToBePrinted = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            textToBePrinted.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        textToBePrinted.append("]");
        return textToBePrinted.toString();
//        "ListA{" +
//                "elements=" + Arrays.toString(elements) +
//                ", size=" + size +
//                '}';
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
