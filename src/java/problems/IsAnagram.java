package problems;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        IsAnagram.Solution solution = new IsAnagram.Solution();
        System.out.println(solution.isAnagram("ab", "a"));
    }

    static class Solution {
        public boolean isAnagram(String s, String t) {
            var sList = s.toCharArray();
            var tList = t.toCharArray();

            Arrays.sort(sList);
            Arrays.sort(tList);

            return Arrays.equals(sList, tList);
        }
    }
}
