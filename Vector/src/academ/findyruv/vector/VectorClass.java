package academ.findyruv.vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Vector;

public class VectorClass {
    private Vector<Double> vector;
    private Vector<Double> vector2;

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

    public void setVector(Vector<Double> vector) {
        this.vector = vector;
    }

    public void setVector(Vector<Double> vector, Vector<Double> vector1) {
        this.vector = vector;
        this.vector2 = vector1;
    }

    @Override
    public String toString() {
        return Arrays.toString(new Vector[]{vector});
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash = 21 * hash + (this.vector != null ? this.vector.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        final VectorClass other = (VectorClass) obj;

        if (this.vector.size() != other.vector.size()) {
            return false;
        }

        for (int i = 0; i < vector.size(); i++) {
            if (this.vector.get(i) != other.vector.get(i)) {
                return false;
            }
        }

        return true;
    }

    public void printVector(Vector<Double> vector) {
        for (double objects : vector) {
            System.out.print(objects + " ");
        }
    }

    public Vector<double[]> sum(Vector<Double> vector1, Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double[] sum = new double[vector2.size()];

        for (int i = 0; i < length; i++) {
            sum[i] = vector1.get(i) + vector2.get(i);
        }

        return new Vector<>(Collections.singleton(sum));
    }

    public Vector<double[]> min(Vector<Double> vector1, Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());

        double[] min = new double[vector2.size()];

        for (int i = 0; i < length; i++) {
            min[i] = vector2.get(i) - vector1.get(i);
        }

        return new Vector<>(Collections.singleton(min));
    }

    public Vector<double[]> scalar(Vector<Double> vector) {
        double[] mas = new double[vector.size()];
        int scalarNumber = 32;

        for (int i = 0; i < vector.size(); i++) {
            mas[i] = vector.get(i) * scalarNumber;
        }

        return new Vector<>(Collections.singleton(mas));
    }

    public Vector<double[]> reversal(Vector<Double> vector) {
        double[] mas = new double[vector.size()];

        for (int i = 0; i < vector.size(); i++) {
            mas[i] = vector.get(i) * -1;
        }

        return new Vector<>(Collections.singleton(mas));
    }

    public int getLength(Vector<Double> vector) {
        return vector.size();
    }

    public double index(int ind, Vector<Double> vector) {
        return vector.get(ind);
    }

    public static Vector<Double> getSum(Vector<Double> vector1, Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double[] mas = new double[length];

        for (int i = 0; i < length; i++) {
            mas[i] = vector1.get(i) + vector2.get(i);
        }

        return new Vector(Collections.singleton(mas));
    }
}
