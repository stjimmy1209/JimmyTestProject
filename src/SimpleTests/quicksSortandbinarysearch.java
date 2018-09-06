package SimpleTests;

import jdk.nashorn.api.tree.BinaryTree;

public class quicksSortandbinarysearch {

    public static void main(String[] args) {

        int arr1[] = {4,7,6,2,9,8,11,43,13,2,98,1};
        quickSort(arr1,0,arr1.length-1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        int key1 = 9;
        int position = recursionBinarySearch(arr1,key1,0,arr1.length-1);
        if(position == -1){
            System.out.println("The wanted key is not found!");
        }else{
            System.out.println("The wanted key " + key1 + " is found."+  "\nPosition is: " + position);
        }

    }

    public static void quickSort(int arr[], int low, int high){

        int start = low;
        int end = high;
        int key = arr[low];

        while(start < end)
        {
            while(start < end && key <= arr[end])
            {
                end--;
            }
            if(arr[end]<=key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }

            while(start < end && arr[start] <= key){
                start++;
            }

            if(key<=arr[start]){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            if(start>low) quickSort(arr,low,start-1);
            if(end<high) quickSort(arr,end+1,high);
        }

    }

    public static int recursionBinarySearch(int arr[], int key, int lo, int hi){

        if(key<arr[lo] || key>arr[hi] || hi < lo){
            return -1;
        }
        int mid = (lo+hi)/2;

        if(key < arr[mid]){
            return recursionBinarySearch(arr,key,lo,mid -1);
        }else if(arr[mid] < key){
            return recursionBinarySearch(arr,key,mid + 1,hi);
        }else{
            return mid;
        }
        

    }


}
