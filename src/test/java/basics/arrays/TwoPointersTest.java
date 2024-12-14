package basics.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    void countUniqueElementInSortedArray() {
        int arr[] ={1,2,3,4,4,6};
        int actual = tp.countUniqueElementInSortedArray(arr);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void mergeTwoSortedArray() {
        int [] arr1 = {3,4,5,9};
        int [] arr2 = {2,6,10};
        int [] actual = tp.mergeTwoSortedArray(arr1,arr2);
        int [] expected = {2,3,4,5,6,9,10};
        assertArrayEquals(expected,actual);

    }

    @Test
    void findMiddleElementWithoutDivision() {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int actual = tp.findMiddleElementWithoutDivision(arr);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void removeSpecificElement() {
        int target =3;
        int [] arr = {1,2,3,4,5,6};
        int[] actual = tp.removeSpecificElement(arr,target);
        int [] expected = {1,2,4,5,6};
        assertArrayEquals(expected,actual);
    }

    @Test
    void findLongestSubArray() {
        int [] arr = {1,2,3,4,5,2,5,8,7,6,9,2,7,3};
        int [] actual =tp.findLongestSubArray(arr);
        int [] expected = {2,5,8,7,6,9};
        assertArrayEquals(expected,actual);
    }

    @Test
    void findPairsSpecificDifference() {
        int k= 5;
        int arr [] ={1,2,3,4,6,-1};
        int actual = tp.findPairsSpecificDifference(arr,k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void minimumDistanceBetweenElements() {
        int x =3;
        int y = 5;
        int [] arr ={1,2,3,4,5,6,7,3,9,10,5};
        int actual = tp.minimumDistanceBetweenElements(arr,x,y);
        int expected = 2;
        assertEquals(actual,expected);
    }
}