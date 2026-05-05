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
    }
}