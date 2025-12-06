package dsa;

public class MyStack {
    private int count = 0 ;
    private String[] elements = new String[5];


    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }


    public int push(String element) {
        elements[count] = element;
        return count++;
    }

    public void pop(String element) {
        elements[count] = element;
        count--;
    }

    public void peek(String element) {
        elements[count] = element;
    }

    public boolean isFull() {
        return count == elements.length;
    }
}


