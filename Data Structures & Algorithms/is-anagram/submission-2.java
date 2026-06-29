class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        char[] c1=s.toCharArray();
      
        char[] c2=t.toCharArray();

        if(s.length()!=t.length()){
            return false;
        }
        for(char c:c1){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:c2){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }

        return false;
        


        }


    }
