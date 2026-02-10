import java.util.Scanner;

public class Factorial {
    public static int fact(int num){
    int fact = 1;
    for(int i=1;i<=num;i++){
        fact=fact * i ;
        
    }
    return fact;
}
    
    
    public static void main(String[] args) {
        System.out.println("ENTER the number "); 
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.print("this number factorial is:"+ fact(num));
    }
}

