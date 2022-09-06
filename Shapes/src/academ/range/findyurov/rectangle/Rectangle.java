package academ.range.findyurov.rectangle;

import academ.range.findyurov.shapes.Shapes;

public record Rectangle(double length1, double length2, String name) implements Shapes {

    @Override
    public double getWidth() {
        return length2;
    }

    @Override
    public double getHeight() {
        return length1;
    }

    @Override
    public double getArea() {
        return length1 * length2;
    }

    @Override
    public double getPerimeter() {
        return 2 * length1;
    }

    public boolean equals(Object o) {//переопределение метода equals
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Shapes e = (Shapes) o;
        return (this.getPerimeter() == e.getPerimeter());
    }

    public int hashCode() {                                //переопределение метода hashCode
        final int PRIME = 31;
        double result = 1;
        result = PRIME * result + getHeight();
        return (int) result;
    }
}
