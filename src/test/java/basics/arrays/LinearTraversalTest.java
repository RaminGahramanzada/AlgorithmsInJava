package basics.arrays;


import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class LinearTraversalTest {
    LinearTraversal lt = new LinearTraversal();

    @Test
    void findSumOfArray() {
        int [] arr = {1,2,3,4,5};
        int actual = lt.findSumOfArray(arr);
        int expected= 15;

        assertEquals(expected,actual);
    }

    @Test
    void findTheSmallestNumber(){
        int [] arr = {4,2,3,9,5};
        int actual = lt.findTheSmallestNumber(arr);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void countEvenNum() {
        int arr[] ={6,1,3,8,9,10};
        int actual = lt.countEvenNum(arr);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void sumAllPosNum() {
        int arr[] ={6,1,3,8,9,10};
        int actual = lt.sumAllPosNum(arr);
        int expected = 37;
        assertEquals(expected,actual);
    }

    @Test
    void countAllNegNum() {
        int arr[] ={6,1,-3,8,-9,10};
        int actual = lt.countAllNegNum(arr);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void countFrequencyTargetNum() {
        int arr[] ={6,1,5,8,5,5};
        int target =5;
        int actual = lt.countFrequencyTargetNum(target,arr);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void productOfAllOddNum() {
        int [] arr = {1,2,3,4,5};
        int actual = lt.productOfAllOddNum(arr);
        int expected= 15;

        assertEquals(expected,actual);
    }

    @Test
    void isExistsTarget() {
        int target = 4;
        int [] arr ={1,2,3,4,5};
        boolean actual = lt.isExistsTarget(target,arr);
        boolean expected =true;

        assertEquals(expected,actual);
    }

    @Test
    void findDifferenceMaxAndMin() {
        int [] arr = {1,2,3,4,5};
        int actual = lt.findDifferenceMaxAndMin(arr);
        int expected= 4;
    }

    @Test
    void findIndexOfLargstElmn() {
        int [] arr = {1,2,9,4,5};
        int actual =3 ;
        int expected= lt.findIndexOfLargstElmn(arr);
    }

    @Test
    void replaceOneToZero() {
        int arr [] ={1,1,4,2,1,6};
        int [] actual = lt.replaceOneToZero(arr);
        int [] expected = {0,0,4,2,0,6};
        assertArrayEquals(expected,actual);
    }

    @Test
    void frequencyForEachElement() {
        int []  actual = {1,2,1,2,3,4,5,4,6};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1,2);
        expected.put(2,2);
        expected.put(3,1);
        expected.put(4,2);
        expected.put(5,1);
        expected.put(6,1);
        assertEquals(expected,lt.frequencyForEachElement(actual));

    }

    @Test
    void averageOfElements() {
        int [] arr ={2,4,6,8};
        double actual = lt.averageOfElements(arr);
        double expected = 5.0;
        assertEquals(expected,actual);
    }

    @Test
    void secondLargestElement() {
        int [] arr = {3,4,5,2,6};
        int actual = lt.secondLargestElement(arr);
        int expected =5;
        assertEquals(expected,actual);
    }

    @Test
    void isArrayAscendingOrdered() {
        int arr[] ={1,2,4,5,6,7};
        boolean actual = lt.isArrayAscendingOrdered(arr);
        boolean expected =true;
        assertEquals(expected,actual);
    }

    @Test
    void negativeElementReplaceToZero() {
        int arr[] = {-2,-1,5,-7};
        int [] actual =lt.NegativeElementReplaceToZero(arr);
        int [] expected = {0,0,5,0};
        assertArrayEquals(expected,actual);
    }

    @Test
    void reverseAllEven() {
        int arr[] = {1,4,3,2,8,5,6};
        int [] actual = lt.reverseAllEven(arr);
        int [] expected = {1,8,3,6,5,4,2,1};
    }
}