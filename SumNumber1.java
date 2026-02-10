import java.util.Scanner;
public class SumNumber1 {

    public static void main(String[] args) {
        int a=1;
        Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
        int sum=0;
        for(int i =a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        
    }
    
}
