package StringConcepts;

public class ReverseStringUsingBuilder {
    public static void main(String[] args) {
        String name = "devendra";
        String stB = new StringBuilder(name).reverse().toString();
        System.out.println(stB);
    }
    
}
