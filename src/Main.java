public class Main {
    public static void main(String[] args) {

        System.out.println(Constants.BASERATE);

        SavingsBankAccount sba = new SavingsBankAccount(
                1011,
                "Vishal",
                1000,
                6.4f
        );

        TestingTool.test(sba);

        Card card = new Card(132123123, 1000);
        TestingTool.test(card);

        System.out.println();

        Printer printer = new Printer("A34BCD123", Printer.TYPE_LASER);
        printer.print(sba);
        printer.print(card);

        //
        Printable p = sba;
        Loggable l = card;

        ((Loggable)p).info();

        p = new File();
        //((Loggable)p).info(); //exception

    }
}
