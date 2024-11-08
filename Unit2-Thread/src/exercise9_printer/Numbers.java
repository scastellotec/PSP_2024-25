package exercise9_printer;

public class Numbers  implements Runnable{

    private Printer printer;

    public Numbers(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for(int i=0; i<26; i++){
            try {
                printer.imprimeNumero();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

