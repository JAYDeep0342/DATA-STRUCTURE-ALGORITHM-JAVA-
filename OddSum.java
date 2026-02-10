import java.util.Scanner;
public class OddSum {
public static int oddsum(int num){
    int add = 1;
    for(int i=1;i<=num;i++){
if (i%2!=0){
add=add +i ;
}        
    }
    return add;
}
    
    
    public static void main(String[] args) {
        System.out.println("ENTER the number "); 
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.print("this number factorial is:"+ oddsum(num));
    }
}

