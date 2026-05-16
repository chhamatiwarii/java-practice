public class Diamoond {
    public static void main(String[] args) {
        int n=5;
        for(int i =1; i<=n; i++){
            for(int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l= n-1; l>0; l--){
            for(int m=n-l; m>=1; m--){
                System.out.print(" ");
            }
            for(int o =2*l-1; o>=1; o--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
