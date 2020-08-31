import java.io.PrintStream;

public class WorkWithStrings {
    public static void main(String[] args) {

    String txt= " Hello World! ";

        System.out.printf("%s %s %d%n%n", "Die Länge des Strings: ", txt , txt.length());
        System.out.printf("%s%n%n", txt.toLowerCase());
        System.out.printf("%s%n%n", txt.toUpperCase());
        System.out.printf("%s%n%n", txt.replace("World", "Codersbay"));
        System.out.printf("%s%n%n%n", txt.stripLeading());

        // ich komme nicht drauf wie ich da einen zeilenumbruch dazwischen einbauen kann oO
        System.out.printf("%s%n", txt.repeat(15));

    }
}
