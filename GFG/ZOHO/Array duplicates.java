class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
       if (list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}