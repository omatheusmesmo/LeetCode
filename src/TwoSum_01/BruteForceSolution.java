package TwoSum_01;

class BruteForceSolution {
    public int[] twoSum(int[] nums, int target) {

        int[] numsPosition = new int[2];

        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){

                if (nums[i] + nums[j]== target ){
                    numsPosition[0] = i;
                    numsPosition[1] = j;
                }
            }
        }
        return numsPosition;
    }
}