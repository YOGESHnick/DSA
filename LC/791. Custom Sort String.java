class Solution {
    public String customSortString(String order, String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                for (int i = 0; i < map.get(c); i++) {
                    answer.append(c);
                }
            }
        }
        for (char c : s.toCharArray()) {
            if (!answer.toString().contains(String.valueOf(c))) {
                int count = map.getOrDefault(c, 0);
                for (int i = 0; i < count; i++) {
                    answer.append(c);
                }
            }
        }

        return answer.toString();
    }
}
