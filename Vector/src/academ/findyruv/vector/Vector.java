package academ.findyruv.vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Vector {
    private java.util.Vector<Double> vector;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Cannot be 0 and less");
        }
        this.vector = new java.util.Vector<>(n);
    }

    public Vector(java.util.Vector<Double> vector) {
        this.vector = vector;
    }

    public Vector(double[] mas, java.util.Vector<Double> vector) {
        this.vector = vector;
        int i = 0;
        while (i < mas.length) {
            vector.addElement(mas[i]);
            i++;
        }
    }

    public Vector(int n, double[] mas, java.util.Vector<Double> vector) {
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

    public int getSize() {
        return vector.size();
    }

    public void addNumber(double number) {
        vector.add(number);
    }

    public java.util.Vector<Double> getVector() {
        return vector;
    }

    public void setVector(java.util.Vector<Double> vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return Arrays.toString(new java.util.Vector[]{vector});
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

        final Vector other = (Vector) obj;

        if (this.vector.size() != other.vector.size()) {
            return false;
        }

        for (int i = 0; i < vector.size(); i++) {
            if (!Objects.equals(this.vector.get(i), other.vector.get(i))) {
                return false;
            }
        }

        return true;
    }

    public java.util.Vector<double[]> amount(java.util.Vector<Double> vector1, java.util.Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double[] sum = new double[vector2.size()];

        for (int i = 0; i < length; i++) {
            sum[i] = vector1.get(i) + vector2.get(i);
        }

        return new java.util.Vector<>(Collections.singleton(sum));
    }

    public java.util.Vector<double[]> difference(java.util.Vector<Double> vector1, java.util.Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());

        double[] min = new double[vector2.size()];

        for (int i = 0; i < length; i++) {
            min[i] = vector2.get(i) - vector1.get(i);
        }

        return new java.util.Vector<>(Collections.singleton(min));
    }

    public java.util.Vector<double[]> scalarMultiplication(java.util.Vector<Double> vector) {
        double[] mas = new double[vector.size()];
        int scalarNumber = 32;

        for (int i = 0; i < vector.size(); i++) {
            mas[i] = vector.get(i) * scalarNumber;
        }

        return new java.util.Vector<>(Collections.singleton(mas));
    }

    public java.util.Vector<double[]> reversal(java.util.Vector<Double> vector) {
        double[] mas = new double[vector.size()];

        for (int i = 0; i < vector.size(); i++) {
            mas[i] = vector.get(i) * -1;
        }

        return new java.util.Vector<>(Collections.singleton(mas));
    }

    public int getLength(java.util.Vector<Double> vector) {
        return vector.size();
    }

    public double index(int ind, java.util.Vector<Double> vector) {
        return vector.get(ind);
    }

    public static java.util.Vector<double[]> getAmount(java.util.Vector<Double> vector1, java.util.Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double[] mas = new double[length];

        for (int i = 0; i < length; i++) {
            mas[i] = vector1.get(i) + vector2.get(i);
        }

        return new java.util.Vector<>(Collections.singleton(mas));
    }

    public static java.util.Vector<double[]> getDifference(java.util.Vector<Double> vector1, java.util.Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());

        double[] mas = new double[length];

        for (int i = 0; i < length; i++) {
            mas[i] = vector1.get(i) - vector2.get(i);
        }

        return new java.util.Vector<>(Collections.singleton(mas));
    }

    public static double scalarProduct(java.util.Vector<Double> vector1, java.util.Vector<Double> vector2) {
        int length = Math.max(vector1.size(), vector2.size());
        double scalarEquality = 0;

        for (int i = 0; i < length; i++) {
            scalarEquality += vector1.get(i) * vector2.get(i);
        }

        return scalarEquality;
    }
}
