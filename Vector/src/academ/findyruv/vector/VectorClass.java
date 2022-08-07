package academ.findyruv.vector;

import java.util.Vector;

public class VectorClass {
    private final Vector<Double> vector;

    public VectorClass(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Cannot be 0");
        }
        this.vector = new Vector<>(n);
    }

    public double getSize() {
        return vector.size();
    }

    public void addNumber(double number) {
        vector.add(number);
    }
}
