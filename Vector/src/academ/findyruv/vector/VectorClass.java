package academ.findyruv.vector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorClass {
    private Vector<Double> vector;

    public VectorClass(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Cannot be 0");
        }
        this.vector = new Vector<>(n);
    }

    public VectorClass(Vector<Double> vector) {
        this.vector = vector;
    }

    public VectorClass(double[] mas) {
        int i = 0;
        Collections.addAll(vector, mas);
        /*while (i < mas.length) {
            vector.add(mas[i]);
            i++;
        }*/
    }

    public VectorClass(int n, double[] mas) {
        for (int i = 0; i < n; i++) {
            assert false;
            if (i < mas.length) {
                vector.add(mas[i]);
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
}
