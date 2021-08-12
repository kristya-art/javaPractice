package array.removeDuplicatesFromSortedArray;
//not jet finish
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArrayJava8 {
    public static void main(String[]args){
     int[] arr = {1,1,1,2,2,2,3,2,3,3,3};
        System.out.println(removeDuplicates(arr));
    }

    public static int[] removeDuplicates(int[] nums) {
        int index;
        for (int j = 0; j < nums.length; j++) {
            for (int a = j + 1; a < nums.length; a++) {
                if (nums[j]==nums[a]) {
                    index=a;


                    return IntStream.range(0, nums.length)
                            .filter(i -> i != index)
                            .map(i->nums[i])
                            .toArray();
                }
            }
        }
        return nums;
    }
}
