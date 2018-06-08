package PrintDemo;

import PrintDemo.Imp.A4PaperImpl;
import PrintDemo.Imp.B5PaperImpl;
import PrintDemo.Imp.ColorInkBokImpl;

public class PrintTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        //install
        printer.setInkbox(new ColorInkBokImpl());
        printer.setPaper(new B5PaperImpl());
        printer.print("Test Content");
    }
}
