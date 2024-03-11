import java.util.HashMap;

class Solution {
    public String customSortString(String order, String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                answer.append(String.valueOf(c).repeat(map.get(c)));
            }
        }
        for (char c : s.toCharArray()) {
            if (!answer.toString().contains(String.valueOf(c))) {
                int count = map.getOrDefault(c, 0);
                answer.append(String.valueOf(c).repeat(count));
            }
        }
        return answer.toString();
    }
}
