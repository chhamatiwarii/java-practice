import java.util.Scanner;

public class HighFever29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your count = ");
        int count = sc.nextInt();
        
        for(int i = 1; i<=count; i++){
            System.out.print("Enter your name = ");
            String name = sc.nextLine();

            System.out.print("Enter your temperature = ");
            float temp = sc.nextFloat();

            if(temp>98.5){
                System.out.println(name + " " + temp);
            }
            
        }
        sc.close();

    }
    
}
