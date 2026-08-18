

class Solution {
    public boolean checkInclusion(String s1, String s2) {


        
        int count[]=new int[26];
        int count1[]=new int[26];


        if(s1.length()>s2.length()){
            return false;
        }


        for (int right=0;right<s1.length();right++){
            int idx=s1.charAt(right)-'a';
            count[idx]++;

        }
        for (int left=0;left<s1.length();left++){
            int idx2=s2.charAt(left)-'a';
            count1[idx2]++;

        }
        if(Arrays.equals(count, count1)){
            return true;
        }


        for(int right=s1.length();right<s2.length();right++){

            count1[s2.charAt(right)-'a']++;
            int leavingPos = right - s1.length();
            char leavingchar=s2.charAt(leavingPos);
            count1[leavingchar - 'a']--;
            

            if(Arrays.equals(count, count1)){
                return true;
            }


     
        }

        return false;

      








        
    }
}
