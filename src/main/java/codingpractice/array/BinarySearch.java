package codingpractice.array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,4,6,7,9,14,16};
        System.out.println(isElementPresentModified(arr, 12));

    }

    public static int isElementPresent(int []arr, int k){
        int isPresent = -1;
        int mid = arr.length/2;
        if(arr[mid]==k)
            isPresent = mid;
        else if(arr[mid]>k){
            for(int i=0; i<mid ;i++)
                if(arr[i]==k)
                    isPresent = i;
        }
        else{
            for(int i=mid+1; i<arr.length ;i++)
                if(arr[i]==k)
                    isPresent = i;
        }
        return isPresent;
    }

    public static int isElementPresentModified(int []arr, int k){
        return Arrays.binarySearch(arr, k);
    }
}
