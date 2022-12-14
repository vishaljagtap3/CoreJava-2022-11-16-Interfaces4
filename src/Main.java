public class Main {
    public static void main(String[] args) {
        SavingsBankAccount sba = new SavingsBankAccount(
                1011,
                "Vishal",
                1000,
                6.4f
        );

        TestingTool.test(sba);

        Card card = new Card(132123123, 1000);
        TestingTool.test(card);
    }
}
