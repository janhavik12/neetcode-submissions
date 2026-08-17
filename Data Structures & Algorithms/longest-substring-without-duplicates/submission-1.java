

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int Left=0;
        HashSet<Character> set= new HashSet<>();
        int maxLen=0;

for(int right = 0; right < s.length(); right++){
    while(set.contains(s.charAt(right))){
        set.remove(s.charAt(Left));
        Left++;
    }

    set.add(s.charAt(right));
    maxLen=Math.max(maxLen, right-Left+1);


}

return maxLen;
        
    }
}
 