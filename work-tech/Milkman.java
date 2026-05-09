import java.util.Scanner;

public class Milkman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius ");
        int r = sc.nextInt();
        System.out.print("Enter height ");
        int h = sc.nextInt();

        double v = 3.14*r*r*h;
        double litres = v/1000;
        double cost = litres*40;
        System.out.println(litres);
        System.out.println(cost);

        sc.close();

        //phle mai pai dhundh rhi thi kaise likha jaata h then question pda ki okk 3.14 bi use kr skte h
        // let me know if there is any way of using pai
    }
}
