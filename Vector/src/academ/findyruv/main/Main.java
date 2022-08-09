package academ.findyruv.main;

import academ.findyruv.vector.VectorClass;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
       /* Vector<Object> vector1 = new Vector<>(5);
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
*/
        System.out.println(1);
        VectorClass newVector = new VectorClass(5);
        newVector.addNumber(3);

        System.out.println(newVector);

        System.out.println(2);

        Vector vector2 = new Vector();
        vector2.add(newVector);

        VectorClass newVector2 = new VectorClass(vector2);
        System.out.println(newVector2);

        System.out.println(3);
        Vector<Double> vector3 = new Vector<>();
        double[] masNewVector3 = {3.5, 21, 67.5};

        VectorClass newVector3 = new VectorClass(masNewVector3, vector3);
        System.out.println(newVector3);

        System.out.println(4);
        Vector<Double> vector4 = new Vector<>();
        VectorClass newVector4 = new VectorClass(5, masNewVector3, vector4);
        System.out.println(newVector4);

        newVector4.setVector(vector4, vector4);
        System.out.println(newVector4.sum(vector4, vector4));

        System.out.println(newVector4.min(vector4, vector4));

        System.out.println(newVector4.scalar(vector4).toString());

        System.out.println(newVector4.reversal(vector3));

        System.out.println(newVector4.getLength(vector4));

        System.out.println(newVector4.index(1, vector4));
        System.out.println(vector4.hashCode());
        System.out.println(vector3.hashCode());
        System.out.println(vector4.equals(vector3));

        System.out.println(VectorClass.getSum(vector4, vector4).toString());
    }
}
