package DataStructure.src.DataStructure;

public class Stack {
    private int numberOfElements;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        if(isFull()) throw new OverFlowException("Full");
//        try {
            elements[numberOfElements++] = element;
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            throw new OverFlowException("Full");
//        }
    }
    public int size() {
        return numberOfElements;
    }

    public int pop() {
        if(isEmpty()) throw new UnderFlowException("Getat");
        return --numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean isFull() {
        return size() == elements.length;
    }

    public int peek() {
        if (isEmpty()) throw new UnderFlowException("Empty");
        return elements[numberOfElements - 1];
    }

    public static class UnderFlowException extends RuntimeException {
        public UnderFlowException(String message) {
            super(message);
        }
    }
    public static class OverFlowException extends ArrayIndexOutOfBoundsException {
        public OverFlowException(String message) {
            super(message);
        }
    }
}
