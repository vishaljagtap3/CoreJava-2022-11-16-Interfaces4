public class Card implements Loggable, Printable {

    private long cardNo;
    private int bal;

    public Card(long cardNo, int bal) {
        this.cardNo = cardNo;
        this.bal = bal;
    }

    @Override
    public void print() {
        Printable.super.print();
        System.out.println("Printing: " + toString());
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                ", bal=" + bal +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Card info...");
    }

    @Override
    public void log() {
        System.out.println("Card log...");
    }
}
