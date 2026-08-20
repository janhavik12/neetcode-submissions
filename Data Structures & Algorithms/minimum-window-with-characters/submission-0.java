

class Solution {
    public String minWindow(String s, String t) {

        if (t.isEmpty() || s.isEmpty() || s.length() < t.length()) {
            return "";
        }

        int left = 0;
        int count = 0;
        int have = 0;
//created 2 maps
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();


        
        for (int right = 0; right < t.length(); right++) {
            char c = t.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            // [x:1,y:1,z:1]

        }
        count = map.size();
        int beslen=Integer.MAX_VALUE;
        int beststart=0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            map1.put(c, map1.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && map1.get(c).equals(map.get(c))) {
                have++;
            }

            while (have == count) {

                if(right-left+1<beslen){
                    beslen=right-left+1;
                 beststart=left;
                }


                char leaving=s.charAt(left);
                map1.put(leaving,map1.get(leaving)-1);


                if(map.containsKey(leaving) && map1.get(leaving)<map.get(leaving)){
                    have--;
                }

                left++;




            }
        }
return beslen == Integer.MAX_VALUE ? "" : s.substring(beststart, beststart + beslen);
       

    }
}
