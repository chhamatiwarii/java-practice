import java.util.Scanner;

public class Hollow {
    public static void main(String[] args) {
        System.out.print("Enter Your Number = ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int j=1; j<=n; j++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("*");
                for(int k=1; k<=n-2; k++){
                    System.out.print("  ");
                }
                System.out.print(" *"); 
            }
            System.out.println();
        }
        sc.close();  
    }
}

//yes
