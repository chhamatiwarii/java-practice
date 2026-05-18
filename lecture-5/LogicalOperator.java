class LogicalOperator {
    public static void main(String[] args) {
        // Short Circuit Operators (&&, ||)

        // && - Logical AND
        // || - Logical OR

        // These are used to group two or more conditions

        // AND - If both conditions are true then overall expression return true
        // OR - If anyone of both conditions is true then overall expression will be true





        // Voting Eligibility
        // A person is allowed to vote if he/she satisfies one of these two condtions:
        // 1. He/She should be more than or equal to 18 years of age.
        // 2. His/Her height should be more than or equal to 4.12 feet.

        int age = 24;
        double height = 5.5;
        System.out.println(age >= 18  ||  height >= 4.12);


        // x && y: y will be evaluated if and only if x is true. 
        // x || y: y will be evaulated if and only if x is false.


        int x = 10;
        int y = 15;
        if(++x < 10 || ++y > 15) {
            x++;
        } else {
            y++;
        }
        System.out.println(x);
        System.out.println(y);


        int x2 = 10;
        if(++x2 < 10 && ((x2/0)>10)) {
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }

        int x1 = 150;
        short s = (short) x1;
        byte b = (byte) x1;
        System.out.println(s);
        System.out.println(b);
    }
}