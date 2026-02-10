package Arrays;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,9,12,56,95,32,51};
        int x = 9;
        boolean flag = false; // nahi mila
        for(int no : arr){
            if(no == x){
                flag = true;
                break;
            }
        }
        if(flag==false) // (!flag)
            System.out.println("Nahi Mila");
        else System.out.println("Mil Gyaa");

    }
}
