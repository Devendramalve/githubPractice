package StringConcepts;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("enter a name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(" name printing :" + name);
        // int size = n
        char[] charArray = name.toCharArray();
        String reversed = "";
        for(int i = charArray.length-1; i>=0; i--){
            reversed = reversed + charArray[i];
        }
        System.out.println("final output of reversed string :  " + reversed);
    }
    
}
