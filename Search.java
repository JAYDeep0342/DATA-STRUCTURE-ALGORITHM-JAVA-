import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] myArray = new int[size];
         for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.print("Enter the element of the array: ");
        int element = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(myArray[i] == element) {
                System.out.println("Element found at index: " + i);
            }
        }
    }
}
    

