package solutions;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumSolution {
    //两数之和
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
    //test
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 14};
        int target = 9;
        twoSumSolution solution = new twoSumSolution();
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}


