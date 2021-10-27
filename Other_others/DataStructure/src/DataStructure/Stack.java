package DataStructure.src.DataStructure;

public class Stack {
    private int numberOfElements;
    private int element;

    public void push(int element) {
        this.element = element;
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
        return element;
    }

    public static class UnderFlowException extends RuntimeException {
        public UnderFlowException(String message) {
            super(message);
        }
    }
}
