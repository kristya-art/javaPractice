package j.removeDuplicatesFromSortedArray;
/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same
 */

import java.util.Arrays;

public class RemoveDuplicatesFromArray3 {
    public static void main(String[] args) {

            int[] nums = {-100, 1, 1, 1, 2, 2, 3, 2, 4, 4,90};

            int k = removeDuplicates(nums);
            int[] expectedNums = new int[k];

            for(int j=0;j<k;j++){
                expectedNums[j]=nums[j];
            }

            assert k == expectedNums.length;

            for (int i = 0; i < k; i++) {

            assert nums[i] == expectedNums[i];
            }


            System.out.println(k + "," + " nums" + Arrays.toString(expectedNums));
        }

        public static int removeDuplicates ( int[] nums){

            int l = nums.length;
            if (l == 0) {
                return 0;
            }
            int k = l;

            for (int i = 0; i < l; i++) {
                if (nums[i] != 101) {
                    for (int j = i + 1; j < l; j++) {
                        if (nums[i] == nums[j]) {
                            nums[j] = 101;
                            k = k - 1;
                        }
                    }
                }

            }

            Arrays.sort(nums);
            return k;
        }
    }
