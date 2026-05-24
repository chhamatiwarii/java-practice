import java.util.Scanner;

public class Pastries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Pastries Count = ");
        int pastrycount = sc.nextInt();
        System.out.print(" How many customers are there  = ");
        int cust = sc.nextInt();

        for(int j = 1; j<=cust; j++){
            System.out.print("Customer "+ j + " How many pastries do you want = ");
            int custPastry = sc.nextInt();
            if(pastrycount > 0){
                if(custPastry <= pastrycount){
                    pastrycount -= custPastry;
                    System.out.println("Enjoy Your dessert!");
                    System.out.println("Remaining pastries " + pastrycount);
                }else{
                    System.out.println("Enjoy Your Dessert! " + pastrycount);
                    pastrycount = 0;
                }
            }else{
                System.out.println("Sorry! we are all out ");
            }

        }
        sc.close();
        
    }
}
