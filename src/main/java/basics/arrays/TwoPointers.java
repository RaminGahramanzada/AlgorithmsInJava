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

}
