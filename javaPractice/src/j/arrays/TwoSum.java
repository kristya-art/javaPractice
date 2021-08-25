package j.arrays;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 */
public class TwoSum {
    public static void main(String[]args){
        long startTime = System.nanoTime();

        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.println("the numbers from indices: "+ result[0]+" and "+ result[1]+" make sum of " + target);
        System.out.println(Arrays.toString(result));

        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
    }
    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;

        int[] result= new int[2];

        for(int i = 0;i<l;i++){
            for(int j=i+1; j<l;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}
