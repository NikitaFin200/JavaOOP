package academ.findyruv.main;

import academ.findyruv.vector.VectorClass;
import academ.findyruv.vector.VectorClass2;
import academ.findyruv.vector.VectorClass3;
import academ.findyruv.vector.VectorClass4;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<>(5);
        vector1.add(5);

        Vector<Object> vector2 = new Vector<>(vector1);
        System.out.println(vector1);
        System.out.println(vector2);

        String[] mas = {"Hello", "Bye", "ok"};
        Vector<String> vector3 = new Vector<>(Arrays.asList(mas));

        System.out.println(vector3);

        Vector<String> vector4 = new Vector<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i >= mas.length) {
                vector4.add(null);
            } else {
                vector4.addElement(mas[i]);
            }
        }
        System.out.println(vector4);

        VectorClass newVector = new VectorClass(5);
        newVector.addNumber(3);
        System.out.println(newVector);

        VectorClass2 newVector2 = new VectorClass2(5, newVector);
        System.out.println(newVector2);

        double[] masNewVector3 = {3.5, 21, 67.5};

        System.out.println("Vector 3");
        VectorClass3 newVector3 = new VectorClass3(5, masNewVector3);
        System.out.println(newVector3.getVector3());

        VectorClass4 newVector4 = new VectorClass4(5, masNewVector3);
        System.out.println(newVector4.getVector4());
    }
}
