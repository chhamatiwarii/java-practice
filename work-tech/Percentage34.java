import java.util.Scanner;

public class Percentage34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count = ");
        int count = sc.nextInt();
        int totalMarks = count*80;
        int yourMarks = 0;

        for(int i = 0; i<count; i++){
            System.out.println("Enter your marks = ");
            int marks = sc.nextInt();
            yourMarks += marks;
        }
        float result = (yourMarks/(float)totalMarks)*100;
        System.out.println(result + " %");
    
    }
}
