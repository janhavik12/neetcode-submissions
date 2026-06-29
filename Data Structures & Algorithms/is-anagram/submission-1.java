class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        
char[] string1 = s.toCharArray();
char[] string2 = t.toCharArray();

        for(char c:string1){
            map1.put(c,map1.getOrDefault(c,0)+1);

        }

        for(char c:string2){
            map2.put(c,map2.getOrDefault(c,0)+1);

        }

        if(map1.equals(map2)){
            return true;
        }

      
            return false;
        


    }
}


