package DataStructure.test.DataStructure;

import DataStructure.src.DataStructure.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    public void startEachWithThis() {
        stack = new Stack();
    }

    @Test
    void stackCanBeCreatedTest() {
        assertNotNull(stack);
    }

    @Test
    void addXStackSizeIs1Test() {
        stack.push(3);
        assertEquals(1, stack.size());
    }

    @Test
    void addXYStackSizeShouldBe2Test() {
        stack.push(3);
        stack.push(3);
        assertEquals(2, stack.size());
    }

    @Test
    void addXRemoveXStackShouldBeEmptyTest() {
        stack.push(3);
        stack.pop();
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }

    @Test
    void removeFromEmptyStackThrowsUnderFlow() {
        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderFlowException.class, ()->stack.pop());
    }

    @Test
    void addXPeekShowX() {
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        assertEquals(9, stack.peek());
    }
}