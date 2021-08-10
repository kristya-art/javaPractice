package fibonacci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FibonacciTest2 {
    public static void main(String []args){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("please give a number!");

            int number = sc.nextInt();

            if(number>=0){System.out.println(fibonacci(number));}
            else{System.out.println("You have to give a positive number!");}
        }catch(InputMismatchException e){
            throw new InputMismatchException("You have to write only a number!");
        }
    }

    public static List<Integer> fibonacci(int n){
        List<Integer> fibonacciList= new ArrayList<>();

        fibonacciList.add(1);

        int f = 0;
        int s = 1;
        int result = 0;
        for(int i = 0; i<=n-1; i++){
            result = f+s;
            fibonacciList.add(result);
            f=s;
            s=result;
        }

        return fibonacciList;
    }
}
