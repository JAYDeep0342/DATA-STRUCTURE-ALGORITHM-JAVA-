import java.util.Scanner;
class CircleCircomferrance{
 public static double  fact( double num){
       return  (2*3.14*num);
    }
        
        
        public static void main(String[] args) {
            System.out.println("ENTER the number "); 
            Scanner sc = new Scanner(System.in);
            double num =sc.nextDouble();
            System.out.print("this circomferrance  is:"+ fact(num));
        }
    }
    
