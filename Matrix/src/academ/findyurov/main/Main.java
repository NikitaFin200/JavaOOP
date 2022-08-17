package academ.findyurov.main;

import academ.findyurov.matrix.Matrix;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[5][5];
        Vector<String>[] vector = (Vector<String>[]) new Vector[6];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Vector<>();

            vector[i].add(0, "1");
            vector[i].add(1, "2");

        }

        Matrix obj1 = new Matrix(5, 5);
        Matrix obj2 = new Matrix(obj1);
        Matrix obj3 = new Matrix(array);
        Matrix obj4 = new Matrix(vector);

        System.out.println(Arrays.deepToString(obj1.getMatrix()));
        System.out.println(Arrays.deepToString(obj2.getMatrix()));
        System.out.println(Arrays.deepToString(obj3.getMatrix()));
        System.out.println(Arrays.deepToString(obj4.getMatrixVector()));

        System.out.println(Arrays.toString(obj1.getDimensions()));
        System.out.println(Arrays.toString(obj4.getDimensionsVector()));

        System.out.println(obj4.get(0, 0));
        obj4.write(0, 1);
        System.out.println(obj4.get(0, 0));
        System.out.println();

        obj4.print(obj4.getMatrixVector());

        System.out.println(Arrays.toString(obj4.stolb(0)));
    }
}
