package in.gagan.datastructure.list;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_INCREMENT_FACTOR = 2;

    private T[] array;
    private int capacity;
    private int length;
    private transient int modCount = 0;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        ensureCapacity(capacity);
        this.array = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.length = 0;

    }

    private void ensureCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Array Capacity cannot be less than 0");
        } else if (capacity < Integer.MIN_VALUE || capacity > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array capacity cannot be less than Integer min and greater than integer max");
        }
    }

    public void add(T element) {
        resizeAndCopyArray();
        this.array[length++] = element;
    }

    private void resizeAndCopyArray() {
        if (this.capacity == 0) {
            this.capacity = this.DEFAULT_CAPACITY;
        } else if (this.length + 1 >= this.capacity) {
            T[] newArray = (T[]) new Object[this.DEFAULT_INCREMENT_FACTOR * this.capacity];
            System.arraycopy(this.array, 0 , newArray, 0, this.length - 1);
        }
    }

    public void set(int index, T element) {
        checkIndexBounds(index);
        this.array[index] = element;
    }

    private void checkIndexBounds(int index) {
        if (index < 0 || index > this.length - 1) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public boolean remove(int index) {
        checkIndexBounds(index);

        T[] newArray = (T[]) new Object[this.length - 1];
        for (int i = 0, j = 0; i < this.length - 1 ; i++, j++) {
            if (i == index) {
                i++;
            }
            newArray[j] = this.array[i];
        }
        this.array = newArray;
        return true;
    }

    public boolean remove(T element) {
        T[] newArray = (T[]) new Object[this.length - 1];
        for (int i = 0, j = 0; i < this.length - 1 ; i++, j++) {
            if (this.array[i].equals(element)) {
                i++;
            }
            newArray[j] = this.array[i];
        }
        this.array = newArray;
        return true;
    }

    public T get(int index) {
        checkIndexBounds(index);
        return this.array[index];
    }

    public int indexOf(T element) {
        for (int index = 0; index < this.length - 1; index++) {
            if (this.array[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public int size() {
        return this.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        String toStr = "[";
        for (T t: this.array) {
            toStr += t;
        }
        toStr += "]";
        return toStr;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }
}
