// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(char i:s.toCharArray()){
            count[i-'a']++;
        }
        for(char i:t.toCharArray()){
            count[i-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }

        return true;
    }
}