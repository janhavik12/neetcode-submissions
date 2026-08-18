class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxfreq = 0;
        int maxlen = 0;
        int count[] = new int[26];

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;

            maxfreq = Math.max(maxfreq, count[idx]);

            while (right - left + 1 - maxfreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;

            }

            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }

}
