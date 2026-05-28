import java.util.Arrays;

public class SurpriseTest {
    public static void main(String[] args) {
    //    outer: for(int i=2; i<=100; i++) {
    //     boolean isPrime = true;
    //     inner: for (int j = 2; j*j <= i; j++) {
    //         if(i % j == 0) {
    //             isPrime = false;
    //             break inner;
    //         }
    //     }
    //     if(isPrime) System.out.println(i);
    //    }


        // Sieve of eratosthenes
        // when you need to perform some operations on the prime numbers in given range
        boolean[] sieve = new boolean[10001];
        Arrays.fill(sieve, true);

        for(int i=2; i<=10000; i++) {
            if(sieve[i] == true) {
                for(int j= i * 2; j<=10000; j+=i) {
                    sieve[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2; i<=10000; i++) {
            if(sieve[i]) count++;
        }
        System.out.println(count);
    }
}
