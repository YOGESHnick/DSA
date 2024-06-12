class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> taskCount = new HashMap<Integer, Integer>();
        for(int i=0; i<tasks.length; i++){
            if(taskCount.containsKey(tasks[i])){
                taskCount.put(tasks[i], taskCount.get(tasks[i])+1);
            }else{
                taskCount.put(tasks[i], 1);
            }
        }
        int rounds = 0;
        for (int count : taskCount.values()) {
            if (count == 1) {
                return -1;
            }
            // If count is 2 or 3, it can form exactly one round
            if (count % 3 == 0) {
                rounds += count / 3;
            } else {
                rounds += count / 3 + 1;
            }
        }
        
        return rounds;
    }
}
