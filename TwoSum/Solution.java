public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for(int i=0; i<numbers.length; i++) {
            if(nums.containsKey(target-numbers[i])) {
                res[0] = nums.get(target-numbers[i])+1;
                res[1] = i+1;
                break;
            } else {
                nums.put(numbers[i], i);
            }
        }
        return res;
    }
}
