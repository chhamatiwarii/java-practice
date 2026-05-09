class Student {

}

class Test {
    public static void main(String[] args) {
        // Assignment Operator
        // 1. Simple Assignment
        // int x = 10;
        // double d = 23.56;


        // 2. Chained Assignment
        // int a, b, c, d;
        // a = b = c = d = 10;
        // System.out.println(a + " -- " + b + " -- " + c + " -- " + d);
        
        // int a, b, c, d;
        // int a = b = c = d = 10;
        // System.out.println(a + " -- " + b + " -- " + c + " -- " + d);

        // Compound Assignment
        // int a = 10;
        // // a = a + 5;
        // a *= 5;         // a = a + 5;
        // System.out.println(a);

        // byte b = 10;
        // // b = (byte)(b+5);
        // b += 5;
        // System.out.println(b);

        // int a, b, c, d;
        // a = b = c = d = 20;
        // a += b -= c *= d /= 2;
        // System.out.println(a + " -- " + b + " -- " + c + " -- " + d);

        int i = 1;
        i += ++i + i++ + ++i + i++;
        // i = i + ++i + i++ + ++i + i++;
        // i = 1 + 2 + 2 + 4 + 4;
        // System.out.println(i);

        // Employee e = new Employee();
        //Object o = Class.forName("Employee").newInstance();
    }
}