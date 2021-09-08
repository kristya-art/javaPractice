package medium;
/**
 * Given a non-negative integer c, decide whether there're two
 * integers a and b such that a^2+b^2 = c
 */
public class SumOfSquareNumber3 {
    public static void main(String[]args){
        long startTime = System.nanoTime();
         // code here
         System.out.println(judgeTheSquareSum(1000));
        System.out.println((judgeTheSquareSum(5)));
        System.out.println((judgeTheSquareSum(4)));
         System.out.println(judgeTheSquareSum(69));
         System.out.println(judgeTheSquareSum(70));
         System.out.println(judgeTheSquareSum(68));
         System.out.println(judgeTheSquareSum(64));
        System.out.println((int)Math.sqrt(100));
        //code here

        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);


    }

    public static boolean judgeTheSquareSum(int c){
        if(c == 0||c==1 || c==2) {return true;}
        int difference = 0;
        int root  = (int)Math.sqrt(c);
        int root2 = 0;
        if(root*root == c){return true;}


        for(int i = root;i>=1;i--) {
            difference = c-i*i;
            root2 = (int)Math.sqrt(difference);
            if ((root2 * root2) + i * i == c) {
                return true;
            }
        }
        return false;
    }
}
