package equalORCOMPARE;

public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";

        boolean result1 = str1.equalsIgnoreCase(str2); // true
        boolean result2 = str1.equalsIgnoreCase(str3); // false

        System.out.println(result1);
        System.out.println(result2);
    }
}