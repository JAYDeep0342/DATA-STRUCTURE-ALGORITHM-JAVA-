import java.util.Scanner;
public class GretestNumber {
  public static int gretest(int a,int b){
    if(a>b){
        return a;
    } else if(b>a){
        return b;
    }else{
        System.out.println("both numbers are eual");
        return a;
    }
    }
    
 public static void main(String[] args) {
        System.out.println("ENTER"); 
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("more than  " + gretest( a, b));
}
}