/*
Problem: FizzBuzz

Given an integer n, print with the following rules:
- If a number is divisible by 3, print "Fizz"
- If a number is divisible by 5, print "Buzz"
- If a number is divisible by both 3 and 5, print "FizzBuzz"
- Otherwise, print the number itself

Sample Input:
n = 15

Sample Output:
FizzBuzz



Sample Input:
n = 3

Sample Output:
Fizz



Sample Input:
n = 5

Sample Output:
Buzz



Sample Input:
n = 7

Sample Output:
7





Edge Cases:
- n = 1 -> 1
- n = 3 -> 1 2 Fizz
- n = 5 -> 1 2 Fizz 4 Buzz
*/

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int n = sc.nextInt();

        if(n%3 == 0 && n%5 == 0){
            System.out.println("FizzBuzz");
        }else if(n%3 == 0){
            System.out.println("Fizz");
        }else if(n%5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(n);
        }
        System.out.println("\n PROGRAM END ‼️");

    
        
    }
}