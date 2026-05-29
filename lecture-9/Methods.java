class Methods {

    static boolean isPrime(int n) {
        boolean res = true;
        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 30; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
