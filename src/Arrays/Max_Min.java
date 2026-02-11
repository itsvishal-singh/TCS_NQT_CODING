package Arrays;
public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {5, 129, 12, 2, 3, 56, 95, 32, 51, 1};
//        int max = arr[0];
         int max=Integer.MIN_VALUE;
        for(int z : arr){
            if(z>max){
                max=z;
            }
        }
        System.out.println("Largest Element is : " + max);

//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        for(int z : arr){
            if(z<min){
                min=z;
            }
        }
        System.out.println("Smallest Element is : " + min);


//        int smax = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int z : arr){
            if(z>smax && z!=max){
                smax=z;}
        }
        System.out.println("Second Largest Element is : " + smax);
    }
}
