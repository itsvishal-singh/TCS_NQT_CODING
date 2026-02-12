package Arrays;

public class PassingArrayToMethods {
    static void change(int[] vishal){
        vishal[1]=56;
    }
    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
    static void aSwap(int[] ar){
        int temp = ar[0];
        ar[0]=ar[1];
        ar[1]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {23,34,434,643,546};
        change(arr);
        System.out.println(arr[1]);

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);

        int[] ar ={23,34,54,565};
        aSwap(ar);
        System.out.println(ar[0]+" "+ar[1]);
    }
}
