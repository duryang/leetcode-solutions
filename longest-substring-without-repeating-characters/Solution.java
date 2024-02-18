import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        String input = "abcabcbb";

        System.out.println("lol");

        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {
        
        int max = 0, length = 0;
        Set<Character> c = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!c.contains(current)) {
                c.add(current);
                length++;
                max = Math.max(max, length);
            }
            else {
                c.remove(s.charAt(i - length));
                i--;
                length--;
            }
        }
        
        return max;
    }
}