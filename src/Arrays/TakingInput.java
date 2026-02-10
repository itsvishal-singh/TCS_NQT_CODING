package Arrays;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // input
        System.out.println("Enter " + n + " elements of your array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // output
        System.out.print("Your Entered Elements are : ");
        for(int Elements : arr){
            System.out.print(Elements + " ");
        }
    }
}
