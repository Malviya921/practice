public class overloadingusingNET {
    // this is non static so we need to create an object of the class before using the fn. present inside the class.



    // Method 1: Concatenates two strings
        public String processStrings(String str1, String str2) {
            return str1 + str2; }

        // Method 2: Reverses a string
        public String processStrings(String str) {
            return new StringBuilder(str).reverse().toString(); }

        // Method 3: Converts a string to uppercase
        public String processStrings(String str, boolean toUpper) {
            if (toUpper)
                return str.toUpperCase();
            else
                return str.toLowerCase();
        }

        public static void main(String[] args) {
              overloadingusingNET obj = new overloadingusingNET();

//            // Calling the methods with different signatures
//            System.out.println(obj.processStrings("Hello", " World")); // Output: Hello World
//            System.out.println(obj.processStrings("Java")); // Output: avaJ
//            System.out.println(obj.processStrings("mixedCase", true)); // Output: MIXEDCASE
//            System.out.println(obj.processStrings("mixedCase", false)); // Output: mixedcase

            String a = obj.processStrings("prince");
            String b = obj.processStrings("ravi","saini");
            String c = obj.processStrings("prince",true);
            System.out.println(a+"_"+b+"_"+c);




        }
    }
