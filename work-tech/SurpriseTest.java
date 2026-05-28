public class SurpriseTest {
    public static void main(String[] args) {
       int digit = 100;
       
       for(int i = 2; i<=100; i++){
        boolean primeNumber = true;
        for(int j = 2; j*j<=i; j++){
            if(i%j == 0){
                primeNumber = false;
            }
        }
        if(primeNumber){
            System.out.println(i);
        }
       }
    }
}
