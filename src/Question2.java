import java.util.HashMap;
import java.util.Map;

public class Question2 {
    
    public static int[] twoSum(int[] nums, int target) {
      
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  
            if (numToIndex.containsKey(complement)) {
                
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(nums, target);

        System.out.println("Input: nums = " + java.util.Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
