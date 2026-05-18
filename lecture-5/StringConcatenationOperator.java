class StringConcatenationOperator {

    public static void main(String[] args) {
        // The only overloaded operator in java is '+' operator
        // sometimes it access arithematic addition operator and
        // sometimes string concatenation operator.

        // If any one argument is String type then '+' operator
        // acts as string concatenation operator and if all arguments
        // are of numeric type then it acts as arithematic operator.
        // make sure of assciativity is from left -> right

        String a = "kajal";
        int b = 10, c = 20, d = 30;
        System.out.println(a + b + c + d);   // kajal102030
        System.out.println(b + c + d);   // 60 
        System.out.println(a + (b + c + d));   // kajal60
        System.out.println(b + c + a + d);   // 30kajal30

        // a = b+c+d;  // incomaptible types

        a = a + b + c;
        c = b + d;
        // c = a + b + d;  // incompatible types
    }
}