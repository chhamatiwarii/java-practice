class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 40, 30, 60, 80, 90, 70, 100};

        //Average of Array
        double avg = 0.0;
        int m =0;
        for(int i : arr){
            avg = (m += i)/arr.length;

        }
        System.out.println("Average of array " + avg);

        //heighest number of array;
        int m1 =Integer.MIN_VALUE;
        for(int i :arr){
            if(i>m1){
                m1 = i;
            }
        }
        System.out.println( "Heighest Number of array element " + m1);



        //Sum of all arrya elements 
        int m2 =0;
        for(int i =0; i<arr.length; i++){
            
            m2 = m2 + arr[i];
            //System.out.println(arr[i]);
        }
        System.out.println("Sum of all Elements " + m2);
        
        int m3 = 0;  
        for (int k : arr) {
            m3 += k; 
        }
        System.out.println("Sum of all elements by using for each " + m3);
    }
}
