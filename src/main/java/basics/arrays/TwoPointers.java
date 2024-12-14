package basics.arrays;

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



}
