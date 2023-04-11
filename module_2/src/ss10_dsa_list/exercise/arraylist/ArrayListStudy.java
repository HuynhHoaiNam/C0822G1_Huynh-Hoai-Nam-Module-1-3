package ss10_dsa_list.exercise.arraylist;

import java.util.Arrays;

public class ArrayListStudy<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public ArrayListStudy() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListStudy(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacicy" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {

        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {

        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        elements[size] = element;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int mincappacity) {
        if (mincappacity >= 0) {
            int newSize = this.elements.length + mincappacity;
        }
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
        return (E) elements[index];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return 1;
            }
        }
        return index;
    }

    public boolean constans(E elment) {
        return this.indexOf(elment) >= 0;
    }

    public ArrayListStudy<E> clone() {
        ArrayListStudy<E> v = new ArrayListStudy<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error index " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
