import java.util.*;
class Stringbuilder{
    public static void main(String[] args){
        StringBuilder sb =new StringBuilder("hello");
        System.out.println(sb);
        //char at 
        System.out.println(sb.charAt(0)); 
        // char at 
        sb.setCharAt(0,'j');
        System.out.println(sb);
        //inster
        sb.insert(0,'h');
        System.out.println(sb);
//delete
sb. delete(1, 2);
        System.out.println(sb);
//append 
sb.append(" world");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}