class Solution {
    public int[] twoSum(int[] nums, int target) {
        Boolean isExist = false;
        int[] answer = new int[2];
        int firstValue, secondValue;
        for(int i = 0;i < nums.length - 1;i++){
            for(int j = i+1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    isExist = true;
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
            if(isExist) break;
        }
        return answer;
    }
}