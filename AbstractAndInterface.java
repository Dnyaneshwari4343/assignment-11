interface Printer {
    void print();
}

abstract class Document {
    abstract void open();
}

class PDF extends Document implements Printer {
    public void print() {
        System.out.println("Printing PDF");
    }

    void open() {
        System.out.println("Opening PDF");
    }

    public static void main(String[] args) {
        PDF pdf = new PDF();
        pdf.open();
        pdf.print();
    }
}
