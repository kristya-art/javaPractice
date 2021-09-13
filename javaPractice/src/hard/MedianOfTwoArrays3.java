package hard;

import java.util.Arrays;

/**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the
     * median of the two sorted arrays.
     *
     * The overall time complexity should be O(log (m+n)).
 */
    public class MedianOfTwoArrays3 {
        public static void main(String[]args){
            long startTime = System.nanoTime();
            //code here

            int[] nums1 = {0,0};
            int[] nums2 = {0,0};
            //  System.out.println(Arrays.toString(findMedianSortedArrays(nums1,nums2)));
            double result = findMedianSortedArrays(nums1,nums2);
            System.out.println(result);
            long endTime = System.nanoTime();
            System.out.println(endTime-startTime);
        }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2){
            int m = nums1.length;
            int n = nums2.length;
            int mn = n+m;
            int[] twoArrays = new int[mn];
            double result =0.0;
            int place1 = 0;
            int place2 = 0;

            int i = 0;
            int j = 0;

            if(m==1&&n==0){result =(double)nums1[0];}
            if(n==1&&m==0){result = (double)nums2[0];}
            for(int ii = 0; ii<twoArrays.length;ii++){
                while (i<m){
                    twoArrays[ii]=nums1[i];
                    i++;
                    ii++;
                }
                while(j<n){
                    twoArrays[ii]=nums2[j];
                    j++;
                    ii++;
                }
            }

            Arrays.sort(twoArrays);
            if(twoArrays.length%2==0){
                place1 = twoArrays.length/2;
                place2 = place1 - 1;
                result = (double)(twoArrays[place1]+twoArrays[place2])/2;
            }
            else  {
                place1 = twoArrays.length/2;
                result = (double) (twoArrays[place1]);
            }

            return result;

        }
    }




