package array.removeDuplicatesFromSortedArray;

import java.util.Arrays;

/**
 * This program Removes the Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromArray2 {


    public static void main(String[]args){

        int[] nums = {-100,1,1,1,2,2,3,2,4,4};

        int[] expectedNums = nums;
        int k= removeDuplicates(nums);

        assert k == expectedNums.length;

        for(int i =0; i<k;i++){
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k + ","+ " nums" +Arrays.toString(expectedNums));
    }

    public static int removeDuplicates(int[] nums){

        int l = nums.length;
        if(l==0){return 0;}
        int k =l;

        for(int i = 0;i<l;i++){
            if(nums[i]!='_'){
                for(int j =i+1;j<l;j++){
                    if(nums[i]==nums[j])
                    { nums[j]='_';
                    k=k-1;
                    }
                }
            }

        }

        Arrays.sort(nums);
        return k;
    }
}
