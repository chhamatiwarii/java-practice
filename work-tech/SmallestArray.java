public class SmallestArray {
    public static void main(String[] args) {
        int[] arr ={10,54,20,55,8};
        int  num =Integer.MAX_VALUE;
        for(int i : arr){
            if(i<num){
                num =i;
            }
        }
        System.out.println(num);
    }
}
