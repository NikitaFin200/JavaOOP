package academ.findyurov.matrix;

import java.util.Arrays;
import java.util.Vector;

public class Matrix {
    // private Vector<Vector<Double>> vector = new Vector<Vector<Double>>();

    private double[][] mas;

    Vector<String>[] vector;

    public Matrix(int n, int m) {
        this.mas = new double[n][m];
    }

    public Matrix(Matrix matrix) {
        this.mas = matrix.mas;
    }

    public Matrix(double[][] mas) {
        this.mas = mas;
    }

    public Matrix(Vector<String>[] vector) {
        this.vector = vector;
    }

    public double[][] getMatrix() {
        return mas;
    }

    public Vector[] getMatrixVector() {
        return vector;
    }

    public int[] getDimensions() {
        return new int[]{mas.length, mas[0].length};
    }

    public int[] getDimensionsVector() {
        return new int[]{vector.length, vector[0].size()};
    }

    public String get(int i, int j) {
        return vector[i].get(j);
    }

    public void write(int i, int j) {
        vector[0].set(j, "hekk");
    }

    public void print(Vector<String>[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(new Vector[]{vector[i]}));
        }
    }

    public String[] stolb(int j) {
        String[] mas = new String[vector.length];

        for (int i = 0; i < vector.length; i++) {
            mas[i] = vector[i].get(j);
        }

        return mas;
    }
}
