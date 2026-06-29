class Solution {
    public int[] productExceptSelf(int[] nums) {

        int result[]=new int[nums.length];
        int running=1;
//[1,2,3,4]=[0,1,2,3]
        for(int i=0;i<nums.length;i++){
         result[i]=running;
         running=running*nums[i];
         //[1,1,2,6]

        }
running=1;//[24,12,8,6]
        for(int i=nums.length-1;i>=0;i--){
         result[i]= result[i]*running;
         running=running*nums[i];


        }
        return result;
        
    }
}  
