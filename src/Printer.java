public class Printer {
    private String srNo;
    private int type;

    public static final int TYPE_LASER = 1;
    public static final int TYPE_DESKJET = 2;
    public static final int TYPE_3D = 3;

    public Printer(String srNo, int type) {
        this.srNo = srNo;
        this.type = type;
    }

    public void print(Printable printable) {
        printable.print();
    }

    public void display() {
        System.out.println("Sr No = " + srNo);
        switch (type) {
            case TYPE_LASER:
                System.out.println("Laser");
            case TYPE_DESKJET:
                System.out.println("Deskjet");
            case TYPE_3D:
                System.out.println("3D Printer");
        }
    }
}
