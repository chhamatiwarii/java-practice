//import static java.lang.Float.*;

class ArithematicOperators {
    public static void main(String[] args) {
        // if we are applying any arithematic operators b/w two operands 'a' and 'b'
        // the result is max(int, type of a, type of b)

        // byte + byte = int
        // byte + short = int
        // short + short = int
        // short + long = long
        // double + float = double
        // int + double = double
        // char + char = int
        // char + int = int
        // char + double = double


        System.out.println('a' + 'b');
        System.out.println('a' + 1l);
        System.out.println('a' + 1.2f);

        // In integral arithematic (byte, short, int, long) there is no way to 
        // represent infinity, if infinity is the result we'll get the 
        // ArithematicException: / by zero.
        //System.out.println(10/0);   // ArithmeticException: / by zero

        // But for floating point arithematic (float, double) there is a
        // way to represent infinity
        System.out.println(10/0.0);   // O/P: Infinity

        // For Float and Double classes contains the following constants:
        // 1. POSITIVE_INFINITY
        // 2. NEGATIVE_INFINITY
        // Hence, if infinity is the result we won't get any Arithematic 
        // Exception in floating point Arithematic.

        System.out.println(10/0.0);
        System.out.println(-10/0.0);


        // There is no way to represent undefined results in integral arithematic (byte, short, int, long)
        // Hence, we will get Arithematic Exception if our result is undefined.

        // System.out.println(0/0);  // ArithmeticException: / by zero

        // But in floating point arithematic (float, double) there is a way to represent undefined
        // results.
        // For Float and Double classes we have a constant called NaN (Not a Number), Hence when
        // the result is undefined we won't get arithematic exception in floating point arithematics.
        System.out.println(0/0.0);
        System.out.println(-0/0.0);


        // ArithematicException
        // 1. ArithematicException is RuntimeException but not a compile time error.
        // 2. It occurs only in integral arithematic but not floating point arithematic.
        // 3. The only operations which causes Arithematic Exception are '/' and '%'.





        int x = 10;
        System.out.println(x > 11);  // false
        //System.out.println(x < NaN);  // false
        // System.out.println(x > NEGATIVE_INFINITY);   // true
        // System.out.println(x > NaN);    // false
        // System.out.println(NaN == NaN);    // false
        // System.out.println(10 != NaN);   // true
        // System.out.println(NaN != NaN);    // true   
        // System.out.println(POSITIVE_INFINITY > NEGATIVE_INFINITY);  // true
        // System.out.println(POSITIVE_INFINITY == POSITIVE_INFINITY);
    }
}