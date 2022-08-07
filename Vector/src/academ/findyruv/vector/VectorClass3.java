package academ.findyruv.vector;

import java.util.Vector;

public class VectorClass3 extends VectorClass {
    private Vector<Double> vector3;

    public VectorClass3(int n, double[] mas) {
        super(n);

        int i = 0;
        while (n < mas.length) {
            vector3.add(mas[i]);
            i++;
        }
    }

    public Vector<Double> getVector3() {
        return vector3;
    }

    public void setVector3(Vector<Double> vector3) {
        this.vector3 = vector3;
    }
}
