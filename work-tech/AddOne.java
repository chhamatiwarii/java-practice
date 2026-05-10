import java.util.Scanner;

class Addone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age = ");
        int a = sc.nextInt();
        int b = a + 1;

        System.out.println("Hello " +  name + "!" +  " Next year, you will be " +  b + " years old");
        sc.close();
    }
}
