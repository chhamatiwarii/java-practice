import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number = ");
        int count = sc.nextInt();
        

        for(int i = 0; i <= count; i++){
            System.out.print("Enter the temperature = ");
            int t = sc.nextInt();
            System.out.print("Enter the humidity = ");
            int h = sc.nextInt();
            if(t >= 30 && h >= 90){
                System.out.println("Hot and Humid ");
            }else if(t >= 30 && h < 90){
                System.out.println("Hot ");
            }else if(t < 30 && h >= 90){
                System.out.println("Cool and Humid ");
            }else if(t < 30 && h < 90){
                System.out.println("Cool ");
            }
        }

        sc.close();
    }
}
