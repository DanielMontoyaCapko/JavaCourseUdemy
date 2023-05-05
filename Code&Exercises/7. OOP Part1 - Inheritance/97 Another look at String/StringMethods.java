public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("staringIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        //Join Strings
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        //Replace in String
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/", "___"));

        // Repeat String
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        // Indent
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));
    }
}
