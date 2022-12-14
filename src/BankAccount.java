public abstract class BankAccount implements Loggable{
    private int accNo;
    private String name;
    private int bal;

    public BankAccount(int accNo, String name, int bal) {
        this.accNo = accNo;
        this.name = name;
        this.bal = bal;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accNo=" + accNo +
                ", name='" + name + '\'' +
                ", bal=" + bal +
                '}';
    }

    public abstract boolean deposit(int amt);
    public abstract int withdraw(int amt);
}
