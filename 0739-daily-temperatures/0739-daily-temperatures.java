class Solution {
    public int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];
        int presentDay;
        for(presentDay = 0; presentDay < temperatures.length; presentDay++ ){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[presentDay]){
                int prevDay = stack.pop();
                answer[prevDay] = presentDay - prevDay;
            }
            stack.push(presentDay);
        }
        
        return answer;
    }
}