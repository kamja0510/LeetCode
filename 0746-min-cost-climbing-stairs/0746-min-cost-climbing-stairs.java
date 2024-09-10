class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int top = cost.length;
        Map<Integer,Integer> memo = new HashMap<>();
        memo.put(2,Math.min(cost[0],cost[1]));
        if(top==2) return memo.get(2);
        memo.put(3,Math.min(cost[1],cost[0]+cost[2]));
        if(top > 3){
            for(int i = 4; i<=top; i++){
                memo.put(i, Math.min(memo.get(i-1)+cost[i-1], memo.get(i-2)+cost[i-2]));
            }
        }
        return memo.get(top);
    }
}