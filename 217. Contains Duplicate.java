import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i],table.get(nums[i])+1);
                if(table.get(nums[i])>1){
                    return true;
                }
            } else{
                table.put(nums[i],1);
            }
        }
        return false;
    }
}