package fibonacci;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/** Write a program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... .up t a
 * given number.
 */
public class Fibonacci1 {
    public static void main(String args[]) {
    List<Integer> result = new ArrayList<>();
    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number!");
        int x = sc.nextInt();
        result= fibonacci(x);
        if(x>0) {
            System.out.println(result);
            System.out.println("This is a list of fibonacci numbers up to your number!");
        }
        else{System.out.println("Please write a positive number!");}
    }catch (InputMismatchException e){
        throw new InputMismatchException("value must be only number");
       // e.printStackTrace();
    }

    }

    public static List<Integer> fibonacci(int n){
        List<Integer> a = new ArrayList<>();
        if(n==1){
           a.add(n);
          // System.out.println(a);
        }
        if(n==2){
            a.add(1);
            a.add(1);
          // System.out.println(a);
        }
        if(n>2){
            a.add(1);
            a.add(1);
            int f=1;
            int s=1;
            int t=0;
            for(int i=2;i<=n;i=i+f){
                if(t<n) {
                    t = f + s;
                    a.add(t);
                    f = s;
                    s = t;
                }
                else {
                    return a;
             //       System.out.println(a);
                }
            }
        }
        return a;
    }
}


/*
 * 5:47
 */
