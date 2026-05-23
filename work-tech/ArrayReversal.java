import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int k = 0; k<3; k++){
            int last = arr[arr.length-1];
            for(int i = arr.length-1; i>0; i--){
               arr[i] =arr[i-1]; 
               
            }
            arr[0] = last;
            //System.out.println(Arrays.toString(arr));
        }
        
        System.out.println(Arrays.toString(arr));



    // 1 Rotation

    //     int l = arr[arr.length-1];

    //    for(int i = arr.length-1; i>0; i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = l;

    //     System.out.println(Arrays.toString(arr));
        
        // solved by using extra array
        // int[] secondArr = new int[arr.length];
        // for(int i = arr.length-1; i>=0; i--){
        //     int temp = arr[i];
        //     arr[i] = secondArr[j];
        //     secondArr[j] = temp;

        //     j++;
        // }
        // System.out.println(Arrays.toString(secondArr));
        // System.out.println(arr.length-1);

    }
    
}
