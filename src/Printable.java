public interface Printable {
    default void print() {
        System.out.println("Basic printing setup done...");
    }
}
