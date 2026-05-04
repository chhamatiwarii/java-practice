// class Vehicle {
//     int wheels;
//     int price;

//     public boolean equals(Vehicle v2) {
//         return this.wheels == v2.wheels 
//             && this.price == v2.price;
//     }
// }


class Test {
    public static void main(String[] args) {
        // String s = new String("kajal");
        // String s = "kajal";
        // System.out.println(s instanceof String);
        
        // Thread t = new Thread();
        // System.out.println(t instanceof Thread);

        // String s = "kajal is pagal";
        // System.out.println(s instanceof String);
        // System.out.println(s instanceof Object);


        // Vehicle v1 = new Vehicle();
        // v1.wheels = 4;
        // v1.price = 10000;

        // Vehicle v2 = new Vehicle();
        // v2.wheels = 4;
        // v2.price = 10000;

        // System.out.println(v1 == v2);   // false
        // System.out.println(v1.equals(v2));



        // Thread t = new Thread();
        // System.out.println(t instanceof Thread);
        // System.out.println(t instanceof Object);
        // System.out.println(t instanceof Runnable);


        // String s = new String("Bhaskar");
        // System.out.println(s instanceof String);
        // System.out.println(s instanceof Thread);  // error: incompatible types: String cannot be converted to Thread

        // Object o = new Object();
        // System.out.println(o instanceof String);   // false

        // Object o = new String("kukur");
        // System.out.println(o instanceof String);

        System.out.println(null instanceof String);             // false
    }
}