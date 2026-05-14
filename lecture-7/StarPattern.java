public class StarPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l =1; l<n; l++){
            for(int m =1; m<=l; m++){
                System.out.print(" ");
            }
            for(int o=1; o<=n-l; o++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int k = 1; k<=n; k++){
        //     for(int l = 1; l<=n-k; l++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i = 1; i<=n; i++){
        //     for(int k = 1; k<=n-i+1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i =1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}


