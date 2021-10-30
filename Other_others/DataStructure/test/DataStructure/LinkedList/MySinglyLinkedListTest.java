package DataStructure.test.DataStructure.LinkedList;

import DataStructure.src.DataStructure.LinkedList.MySinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySinglyLinkedListTest {
    MySinglyLinkedList mySinglyLinkedList;

    @BeforeEach
    void setUp() {
        mySinglyLinkedList = new MySinglyLinkedList();;
    }

    @Test
    void testThatLinkedListCanBeCreatedFrom() {
        assertNotNull(mySinglyLinkedList);
    }

    @Test
    void testThatLinkedListHasHead() {
        assertNotNull(mySinglyLinkedList.getHead());
    }
}
