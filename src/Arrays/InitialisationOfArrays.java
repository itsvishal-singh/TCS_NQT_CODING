package Arrays;

public class InitialisationOfArrays {
    public static void main(String[] args){
//        System.out.println("Array Declaration and Initialisation");
//        int[] arr = {34,35,54,65,87,90};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//
//        System.out.println("Update");
//        arr[3] = 56;
//        System.out.println(arr[3]);
//
//        System.out.println("Array  Declaration");
//        int [] arr1 = new int[6];

        // Printing Elements of Array

        int[] arr = {354,335,514,652,870,190};
        System.out.println("Length of the arr is : " + arr.length);
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr2[i]);
//        }

        // for-each loop for above same
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
