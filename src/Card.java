public class Card implements Loggable{

    private long cardNo;
    private int bal;

    public Card(long cardNo, int bal) {
        this.cardNo = cardNo;
        this.bal = bal;
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
