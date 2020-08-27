public class WorkWithStrings {
    public static void main(String[] args) {

    String txt= " Hello World! ";

        System.out.printf("%s %s %s%n%n", "Die Länge des Strings: ", txt , txt.length());
        System.out.printf("%s%n%n", txt.toLowerCase());
        System.out.printf("%s%n%n", txt.toUpperCase());
        System.out.printf("%s%n%n", txt.replace("World", "Codersbay"));
        System.out.printf("%s%n%n%n", txt.stripLeading());

        for (int i=1; i<=15; i++) {
            System.out.printf("%d%s%n%n", i, txt);
        }

    }
}
