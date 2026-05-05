import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        // Switch Statement
        // If several options are available then it is not recommended to
        // use ladder if-else rather we should use switch statement.
        // because it improves performance and readability of the code.

        /*
        
        switch(x) {
            case val1:
                action1
            case val2:
                action2
            case val3:
                action3
            ....
            default:
                actionD
        }
        
        */


        int x = 10;
        switch(x) {
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            case 50:
                System.out.println("Value is 50");
                break;
            default:
                System.out.println("Default case");
                break;
        }


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // char nameFirstLetter = name.toLowerCase().charAt(0);
        // switch (nameFirstLetter) {
        //     case 'a':
        //         System.out.println("Name starts with letter a");
        //         break;
        //     case 'b':
        //         System.out.println("Name starts with letter b");
        //         break;
        //     case 'c':
        //         System.out.println("Name starts with letter c");
        //         break;
        //     case 'd':
        //         System.out.println("Name starts with letter d");
        //         break;
        //     case 'e':
        //         System.out.println("Name starts with letter e");
        //         break;
        //     case 'g':
        //         System.out.println("Name starts with letter g 💩");
        //         break;
        //     default:
        //         System.out.println("Name starts with letter " + nameFirstLetter);
        //         System.out.println("Default Case");
        //         break;
        // }


        // Points to remember:
        /*
            1. Always write break at the end of every case but for default case is optional
                but a good practice to write there as well.
            2. Default case should be the last case in your switch statement.
            3. Duplicate class labels are not allowed.
            4. Value of case should be compile time constant, expressions are also allowed but
                it should be compile time constant expression.
            5. Value of case label should be within the range of switch argument type.
        */

            /*
                Fall through inside switch
                Within the switch statement if any case is matched from that case onwards all
                statements will be executed until the end of switch or break. This is called 
                fall-through inside switch.

                break - it is used to come outside of the switch
            */

                /*
                    Default Case
                    1. Within switch we can take default case only once.
                    2. If no other case is matched then only default case would be excuted.
                    3. Within the switch statement we can take default case anywhere, but it
                       is recommended convention to take default as last case.

                */
    }
}
