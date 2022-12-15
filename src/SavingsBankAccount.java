public class SavingsBankAccount extends BankAccount {

    private float interestRate;

    public SavingsBankAccount(int accNo, String name, int bal, float interestRate) {
        super(accNo, name, bal);
        this.interestRate = interestRate;
    }

    @Override
    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }

        setBal(getBal() + amt);
        return true;
    }

    @Override
    public int withdraw(int amt) {
        if(amt < getBal()) {
            return 0;
        }

        setBal(getBal() - amt);
        return amt;
    }

    @Override
    public void log() {
        System.out.println("SBA Log...");
    }

    @Override
    public void info() {
        System.out.println("SBA info...");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Printing: " + interestRate);
        System.out.println("-----------------------------------");
    }
}
