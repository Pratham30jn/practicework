package Arrays;

import java.util.Arrays;

public class Test {
	 public static int thirdMax(int[] nums) {
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++) {
        	 System.out.print(nums[i]+" ");
         }
         System.out.println("\n");
         int secm=0;
         
         for(int i=nums.length-2;i>=0;i--){
             if(nums[i]<nums[nums.length-1]){
                 secm=nums[i];
                 break;
             }
            

         } System.out.println(secm); 
         for(int i=nums.length-3;i>=0;i--){
             if(nums[i]<secm){
                 return nums[i];
                 
             }
         }
        

    return nums[nums.length-1];
             
        
    }
    public static void main(String[] args){
        int arr []={2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}
