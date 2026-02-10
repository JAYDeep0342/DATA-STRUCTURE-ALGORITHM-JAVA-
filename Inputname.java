import java.util.Scanner;
public class Inputname {
    public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
         System.out.println("enter your size");
         int size =sc.nextInt();
         String name[]=new String [size];
         for(int i =0;i<size;i++){
            System.out.println();
            name[i]= sc.next();
         }
         for (int i=0;i<size;i++){
            System.out.println("name is :"+name[i])
         }


    }
}
