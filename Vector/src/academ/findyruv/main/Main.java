package academ.findyruv.main;

import academ.findyruv.vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vectorObject1 = new Vector(5);
        vectorObject1.addNumber(3);
        System.out.println(vectorObject1);

        java.util.Vector vector1 = new java.util.Vector();
        vector1.add(vectorObject1);
        Vector vectorObject2 = new Vector(vector1);
        System.out.println(vectorObject2.toString());

        java.util.Vector<Double> vector2 = new java.util.Vector<>();
        double[] arrayVector = {3.5, 21, 67.5};
        Vector vectorObject3 = new Vector(arrayVector, vector2);
        System.out.println(vectorObject3);

        java.util.Vector<Double> vector3 = new java.util.Vector<>();
        Vector vectorObject4 = new Vector(5, arrayVector, vector3);
        System.out.println(vectorObject4);

        System.out.println(vectorObject4.amount(vector3, vector3));

        System.out.println(vectorObject4.difference(vector3, vector3));

        System.out.println(vectorObject4.scalarMultiplication(vector3).toString());

        System.out.println(vectorObject4.reversal(vector2));

        System.out.println(vectorObject4.getLength(vector3));

        System.out.println(vectorObject4.index(1, vector3));

        System.out.println(vector3.hashCode());

        System.out.println(vector2.hashCode());

        System.out.println(vector3.equals(vector2));

        System.out.println(Vector.getAmount(vector3, vector3).toString());
        System.out.println(Vector.getDifference(vector3, vector3));
        System.out.println(Vector.scalarProduct(vector3, vector3));
    }
}
