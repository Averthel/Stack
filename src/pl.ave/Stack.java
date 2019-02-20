package pl.ave;

public class Stack {

    private String[] myArray;
    private int lastIndex;

    public Stack() {
        myArray = new String[10];
        lastIndex = -1;
    }

    public void add(String newElement) {
        if (isEmptyPlace()) {
            myArray = makeItDouble(myArray);
        }
        lastIndex++;
        myArray[lastIndex] = newElement;
    }

    public boolean isEmptyPlace() {
        return lastIndex > myArray.length - 1;
    }

    public String[] makeItDouble(String[] myArray) {
        int newArraySize = myArray.length * 2;
        return copyToNewArray(myArray, newArraySize);
    }

    public String[] copyToNewArray(String[] myArray, int newSize) {
        String[] newElements = new String[newSize];
        for (int i = 0; i < myArray.length; i++) {
            newElements[i] = myArray[i];
        }
        return newElements;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String popElement = myArray[lastIndex];
        myArray[lastIndex] = null;
        lastIndex--;
        return popElement;
    }

    private boolean isEmpty() {
        return lastIndex == -1;
    }


}




