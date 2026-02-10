import java.util.Scanner;
public class Fibonacci {

        public static void fib(int num){
            int a =0 ;
            int b =1 ; 
          System.out.print("Fibonacci series is : "+a+" "+b ) ;
                  for(int i=2;i<=num;i++){
                    int c=a+b ;
                    System.out.print(" "+c);
                    a=b;
                    b=c;
        }
    }
        
        
        public static void main(String args[]) {
            System.out.print("ENTER the number :"); 
            Scanner sc = new Scanner(System.in);
            int num =sc.nextInt();
             fib(num);
        }
    }

