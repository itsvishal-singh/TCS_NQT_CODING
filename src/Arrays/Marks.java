package Arrays;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers of the Students : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // input
        System.out.println("Enter " + n + " Students Marks : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // output
        System.out.println("Your Entered marks are : ");
        for(int Elements : arr){
            System.out.println(Elements + " ");
        }
        // Applying Condition
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35){
                System.out.println("Who have failed : " + i );
            }
        }

        // Sum of all Marks
        int sum=0;
        for(int S : arr){
            sum+=S;
        }
        System.out.println("Sum of all marks : " + sum);
    }
}
