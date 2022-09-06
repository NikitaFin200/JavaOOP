package academ.range.findyurov.square;


import academ.range.findyurov.shapes.Shapes;

public class Square implements Shapes {

    private final String name;
    private final double length;

    public Square(double length, String name) {
        this.length = length;
        this.name = name;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getHeight() {
        return length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    public double getX() {
        return length;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean equals(Object o) {           //переопределение метода equals
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
        return (this.getArea() == e.getArea());
    }

    public int hashCode()                           //переопределение метода hashCode
    {
        final int PRIME = 31;
        double result = 1;
        result = PRIME * result + getArea();
        return (int) result;
    }
}
