package Arrays;

import java.util.Arrays;

// Write a program to reverse the array without using any extra array.
public class Reverse {
    public static void print(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr={30,40,20,58,54,76,34};
        int n = arr.length;

        // using extra array
        int[] newArr=new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[n-1-i];
        }
        System.out.println("Original array : " + Arrays.toString(arr));
        System.out.println("Reversed array : " + Arrays.toString(newArr));

        // without using extra array
        print(arr);
        int i=0, j=n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        print(arr);
    }
}
