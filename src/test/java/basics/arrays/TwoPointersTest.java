package basics.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointersTest {

    TwoPointers tp = new TwoPointers();

    @Test
    void isArrayPalindrome() {
        int [] arr = {1,2,3,3,2,1};
        boolean actual = tp.isArrayPalindrome(arr);
        boolean expected =true;
        assertEquals(expected,actual);
    }

    @Test
    void findPairTargetSumInSortedArr() {
        int [] arr = {4,5,6,7,8,9};
        int target =10;
        int [] actual = tp.findPairTargetSumInSortedArr(arr,target);
        int [] expected = {4,6};
        assertArrayEquals(expected,actual);
    }

}