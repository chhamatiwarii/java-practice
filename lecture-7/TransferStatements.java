class TransferStatements {
    public static void main(String[] args) {
        // Transfer Statements
        // 1. Break
        // 2. Continue

        // Break Statement
        // Break Statement is used in following scenarios:
        // 1. Inside switch to prevent fall through
        // 2. Used inside loops to break / come outside of loop based on certain condition
        // 3. Inside label blocks to break block execution based on some condtion

        // Inside switch
        // int x = 1;
        // switch (x) {
        //     case 0:
        //         System.out.println("hello");
        //         break;
        //     case 1:
        //         System.out.println("bye");
        //         break;
        //     default:
        //         System.out.println("hi");
        //         break;
        // }
        // System.out.println("Program Completed");


        // Inside loops
        // for (int i = 1; i <= 10; i++) {
        //     if(i == 7) break;
        //     System.out.println(i);
        // }
        // System.out.println("Program Complete");



        // Inside labelled blocks
        // int x = 10;
        // l1: {
        //     System.out.println("begin");
        //     System.out.println("The value of x is: " + x);
        //     if(x == 10) {
        //         break l1;
        //     }
        //     System.out.println("end");
        // } 
        // System.out.println("hello");

        // These are the only places where you can use break statement. If using anywhere
        // else you will get compile time error.
        // int x = 10;
        // if(x == 10) {
        //     break;      //  error: break outside switch or loop
        // }
        // System.out.println("If you give wrong answer to this question then you are the most stupid person in this planet");


        // Continue Statement
        // It can be used only inside loops
        // We can use continue statement to skip current iteration and
        // continue with the next iteration
        
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Iteration number: " + i);
        //     if(i == 5 || i == 7) continue;
        //     System.out.println(i);
        //     System.out.println("------------------------------");
        // }
        // System.out.println("Program complete");



        // It can be used only inside loops if we are using anywhere else 
        // then we will surely get compile time error saying 
        // "continue outside of loop"

        // int x = 10;
        // if(x == 10) continue;           // error: continue outside of loop
        // System.out.println("If you give wrong answer to this question then you are the most stupid person in this planet");


        
    }
}
