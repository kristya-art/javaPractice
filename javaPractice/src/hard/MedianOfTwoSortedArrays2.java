package hard;

import java.util.Arrays;

/**
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the
     * median of the two sorted arrays.
    * This program is just a part of complete program, that returns an sorted array of two
    * given arrays.
     *
     * The overall time complexity should be O(log (m+n)).
     */
    public class MedianOfTwoSortedArrays2 {
        public static void main(String[]args){
            long startTime = System.nanoTime();
            //code here

            int[] nums1 = {2,3,6,8};
            int[] nums2 = {0,2,4,9};
            //  System.out.println(Arrays.toString(findMedianSortedArrays(nums1,nums2)));
            int[] result = findMedianSortedArrays(nums1,nums2);
            System.out.println(Arrays.toString(result));
            long endTime = System.nanoTime();
            System.out.println(endTime-startTime);
        }
        public static int[] findMedianSortedArrays(int[] nums1, int[] nums2){
            int m = nums1.length;
            int n = nums2.length;
            int mn = n+m;
            int[] twoArrays = new int[mn];
            double result =0.0;
//        if(m==1&&n==0){result = nums1[0]; return result;}
//        if(m==0&&n==1){result = nums2[0];return result;}

           int k =m-1;
           int i = 0;
           int j = 0;
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
           return twoArrays;

        }
    }


