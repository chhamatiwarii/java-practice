    import java.util.Scanner;

    public class AverageWeight {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // double n1 = sc.nextDouble();
            // double n2 = sc.nextDouble();
            // double n3 = sc.nextDouble();
            // double n4 = sc.nextDouble();
            // double n5 = sc.nextDouble();
            // double n6 = sc.nextDouble();
            // double n7 = sc.nextDouble();
            // double n8 = sc.nextDouble();
            // double n9 = sc.nextDouble();
            // double n10 = sc.nextDouble();

            // double avg = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;

            int n = sc.nextInt();
            double sum = 0;
            for(int i=0; i<n; i++) 
                sum += sc.nextDouble();

            double avg = sum / n;
            System.out.println(avg);
            sc.close();
        }
    }
