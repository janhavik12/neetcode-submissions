class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int comp=target-nums[i];//7-3=4

            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};//[3,4]
            }
                map.put(nums[i],i);//[3,0]
        }
        return new int[]{};
    }

}
