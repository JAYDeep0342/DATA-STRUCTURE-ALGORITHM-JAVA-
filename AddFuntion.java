import java.util.Scanner;
public class AddFuntion {


   
    public static int addNumbers (int a,int b){
        int c = a+b;
    return c;
}

    public static void main(String[] args) {
        System.out.println("ENTER"); 
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c =addNumbers(a,b);
        System.out.println("Sum = " + c);



    
}
}



