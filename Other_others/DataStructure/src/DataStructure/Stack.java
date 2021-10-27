package DataStructure.src.DataStructure;

public class Stack {
    private int numberOfElements;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        elements[numberOfElements] = element;
        numberOfElements++;
    }
    public int size() {
        return numberOfElements;
    }

    public void pop() {
        if(isEmpty()) throw new UnderFlowException("Getat");
        numberOfElements--;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int peek() {
        return elements[numberOfElements - 1];
    }

    public static class UnderFlowException extends RuntimeException {
        public UnderFlowException(String message) {
            super(message);
        }
    }
}
