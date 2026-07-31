class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> num = new ArrayList<>(); 
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int first = i+1;
            int second = nums.length-1;
            while (first<second){
                int sum = nums[first] + nums[second] + nums[i];
                if (sum == 0 ){
                    num.add(Arrays.asList(nums[i],nums[first++],nums[second--]));
                    while( first < second && nums[first] == nums[first-1]){
                        ++first;
                    }
                    while( first < second && nums[second] == nums[second+1]){
                        --second;
                    }
                }
                else {
                    if (sum < 0){
                        ++first;
                    }
                    else{
                        --second;
                    }
                }
            }
        }
        return num;
    }
}