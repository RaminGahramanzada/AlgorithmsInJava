package basics.arrays;

import java.util.HashMap;
import java.util.Map;

public class LinearTraversal {

    //1.Find the sum of all elements in an array
    public int findSumOfArray(int [] arr){
        int sum =0;
        for(int element : arr){
            sum+=element;
        }
        return sum;
    }

    //2.Find the smallest element in an array
    public int findTheSmallestNumber(int [] arr){
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }

    //3.Count the even numbers in an array
    public int countEvenNum(int arr[]){
        int count =0;

        for(int element : arr){
            if(element%2==0){
                count++;
            }
        }

        return count;
    }

    //4.Find the sum of all positive numbers in an array
    public int sumAllPosNum(int arr[]){
        int sum =0;

        for(int element : arr){
            if(element>0){
                sum+=element;
            }
        }

        return sum;
    }

    //5.Count the negative numbers in an array
    public int countAllNegNum(int []arr){
        int count=0;

        for(int element : arr){
            if(element<0){
                count++;
            }
        }

        return count;
    }

    //6.Determine how many times a specific element appears
    public int countFrequencyTargetNum(int target,int arr[]){
        int count =0;

        for(int element : arr){
            if(element==target){
                count++;
            }
        }

        return count;
    }

    //7.Calculate the product of all odd numbers
    public int productOfAllOddNum(int arr[]){
        int product =1;

        for(int element : arr){
            if(element%2!=0){
                product*=element;
            }
        }

        return product;
    }

    //8.Check if a specific element exists in an array
    public boolean isExistsTarget(int target,int arr[]){

        for(int element : arr){
            if(target==element){
                return true;
            }
        }

        return false;
    }

    //9.Find difference between max and min elements
    public int findDifferenceMaxAndMin(int arr[]){
        int diff =0;
        int max=arr[0];
        int min =arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        diff = max-min;

        return diff;
    }

    //10.Find the index of the largest element
    public int findIndexOfLargstElmn(int arr[]){
        int index =0;
        int max =arr[0];

        for(int element :arr){
            if(max<element){
                max = element;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                index=i;
            }
        }

        return index+1;//array's first index 0 but I want 1
    }

    //11.Replace all ones with zero
    public int [] replaceOneToZero(int[] arr){
        int [] replacedArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                replacedArr[i]=0;
            }else{
                replacedArr[i] =arr[i];
            }
        }
        return replacedArr;

    }


    //12.Count occurrences of each element
    public Map<Integer,Integer> frequencyForEachElement(int arr[]){

        Map<Integer,Integer> list = new HashMap<>();
        for(int element : arr){
            list.put(element,list.getOrDefault(element,0)+1);
        }
        return list;

    }

    //13.Calculate average of all elements
    public double averageOfElements(int arr[]){
        int sum =0;
        double average =0;

        for(int element :arr){
            sum+=element;
        }
        average = (double) sum /arr.length;

        return average;
    }

    //14.Find the second largest element
    public int secondLargestElement(int [] arr){
        int max =arr[0];
        int secMax =0;

       for(int i=0;i<arr.length;i++) {
           if (arr[i] > max) {
               secMax = max;
               max = arr[i];
           }
       }

        return secMax;
    }

    //15.Check if array is sorted in ascending order
    public boolean isArrayAscendingOrdered (int arr[]){
        int j =0;
        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            if(temp<arr[i]){
                j++;
                temp = arr[j];
            }else{
                return false;
            }
        }
        return true;
    }
    //16 Replace elements less than value with zero
    public int [] negativeElementReplaceToZero(int arr[]){

        int [] newArr= new int [arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[i]=0;
            }else{
                newArr[i]=arr[i];
            }

        }

        return newArr;
    }

    //17.Reverse all even numbers
    public int [] reverseAllEven(int arr[]){
        int evenCount=0;

        for(int element : arr){
            if(element%2==0){
               evenCount++;
            }
        }

        int [] evenNumbers = new int[evenCount];
        int index=0;

        for(int element : arr){
            if(element%2==0){
                evenNumbers[index++] = element;
            }
        }

        for(int i=0;i<evenCount/2;i++){
            int temp = evenNumbers[i];
           evenNumbers[i] = evenNumbers[evenCount-i-1];
           evenNumbers[evenCount-i-1] = temp;
        }
        index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                arr[i] = evenNumbers[index++];
            }
        }
        return arr;
    }

    //18.Find first repeating element
    public int findFirstRepeating(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //19.Calculate cumulative sum of elements
    public int [] cumulativeSumOfElements(int arr[]){
        int [] newArr = new int [arr.length];
        int temp=0;//3

        for(int i =0;i<arr.length;i++){
           temp+=arr[i];
           newArr[i]=temp;
        }
        return newArr;
    }

    //20.Replace with sum of previous elements
    public int [] replaceWithSumOfPreviousElement(int arr[]){
        int newArr [] = new int[arr.length];
        newArr[0] = 0;
        int temp = 0;
        for (int i = 1; i <arr.length ; i++) {
            temp+=arr[i];
            newArr[i] =temp;
        }

        return newArr;
    }

    //21.Check if all elements are unique
    public boolean isAllElementsUnique(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }

        return true;
    }

    //22.Count prime numbers in array
    public int countPrimeNumInArray(int [] arr){
       int count=0;

      for(int element :arr){
          if(element>1){
              boolean isPrime =true;
              for (int i = 2; i <=Math.sqrt(element) ; i++) {
                  if(element%i==0){
                      isPrime =false;
                      break;
                  }
              }
              if(isPrime){
                  count++;
              }
          }
      }
       return count;
    }

    //23.Find index of first negative number
    public int findFirstIndexNegativeNum(int arr[]){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                index=i+1;//array index start 0 but I change to 1
                break;
            }
        }
        return index;
    }

    //24.Replace elements greater than value
    public int [] replaceNumGreaterThan(int target,int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>target){
                arr[i]=10;
            }
        }
        return arr;
    }

    //25.Check for duplicate elements
    public boolean isDuplicatedNum(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;

    }
}
