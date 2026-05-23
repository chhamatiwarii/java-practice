import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]nums = {0,1,2,3,4};
        boolean isDuplicate = false;
        for(int i =0; i<nums.length-1; i++){
            
            if(nums[i+1] == nums[i]){
               isDuplicate =  true;
               break; 
               
            }
           
        }
        System.out.println(Arrays.toString(nums));
        if(isDuplicate){
            System.out.println("No Duplicate Found");
        }
        
        
    }
}
