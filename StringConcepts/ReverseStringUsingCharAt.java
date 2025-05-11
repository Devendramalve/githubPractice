package StringConcepts;

public class ReverseStringUsingCharAt {
    public static void main(String[] args) {
        String name = "komal";
        String reversed = "";
        for(int i = name.length()-1; i>=0; i--){
             reversed += name.charAt(i);
        }
        System.out.println("the reversed name is : " + reversed);
    }
}
