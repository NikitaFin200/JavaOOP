package academ.findyruv.vector;

import java.util.Vector;

public class VectorClass4 extends VectorClass3 {
    private Vector<Double> vector4;

    public VectorClass4(int n, double[] mas) {
        super(n, mas);

        for (int i = 0; i < n; i++) {
            assert false;
            if (i < mas.length) {
                vector4.add(mas[i]);
                assert false;
                vector4.add(mas[i]);
            } else {
                vector4.add((double) 0);
            }
        }
    }

    public double getSize() {
        return vector4.size();
    }

    public Vector<Double> getVector4() {
        return vector4;
    }

    public void setVector4(Vector<Double> vector4) {
        this.vector4 = vector4;
    }
}
