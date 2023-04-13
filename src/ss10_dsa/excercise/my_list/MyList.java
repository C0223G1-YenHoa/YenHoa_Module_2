package ss10_dsa.excercise.my_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public Object[] getElements() {
        return elements;
    }

    private void ensureCapacity() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }


    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public Object remove(int index) {
        checkIndex(index);
        Object element = elements[index];
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public String toString() {
        return "MyList" +
                Arrays.toString(elements);

    }
}
