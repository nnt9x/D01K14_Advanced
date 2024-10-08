package b8.singleton;

public class Printer {
    private static Printer instance = null;

    private Printer() {

    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }
}
