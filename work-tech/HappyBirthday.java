import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name = ");
        String name = sc.nextLine();
        System.out.print("Enter your year of birth = ");
        int y = sc.nextInt();
        int curryear = 2026;

        if(y>=1980 && y<2026){
            int age = curryear - y;
            System.out.println("Happy Birthday " +  name + "!" +  " Your current age is " +  age);
        }else{
            System.out.println("Try between 1980-2026! ");
        }

        
        //System.out.println("Happy Birthday " +  name + "!" +  " Your current age is " +  age);

        sc.close();
    }
}
