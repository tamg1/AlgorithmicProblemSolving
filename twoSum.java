//! what if the question is that duplicates exist

/* 
// MY SOLUTION
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indexes[] = new int[2];  
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
    }}}
        return null; 
    }} */   
   

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] { map.get(target-nums[i]), i };
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
} 



// problem is this can't use same element again
//0, 0 ; 1, 1
// taking a small example  

// NEETCODE SOLUTION - sucks