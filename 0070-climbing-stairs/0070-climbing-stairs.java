class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1,1);
        memo.put(2,2);
        if(n > 2){
            for(int i = 3; i <= n; i++){
                int afterTwoStep = memo.get(i-2);
                int afterOneStep = memo.get(i-1);
                memo.put(i,afterOneStep + afterTwoStep);
            }
        }
        return memo.get(n);
    }
}