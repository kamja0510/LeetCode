class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 완전탐색
        // 모든 경우의 수를 더해봄

        // Boolean isExist = false;
        // int[] answer = new int[2];
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             isExist = true;
        //             answer[0] = i;
        //             answer[1] = j;
        //             break;
        //         }
        //     }
        //     if (isExist)
        //         break;
        // }
        // return answer;


        // // 정렬 + 투포인터

        // Boolean isExist = false;
        // int[] answer = new int[2];
        // int[] numsOrigin = Arrays.copyOf(nums,nums.length);
        // int left = 0;
        // int right = nums.length - 1;

        // Arrays.sort(nums);

        // // 투포인터 사용
        // while((left != right) && (isExist == false)){
        //     if((nums[left] + nums[right]) < target)
        //         left += 1;
        //     else if((nums[left] + nums[right]) > target)
        //         right -= 1;
        //     else{
        //         isExist = true;
        //     }
        // }
        // // 그냥 값을 찾으면 끝나는 것이 아닌 이 숫자의 원래 배열에서의
        // // 인덱스를 찾아내야 한다. 이때 그냥 탐색하면 안되고
        // // 혹시 같은 숫자가 두개가 있을 수 있으므로 왼쪽에서 오른쪽으로
        // // 오른쪽에서 왼쪽으로 탐색을 두번해야한다.
        // for(int i = 0; i < nums.length; i++){
        //     if(numsOrigin[i] == nums[left])
        //         answer[0] = i;
        // }
        // for(int i = nums.length-1; i >= 0; i--){
        //     if(numsOrigin[i] == nums[right])
        //         answer[1] = i;
        // }
        // return answer;


        // 해시 테이블 사용

        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if (hashTable.containsKey(needed)) {
                return new int[] {hashTable.get(needed), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[] {-1, -1};

    }
}