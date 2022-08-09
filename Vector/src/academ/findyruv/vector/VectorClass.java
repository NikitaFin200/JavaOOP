package academ.findyruv.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {
    private final Vector<Double> vector;

    public VectorClass(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Cannot be 0");
        }
        this.vector = new Vector<>(n);
    }

    public VectorClass(Vector<Double> vector) {
        this.vector = vector;
    }

    public VectorClass(double[] mas, Vector<Double> vector) {
        this.vector = vector;
        int i = 0;
        while (i < mas.length) {
            vector.addElement(mas[i]);
            i++;
        }
    }

    public VectorClass(int n, double[] mas, Vector<Double> vector) {
        this.vector = vector;

        for (int i = 0; i < n; i++) {
            assert false;
            if (i < mas.length) {
                assert false;
                vector.add(mas[i]);
            } else {
                vector.add((double) 0);
            }
        }
    }

    public double getSize() {
        return vector.size();
    }

    public void addNumber(double number) {
        vector.add(number);
    }

    public Vector<Double> getVector() {
        return vector;
    }

    public String toString() {
        return vector.toString();
    }

    public Vector sum(Vector<Double> vector1, Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double[] sum = new double[vector2.size()];

        for (int i = 0; i < length; i++) {
            sum[i] = vector1.get(i) + vector2.get(i);
        }

        return new Vector(Collections.singleton(sum));
    }

}
