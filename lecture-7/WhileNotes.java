class Test {
    public static void main(String[] args) {
        // Iterative Statements
        // When we want to perform an action again and again repetetively
        // then we can achieve this using iterative statements

        // while
        // do-while
        // for
        // forEach


        // While loop
        // if we don't know the number of 
        // iterations in advance then the
        // best loop is while loop


        /*
        
            while(argument) {
                // repetetive task -- loop body
            }

            The argument in the while statement should be of boolean type. If we are using
            any other type then we will get compile time error.

        */

            // while (true) {
            //     System.out.println("Kajal");
            // }

            /*
                Curly braces (delimiters) are optional and without curly braces 
                we can take only one statement which should not be a declarative statement.
            */

        // while (true) 
        //     System.out.println("Kajal");

        // while(true)
        //     int x = 10;   // error: because this is a declarative statement

        // while (true) {

        // }   // program goes to infinite loop

        // while(true);     // program goes to infinite loop

        // while (true) {
        //     int x = 10;
        // }        // no output - infinite loop

        // int i = 1;
        // while (i <= 5) {
        //     System.out.println(++i);
        //     // i++;
        // }
        // System.out.println("Value of i after loop: " + i);

        // while (true) {
        //     System.out.println("Hello");
        // }
        // System.out.println("Hi");  // unreachable statement

        // int i = 1;
        // while (true) {
        //     if(i>5) break;
        //     // if(i != 3) {
        //     //     System.out.println(i);
        //     // }
        //     if(i == 3){ 
        //         i++;
        //         continue;
        //     }
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("This is a statement after loop");
        // System.out.println("This is an another statement after loop");

        // Write a program using while loop to print all the even numbers till 20.
        // int number = 2;
        // while (number <= 20) {
        //     System.out.println(number);
        //     number += 2;
        // }

        // int idx = 1;
        // while (idx <= 10) {
        //     System.out.println(idx * 2);
        //     idx++;
        // }
    }
}