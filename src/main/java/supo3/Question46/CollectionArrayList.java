package supo3.Question46;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CollectionArrayList<T> extends AbstractList<T> {
    private int defaultIncrease = 10;
    private int size;
    private Object[] elementData;
    public CollectionArrayList(){
        this.size = 0;
        elementData = new Object[]{};
    }
    public CollectionArrayList(int size){
        if (size > 0){
            this.size = size;
            elementData = new Object[size];
        } else if (size == 0){
            elementData = new Object[]{};
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    size);
        }

    }
    @Override
    public T get(int i){
        Objects.checkIndex(i, size);
        return (T) elementData[i];
    }
    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = (T) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(int index, T element) {
        if (index > size){
            throw new IndexOutOfBoundsException();
        } else {
            if (size == elementData.length){
                elementData = Arrays.copyOf(elementData, size + defaultIncrease);
            }
            System.arraycopy(elementData, index,
                    elementData, index + 1,
                    size - index);
            elementData[index] = element;
            size += 1;
        }
    }

    @Override
    public T remove(int i) {
        if (i >= size){
            throw new IndexOutOfBoundsException();
        }
        T oldValue = (T) elementData[i];
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(elementData, i + 1, elementData, i, newSize - i);
        elementData[size = newSize] = null;
        return oldValue;
    }


    public static void main(String[] args) {
        CollectionArrayList<Integer> list = new CollectionArrayList<>();
        list.add(4);
        list.add(2);
        list.add(2,2);
        System.out.println(list.size());
        System.out.println(list);
    }
}
