abstract class OddDetector {
    protected int n;

    public OddDetector(int n) {
        this.n = n;
    }

    public abstract boolean isOdd();
}

public class B extends OddDetector {
    public B(int n) {
        super(n);
    }

    public boolean isOdd() {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.isOdd());
    }
}