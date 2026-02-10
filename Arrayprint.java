import java.util.Scanner;
class Arrayprint{
public static void main(String[] args) {
    System.out.println("enter the size of the array :");
    Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();
    int[]Myarray=new int[size] ;
    for(int i =0; i<size;i++){
        Myarray[i]=sc.nextInt();
    }
    for(int i =0; i<size;i++){
        System.out.print(" "+Myarray[i]);
    }

    }
}

