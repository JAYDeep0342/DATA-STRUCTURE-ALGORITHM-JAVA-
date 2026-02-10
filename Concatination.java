public class Concatination {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullname = firstName + " " + lastName; // Concatenation using +
        System.out.println("Full Name: " + fullname);
         System.out.println("Full Name: " + fullname.length());
         //charat
         for (int i = 0; i < fullname.length(); i++) {
            System.out.println("Character at index " + i + ": " + fullname.charAt(i));
            }
             //compareto
            if (firstName.compareTo(lastName)==0){
                System.out.println("First name and last name are equal.");
            }
            else if (firstName.compareTo(lastName) < 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }

        }
    }
  


//

