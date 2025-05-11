package StringConcepts;

import java.util.Scanner;

public class ReverseStringUsingRecurson {
    public static void main(String[] args) {
        System.out.println("enter a name which u want u reversed: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String revesed = reverse(name);
        System.out.println("your result is : " + revesed);
        sc.close();
        
    }
    public static String reverse(String name){
        if(name.isEmpty()) return name;
        return reverse(name.substring(1)) + name.charAt(0);
    }
}
