package pl.ave;

public class Stack<T> {

    private T[] myArray;
    private int lastIndex;

    public Stack() {
        myArray = (T[]) new Object[10];
        lastIndex = -1;
    }

    public void add(T newElement) {
        if (isEmptyPlace()) {
            myArray = makeItDouble(myArray);
        }
        lastIndex++;
        myArray[lastIndex] = newElement;
    }

    public boolean isEmptyPlace() {
        return lastIndex > myArray.length - 1;
    }

    public T[] makeItDouble(T[] myArray) {
        int newArraySize = myArray.length * 2;
        return copyToNewArray(myArray, newArraySize);
    }

    public T[] copyToNewArray(T[] myArray, int newSize) {
        T[] newElements = (T[]) new Object[newSize];
        for (int i = 0; i < myArray.length; i++) {
            newElements[i] = myArray[i];
        }
        return newElements;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T popElement = myArray[lastIndex];
        myArray[lastIndex] = null;
        lastIndex--;
        return popElement;
    }

    private boolean isEmpty() {
        return lastIndex == -1;
    }

}





