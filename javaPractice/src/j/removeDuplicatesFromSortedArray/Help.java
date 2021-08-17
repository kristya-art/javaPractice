package j.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Help {
    public static void main(String[]args) {
        String raw = "12_";

        final int[] ints1 = raw.chars()
                .map(x -> x - '0')
                .toArray();

System.out.println(Arrays.toString(ints1));
    }
}
