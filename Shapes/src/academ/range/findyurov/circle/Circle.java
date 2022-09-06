package academ.range.findyurov.circle;

import academ.range.findyurov.shapes.Shapes;

public record Circle(double radius, String name) implements Shapes {

    @Override
    public double getWidth() {
        return radius * 2;
    }

    @Override
    public double getHeight() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
        return (this.getWidth() == e.getWidth());
    }

    public int hashCode()                                      //переопределение метода hashCode
    {
        final int PRIME = 31;
        double result = 1;
        result = PRIME * result + getWidth();
        return (int) result;
    }
}

