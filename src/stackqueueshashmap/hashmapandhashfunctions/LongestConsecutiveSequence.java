package stackqueueshashmap.hashmapandhashfunctions;

import java.util.*;

class LongestConsecutiveSequence {

    static int longestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int length = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestSequence(arr));
    }
}
