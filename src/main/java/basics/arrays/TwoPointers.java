package basics.arrays;

import java.util.Arrays;

public class TwoPointers {

    //1.Check if an array is a palindrome
    public boolean isArrayPalindrome(int [] arr){
        boolean isPalindrome = true;

        int left =0;
        int right = arr.length-1;

        while (left<right){
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;

    }

    //2.Find pair summing to target in sorted array
    public int [] findPairTargetSumInSortedArr(int arr[],int target){
        int left =0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]+arr[right]==target){
                return  new int[]{arr[left],arr[right]};
            }
            right--;
        }
        return null;
    }

    //3.Count unique elements in sorted array
    public int countUniqueElementInSortedArray(int arr[]) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }

        }
        return count;

    }

    //4.Merge two sorted arrays
    public int [] mergeTwoSortedArray(int arr1[],int arr2 []){

       int [] mergedArray = new int[arr1.length+arr2.length];
       int i=0,k=0,j=0;
       while(i<arr1.length && j<arr2.length) {
           if (arr1[i] < arr2[j]) {
               mergedArray[k++] = arr1[i++];
           } else {
               mergedArray[k++] = arr2[j++];
           }
       }

           while(i<arr1.length){
               mergedArray[k++]=arr1[i++];
           }

           while (j<arr2.length){
               mergedArray[k++] = arr2[j++];
           }



        return mergedArray;
    }


    //5.Find middle element without division
    public int findMiddleElementWithoutDivision(int arr[]){
        int left =0;
        int middle =0;
        int right = arr.length-1;
        //0123456
        if(arr.length%2!=0) {
            while (left < right) {
                if (right - left == 2) {
                    middle = arr[left + 1];
                }
                left++;
                right--;
            }
        }
        return middle;
    }

    //6.Remove specific element occurrences
    public int [] removeSpecificElement(int arr [], int target){
        int left =0;
        int right=arr.length-1;
        int [] newArr = new int[arr.length-1];
        int k=0;

        while(left<=right){
            if(arr[left]!=target){
                newArr[k++]=arr[left];
            }
            left++;
        }
        return newArr;

    }

    //7.Find longest subarray with unique elements
    public int [] findLongestSubArray(int arr[]){
        int maxLength=0;
        int start =0;
        int startIndex =0;

        int [] lastSeen = new int[100];
        for (int i = 0; i <lastSeen.length ; i++) {
            lastSeen[i] = -1;
        }
        for(int end=0;end<arr.length;end++){
            if(lastSeen[arr[end]] >= start){
                start = lastSeen[arr[end]]+1;
            }
            lastSeen[arr[end]]=end;

            if(end-start+1>maxLength){
                maxLength=end-start+1;
                startIndex=start;
            }
        }
        return Arrays.copyOfRange(arr,startIndex,startIndex+maxLength);
    }

    //8.Count pairs with specific difference
    public int findPairsSpecificDifference(int arr[],int k){
        int left =0;
        int count =0;
        int right =arr.length-1;

        while(left<right){
            for (int i = left; i <arr.length ; i++) {
                if(arr[left]+arr[i]==k){
                    count++;
                }
            }
            left++;
        }
        return count;
    }

    //9.Find minimum distance between elements
    public int minimumDistanceBetweenElements(int arr[],int x,int y){
        int minimumDistance =arr.length;
        int lastIndexOfX = -1;
        int lastIndexOfY =-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                lastIndexOfX =i;
                if(lastIndexOfY !=-1){
                    minimumDistance = Math.min(minimumDistance,Math.abs(lastIndexOfX-lastIndexOfY));
                }
            }

            if(arr[i]==y){
                lastIndexOfY=i;
                if(lastIndexOfX!=-1){
                    minimumDistance =Math.min(minimumDistance,Math.abs(lastIndexOfX-lastIndexOfY));
                }
            }
        }

        return minimumDistance;
    }

    //10.Partition even and odd numbers
    public int [][] evenAndOddPartition(int arr[]){

        int left =0;
        int right = arr.length-1;
        int oddCounter =0;
        int evenCounter =0;

        for (int j : arr) {
            if (j % 2 != 0) {
                oddCounter++;
            } else {
                evenCounter++;
            }
        }
         int [] oddArr =new int [oddCounter];
         int [] evenArr = new int [evenCounter];

         int countrEven =0;
         int countrOdd =0;

         while(left<=right){
           if(arr[left]%2!=0){
               oddArr[countrOdd] =arr[left];
               countrOdd++;
           }else{
               evenArr[countrEven]= arr[left];
               countrEven++;
           }
           left++;
         }

        return  new int[][] {oddArr, evenArr};
    }

    //11.Arrange negative before positive numbers
    public int [] negativeBeforePositive(int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] < 0) {
                left++;
            }

            else if (arr[right] >= 0) {
                right--;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }

    //can't solve yet
    public int [] rotateKLeft(int [] arr, int k){
        //10 20 30 40 50 /k=3 = 40 50 10 20 30

        int left =0;
        int right =arr.length-1;




        return null;
    }
}
