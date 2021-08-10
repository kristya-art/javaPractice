package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciTest {
    public static void main(String[]args){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please give a number!");
            int number = sc.nextInt();

            if(number>=0) {
                System.out.println(fibonacci(number));
            }
           else{System.out.println("You have to give a positive number!");}

        }catch (InputMismatchException e){
            throw new InputMismatchException(
                    "The value must be a positive number!"
            );

        }
    }
    public static int fibonacci(int n){
        if(n==0||n==1){
            return 1;
        }

        int f = 1;
        int s = 1;

        int result = 0;

        if(n>1){
            for(int i=0; i<=n;i++){
                result = f+s;
                f=s;
                s=result;
            }

        }
        return result;
    }


}
