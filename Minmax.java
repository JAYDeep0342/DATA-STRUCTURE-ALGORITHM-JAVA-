import java.util.*;
public class Minmax {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your size");
        int size =sc.nextInt();
        int name[]=new int [size];
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<size;i++){
            name[i]= sc.nextInt();
        }
        for(int i =0;i<name.length;i++){
            if(name[i]<min){
                min=name[i];
            }
            if(name[i]>max)
            max=name[i];
        }
        System.err.println("max is"+max);
        
        System.err.println("min is"+min);
        }
}
