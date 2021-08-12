package array.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayLeetCodeSolution {
    public static void main(String[]args){

        int[] nums = {-100,1,1,1,2,2,3,2,4,4};

        int[] expectedNums = nums;
        int k= removeDuplicates(nums);

        assert k == expectedNums.length;

        for(int i =0; i<k;i++){
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k + ","+ " nums" + Arrays.toString(expectedNums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
