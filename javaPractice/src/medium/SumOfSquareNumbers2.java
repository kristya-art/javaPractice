package medium;
    /**
     * Given a non-negative integer c, decide whether there're two
     * integers a and b such that a^2+b^2 = c
     */
    public class SumOfSquareNumbers2 {
        public static void main(String[]args){

            long startTime = System.nanoTime();

            System.out.println(judgeSquareSum(1) + " t");
            System.out.println(judgeSquareSum(2) + " t");
            System.out.println(judgeSquareSum(4) + " t");

            System.out.println(judgeSquareSum(3) + " f");
            System.out.println(judgeSquareSum(0) + " t");
            System.out.println(judgeSquareSum(6) + " f");
            System.out.println(judgeSquareSum(9) + " t");



            long endTime = System.nanoTime();

            System.out.println(endTime - startTime);


        }
        public static boolean judgeSquareSum(int c) {
            int ii =0;
            int jj=0;
            int temp = 0;
            double s = Math.sqrt(c);
            if(c==0){return true;}
            for(int i = (int)Math.sqrt(c); i>=1;i--){
                temp=i*i;
                if(temp==c){return true;}
                for(int j=1;j<=s;j++){

                    jj=j*j;
                    if(temp+jj==c){return true;}
                }
            }
            return false;
        }
    }


