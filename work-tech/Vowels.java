import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count = ");
        int count = sc.nextInt();
        sc.nextLine();
        
        
        char[] vow = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < count; i++) {
            System.out.print("Enter your name = ");
            String name = sc.nextLine();
            int vowCount = 0;
            for (int j = 0; j < name.length(); j++) {
                for (int k = 0; k < vow.length; k++) {
                    if (name.charAt(j) == vow[k]) {
                        vowCount++;
                    }

                }
            }
            if (vowCount > 0) {
                System.out.println("There are total " + vowCount + " vowels in your name, so you will get only " + vowCount + " candies");
        
            }
            
        }
        sc.close();
    }
}
