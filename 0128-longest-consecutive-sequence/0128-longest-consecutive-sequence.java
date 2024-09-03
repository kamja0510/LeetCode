class Solution {
    public int longestConsecutive(int[] nums){
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0;
        int start = nums[0];
        int answer = 0;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] - nums[i-1] != 1 && nums[i] - nums[i-1] != 0){    // 시작점 찾고 시작점값들 간의 간격만 구하면 된다.
                answer = Math.max(answer, nums[i-1]-start+1);
                start = nums[i];
            }
        }
        // 마지막 시작점에서 끝까지 검사도 한번 해주어야 한다.
        answer = Math.max(nums[nums.length-1] + 1 - start, answer);
        return answer;
    }
}