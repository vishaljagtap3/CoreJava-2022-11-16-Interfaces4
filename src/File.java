public class File implements Printable{

    @Override
    public void print() {
        Printable.super.print();
        System.out.println("File print...");
    }
}
