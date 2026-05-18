class EqualityOperators {

    public static void main(String[] args) {
        // Equality Operators
        // ==, !=

        // We can apply equality operators for all primitive data types including boolean type
        // System.out.println(10 == 20);   // false
        // System.out.println('a' == 'b');   // false
        // System.out.println('a' == 97);      // true
        // System.out.println(false == false);   // true


        // We can apply equality operators for object types also.
        // For object references r1 and r2 returns true only if r1 and r2 both
        // pointing to the same object i.e. == operator is meant for reference
        // comparison or address comparison

        // Thread t1 = new Thread();
        // Thread t2 = new Thread();
        // Thread t3 = t1;
        // System.out.println(t1 == t2);           // false
        // System.out.println(t1 == t3);           // true


        // For any object reference s == null is always false, but null == null is always true.
        // String s = "kajal";
        // System.out.println(s == null);  // false
        // String r = null;
        // System.out.println(r == null);   // true;
        // System.out.println(null == null);   // true



        // what is the difference between == operator and equals method?
        // In general we can use .equals() for content comparison where as == operator
        // for reference comparison
        
        String s1 = "kajal";
        String s2 = "kajal";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("kajal");
        String s4 = new String("kajal");
        System.out.println(s3 == s4);       // false
        System.out.println(s3.equals(s4));     // true
    }
}