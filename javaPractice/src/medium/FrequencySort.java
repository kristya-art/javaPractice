package medium;

import java.util.Arrays;

public class FrequencySort {
    public static void main(String[]args){

        String s = "cocoJamjao";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        char[] temp = s.toCharArray();

        Arrays.sort(temp);

        return new String(temp);
    }

}
