import java.util.Scanner;
public class Tranpose {
  
    public static void main(String[] args) {
        //rows
    System.out.print("enter the row of the array :");
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
   //columns
    System.out.print("enter the col  of the array :");
      int m =sc.nextInt();
//array
    int[][] Myarray=new int[n][m] ;
    //input
    System.out.println("enter the elements of the array :");    
    for(int i =0; i<n;i++){
        for(int j =0; j<m;j++){
        Myarray[i][j]=sc.nextInt();
    }
}
//output
System.out.println("my matrix is :");
for(int j =0; j<n;j++){
    for(int i =0; i<m;i++){
        
        System.out.print(Myarray[i][j] + " ");
    }
    System.out.println();
}
}
    }

