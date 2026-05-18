class ArraySum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int m =0;
        for(int i =0; i<arr.length; i++){
            
            m = m + arr[i];
            //System.out.println(arr[i]);
        }
        System.out.println(m);
        

        for (int k : arr) {
            m += k; 
        }
        System.out.println(m);
    }
}
