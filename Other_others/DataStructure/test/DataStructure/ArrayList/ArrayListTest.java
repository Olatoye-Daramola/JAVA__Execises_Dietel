package DataStructure.test.DataStructure.ArrayList;

import DataStructure.src.DataStructure.ArrayList.ArrayList;
import DataStructure.src.DataStructure.ArrayList.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List myArrayList;

    @BeforeEach
    public void startEachTestWith(){
        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest(){
//        List myArrayList = new ArrayList();
        assertNotNull(myArrayList);
    }
    @Test
    public void newArrayListIsEmptyTest(){
//        List myArrayList = new ArrayList();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addElement_ArrayListShouldNotBeEmpty(){
        //when
        myArrayList.add(34);
        //check
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void addXElementRemoveElementY_ArrayListShouldBeEmptyTest(){
        myArrayList.add(34);
        myArrayList.remove(34);
        //check
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addXandYAndRemoveY_ArrayShouldNotbeEmptyTest(){
        //when
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        //check
        assertFalse(  myArrayList.isEmpty());
    }
    @Test
    public void removeFromEmptyArrayList_shouldThrowException(){
        assertThrows(IllegalArgumentException.class, ()-> myArrayList.remove(34));
    }
    @Test
    public void addElement_ArrayListSizeIsOne(){
        myArrayList.add(34);

        assertEquals(1, myArrayList.size());
    }
    @Test
    public void replaceElementInArrayList(){
        myArrayList.add(34);
        myArrayList.add(94, 0);

        assertEquals(94, myArrayList.get(0));
    }
    @Test
    public void addThreeElement_andReturnTheElementAtIndex2(){
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.add(45);

        assertEquals(99, myArrayList.get(1));
    }
    @Test
    public void getIndexOfElementTest(){
        myArrayList.add(34);
        myArrayList.add(37);
        myArrayList.add(78);
        assertEquals(2, myArrayList.getIndexOf(78));
    }
    @Test
    public void arraylistIsElastic(){
        assertEquals(3, myArrayList.getCapacity());
        myArrayList.add(78);
        myArrayList.add(72);
        myArrayList.add(73);
        myArrayList.add(65);
        myArrayList.add(45);
        assertEquals(6, myArrayList.getCapacity());
        assertEquals(5, myArrayList.size());
        myArrayList.add(45);
        myArrayList.add(45);
        myArrayList.add(45);
        myArrayList.add(45);
        assertEquals(12, myArrayList.getCapacity());
        assertEquals(10, myArrayList.size());
    }

    @Test
    void addXYZ_removeY_ZShouldBeInThePositionOfY() {
        myArrayList.add(72);
        myArrayList.add(73);
        myArrayList.add(65);
        assertEquals(73, myArrayList.get(1));
        myArrayList.remove(73);
        assertEquals(65, myArrayList.get(1));
    }

    @Test
    void addWYZ_insertXBetweenWAndY_IndexOfYZShouldIncrease() {
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(6);
        assertEquals(5, myArrayList.get(1));
        assertEquals(6, myArrayList.get(2));
        myArrayList.insert(4, 1);
        assertEquals(4, myArrayList.get(1));
        assertEquals(5, myArrayList.get(2));
//        assertEquals(6, myArrayList.get(3));
    }
}
