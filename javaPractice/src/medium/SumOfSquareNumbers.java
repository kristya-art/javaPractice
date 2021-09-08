package medium;

/**
 * Given a non-negative integer c, decide whether there're two
 * integers a and b such that a^2+b^2 = c
 * this code is not the most efficient solution, but it does work
 */
public class SumOfSquareNumbers {
    public static void main(String[]args){

        long startTime = System.nanoTime();

        System.out.println(judgeSquareSum(1));
        System.out.println(judgeSquareSum(2));
        System.out.println(judgeSquareSum(4));

        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(0));

        long endTime = System.nanoTime();

       System.out.println(endTime - startTime);


    }
    public static boolean judgeSquareSum(int c) {
//        int ii =0;
//        int jj=0;
//        int temp = 0;
//        double s = Math.sqrt(c);
//        if(c==0){return true;}
//        for(int i = 1; i<=s;i++){
//            temp=i*i;
//            if(temp==c){return true;}
//            for(int j=1;j<=s;j++){
//
//                 jj=j*j;
//                if(temp+jj==c){return true;}
//            }
//        }
//        return false;
        int ii =0;
        int jj=0;
        double s = Math.sqrt(c);
        if(c==0){return true;}
        for(int i = 1; i<=s;i++){
            if(i*i==c){return true;}
            for(int j=1;j<=s;j++){
                ii = i*i;
                jj=j*j;
                if(ii+jj==c){return true;}
            }
        }
        return false;
    }
}
