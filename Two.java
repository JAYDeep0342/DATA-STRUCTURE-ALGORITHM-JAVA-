import java .util.Scanner;
public class Two {
    public static void main(String[] args){
    System.out.print("Enter the size off  the array: ");
    Scanner sc =new Scanner(System.in);  
   int n=sc.nextInt();
   int arr[]=new int[n];
    System.out.println("Enter the elements of the array: ");    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     for(int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==4){
           System.out.println("The pair is: " + arr[i] + ", " + arr[j]  );
            
        }
     }

    }
}
}

