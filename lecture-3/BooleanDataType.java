public class BooleanDataType {
 
    public static void main(String[] args) {
        // Size: Not Applicable (JVM Dependent)
        // Range: Not Applicable (only 2 possible values true and false)

        //boolean b = true;

       //boolean b1 = True;  // C.E: cannot find symbol

       //boolean b2 = "True"; // C.E: incompatible types

       //boolean b3 = 0; // C.E: incompatible types

    //this would throw compile type error as in java, if condition accepts only a boolen value, (true or false) 
    //here x is an integer that's why
    //it will throw compile time error unlike c/C++ java does not treat 0 as false and 1 as true
       // Interview Question - 1 
    //    int x = 0;
    //    if(x) {
    //        System.out.println("Hello");
    //     } else {
    //         System.out.println("Pello");
    //     }

    // while loop also requires a boolean condition here again 1 is integer value so it causes a compile time error
    //     // Interview Question - 2
    //     while(1) {
    //         System.out.println("Hello");
    //     }

    // java is strongly typed, so conditions inside if and while must always evaluate to boolean value

    }
}
