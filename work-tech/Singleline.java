import java.util.Scanner;

public class Singleline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Word = ");
        String name = sc.nextLine();


        for(int i = 0; i<name.length()-1; i++){
            System.out.println(name.charAt(i) + "" + name.charAt(i+1));
            System.out.println(35 + "" + 54);
            i++;
        }

        // for(int i = 0; i<name.length(); i++){
        //     System.out.println( name.charAt(i));
        // }
    }
}
