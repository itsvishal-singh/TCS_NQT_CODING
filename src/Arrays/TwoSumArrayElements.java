package Arrays;
import java.util.Arrays;

// Find the doublet in the array whose sum is equal to the given values x.
public class TwoSumArrayElements {
 /*   public static void main(String[] args) {
        int[] arr = {23,34,54,52,90,40,87};
        int x = 74;

        for(int  a:arr){
            for(int b:arr){
               if((a+b)==x){
                   System.out.println(a+" + "+b+" = "+x);
               }
            }
        }
        // on the above code there is a problem in output
        // which is printing twice answer.
        int [] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x){
                    ans[0]=i; ans[1]=j;
                    break;
                }
            }
        }
        System.out.println(ans[0]+ " " + ans[1]);
    }
    */

    // for finding indexes of that elements
    public int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }

            }

        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSumArrayElements sum = new TwoSumArrayElements();
        int[] arr = {20,40,50,32,49,50,80};
        int target = 100;
        int[] result = sum.twoSum(arr, target);
        System.out.println("Indexes : " + Arrays.toString(result));

    }
}
