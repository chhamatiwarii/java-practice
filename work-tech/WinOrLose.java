import java.util.Scanner;

public class WinOrLose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Numbers ");
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int val = sc.nextInt();
            if(val > max) {
                max = val;
            }
        }
        System.out.println(max);
        sc.close();
        
        // bhut socha maine ki isme kya kru mjhe nii aa rha ki single line m kaise lu saare integer user input
        // second i thought Max(Integer.value) use kru phr yaad aaya y data type ki value k liye use hota h 
        // phr socha for loop lgau that is also not possible
        //phr socha ek variable lu usme usme store kru phr lga that would also require for loop
    }
}
