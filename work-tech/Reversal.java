import java.util.Arrays;

public class Reversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        //Optimal Solution
        int i = 0;
        int n = arr.length;
        int j = n-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));





        // int[] extraArr = new int[arr.length];
        // int ptr =0;

        // for(int i = arr.length-1; i>=0; i--){
        //     extraArr[ptr] = arr[i];
        //     ptr++;
        // }
        // System.out.println(Arrays.toString(extraArr));
    }
}
