package ru.mirea.task13;

public class myArray <T>{
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item)
    {
        if( pointer == (array.length - 1) )
            resize(array.length + 1);
        array[pointer++] = item;
    }

    public void remove(int index)
    {
        for (int i = index; i < pointer; i++)
            array[i] = array[i+1];

        array[pointer] = null;
        pointer--;
    }

    private void resize(int newLength)
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public T get(int index)
    {
        return (T) array[index];
    }

    public void set(int index, T item)
    {
        array[index] = item;
    }

    public int size()
    {
        return pointer;
    }
}
