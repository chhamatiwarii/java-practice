
class Test {
    public static void main(String[] args) {
        
        // Increment, Decrement operators can only be applicable for
        // variables, if you try to use it with constant values you'll get compile time error

        // int x = 4;
        // int y = ++4;
        // System.out.println(y);


        // we cannot perform nesting of increment and decrement operators, if we 
        // try to do so we'll get compile time error.

        // int x = 4;
        // int y = ++(++x);


        // we cannot use increment, decrement operators with the final variables,
        // if we try to do so we will get compile time error.

        // final int x = 4;
        // x++;   // x = x+1      error: cannot assign a value to final variable x
        // System.out.println(x);

        // we can apply increment decrement operators to all the primitive data types
        // except boolean

        // int x = 10;
        // x++;
        // System.out.println(x);   // 11

        // char ch = 'a';
        // ch++;     
        // System.out.println(ch);  // b

        // char c = 97;
        // c++;
        // System.out.println(c);

        // double d = 10.5;
        // d++;
        // System.out.println(d);    // 11.5

        // int i = 'a';
        // i++;
        // System.out.println(i);    // 98

        // boolean b = true;
        // b++;   // error: bad operand type boolean for unary operator '++'
        // System.out.println(b);



        // Difference b/w b++ and b = b + 1;
        // if we are applying any arithematic operators b/w two operands 'a' and 'b'
        // the result is max(int, type of a, type of b)

        // byte a = 10;
        // byte b = 20;
        // byte c = (byte)(a + b);    // max(int, byte, byte)
        // System.out.println(c);

        // byte b = 10;
        // b++;
        // System.out.println(b); // 11

        // byte b = 10;
        // b = b+1;  // error: incompatible types: possible lossy conversion from int to byte
        // System.out.println(b);

        // double a = 10;
        // byte b = 20;

        // double l = a + b;     // max(int, double, byte)
        // System.out.println(l);



        // b++ means b = b+1;    (wrong)
        // b++ means b = (type of b)(b+1)

        int b = 10;
        b = (int)b+1;  // b++
        System.out.println(b);
    }
}
