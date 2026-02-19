import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Jay");
        names.add("Deep");
        names.add("Patel");

        System.out.println("Names: " + names);

        System.out.println("First Name: " + names.get(0));

        names.remove("Deep");

        System.out.println("After Removal: " + names);
    }
}
