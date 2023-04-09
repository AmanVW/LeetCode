import java.util.*;

public class Solution {
    public static void main (String[] args) {
        int[] nums = {2,12,11,15,7};
        int target = 9;

        int[] result = twoSum(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
    }
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}
