class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        //[2,3,4,5,6]

        for(int num:set){
            if(!set.contains(num-1)){

                int length=1;
                int current=num;

                while(set.contains(current+1)){
                    length++;
                    current++;
                }

                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}