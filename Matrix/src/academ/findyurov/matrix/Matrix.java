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
        for (Vector<String> strings : vector) {
            System.out.println(Arrays.toString(new Vector[]{strings}));
        }
    }

    public void print(double[][] array) {
        for (double[] doubles : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(doubles[j] + " ");
            }

            System.out.println();
        }
    }

    public String[] stolb(int j) {
        String[] mas = new String[vector.length];

        for (int i = 0; i < vector.length; i++) {
            mas[i] = vector[i].get(j);
        }

        return mas;
    }

    public double[][] transposeMatrix(double[][] array) {
        double[][] temp = new double[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                temp[j][i] = array[i][j];
            }
        }

        return temp;
    }

    public Vector<String>[] transposeMatrix(Vector<String>[] vector) {
        String[][] temp = new String[vector.length][vector[0].size()];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].size(); j++) {
                temp[i][j] = vector[i].get(j);
            }
        }

        Vector<String>[] newVector = vector;

        for (int i = 0; i < vector[0].size(); i++) {
            Vector<String> row = new Vector<>(vector.length);

            for (int j = 0; j < vector.length; j++) {
                row.add(j, vector[j].get(i));
            }

            newVector[i].addAll(row);
        }

        return newVector;
    }
}
