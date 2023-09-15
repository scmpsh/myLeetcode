package problems;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[]{1, 5, 123, 33, 43, 12, 41, 12, 4124, 12}));
    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            var numMap = new HashSet<Integer>();
            for (var num : nums) {
                if (numMap.contains(num)) {
                    return true;
                } else {
                    numMap.add(num);
                }
            }
            return false;
        }
    }
}
