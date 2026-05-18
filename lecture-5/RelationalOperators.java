class Vehicle {
    int wheels;
}

class RelationalOperators {
    public static void main(String[] args) {
        // Relational Operators
        // Basically used for comparison
        // >, <, >=, <=

        // we can apply relational operators for any primitive type except boolean
        System.out.println( 10 > 10.5);     // false
        System.out.println( 'a' > 95.5);     // true
        System.out.println( 'a' > 'z');     // false
        //System.out.println(true > false);   // error: bad operand types for binary operator '>'



        // we cannot apply relational operator for object types
        // System.out.println("kajal" > "kajal");  // error: bad operand types for binary operator '>'

        // Vehicle v1 = new Vehicle();
        // v1.wheels = 4;
        // System.out.println(v1 > v1);  // error: bad operand types for binary operator '>'


        // Nesting of relational operators is also not allowed
        // System.out.println(10<20<30);

    }
}