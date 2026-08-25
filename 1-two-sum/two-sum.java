import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int rem = target - x;

            if (map.containsKey(rem)) {
                int index = map.get(rem);
                return new int[]{index, i};
            }

            map.put(x, i);
        }

        return new int[]{};
    }
}