package array;

public class RemoveDuplicatesFromArray2 {
    public static void main(String[]args){

        int[] nums = {1,1,1,2,2,3,2,4,4};

        int[] expectedNums= removeDuplicates(nums);

        System.out.println(expectedNums);
    }

    public static int[] removeDuplicates(int[] nums){

        int l = nums.length;

        for(int i = 0;i<l;i++){
            if(nums[i]!=0){
                for(int j =i+1;j<l;j++){
                    if(nums[i]==nums[j])
                    { nums[j]=0;}
                }
            }else {continue;}
        }



        return nums;
    }
}
