package b8.b2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = Printer.getInstance();

        printer.addDocument(new Book(1, "Java 2", "BKACAD"));
        printer.addDocument(new Newspaper("N10", "T10","2024-10-08"));

        printer.print();

    }
}
