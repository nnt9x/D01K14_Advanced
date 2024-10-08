package b8.b2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    // Thuoc tinh
    private Queue<Document> listDocument;
    // Static
    private static Printer instance = null;

    // Phuong thuc
    private Printer() {
        this.listDocument = new LinkedList<>();
    }

    // Getinstance
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    // Phuong thuc
    public void print() throws InterruptedException {
        while (!listDocument.isEmpty()) {
            Document d = listDocument.poll();
            System.out.println("Printing...");
            Thread.sleep(1000);
            System.out.println(d);
        }
        System.out.println("----Finish----");
    }

    public void addDocument(Document document) {
        listDocument.add(document);
    }
}
