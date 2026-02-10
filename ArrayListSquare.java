import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSquare {
  
public static void main(String[] args) {

 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
for (int i = 1; i <= n; i++) {
    list.add(i);
 }
for (int i = 0; i < list.size(); i++) {
    int square = list.get(i) * list.get(i);
    System.out.println(square);
 
}
}
}
    
