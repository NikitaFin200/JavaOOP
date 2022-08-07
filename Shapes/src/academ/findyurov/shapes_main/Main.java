package academ.findyurov.shapes_main;


import academ.findyurov.circle.Circle;
import academ.findyurov.rectangle.Rectangle;
import academ.findyurov.shapes.Shapes;
import academ.findyurov.square.Square;
import academ.findyurov.triangle.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shapes[] shape = new Shapes[]{
                new Square(10, "academ.findyurov.shapes.Square 1"),
                new Square(15, "academ.findyurov.shapes.Square 2"),
                new Triangle(1, 1, 4, 4, 7, 2, "academ.findyurov.shapes.Triangle 3"),
                new Triangle(2, 4, 7, 9, 11, 1, "academ.findyurov.shapes.Triangle 4"),
                new Rectangle(10, 20, "academ.findyurov.shapes.Rectangle 5"),
                new Rectangle(31, 20, "academ.findyurov.shapes.Rectangle 6"),
                new Circle(10, "academ.findyurov.shapes.Circle 7"),
                new Circle(12, "academ.findyurov.shapes.Circle 8"),
                new Circle(19, "academ.findyurov.shapes.Circle 9"),
                new Square(21, "academ.findyurov.shapes.Square last")
        };

        Arrays.sort(shape, ShapesNameComparator);
        System.out.println(Arrays.toString(shape));

        System.out.println();

        ArrayList<Shapes> emp = new ArrayList<>();                                              //переопределение метода toString

        emp.add(new Square(12.5, "First"));
        emp.add(new Triangle(1.5, 1.4, 4.3, 4.0, 7.6, 2.2, "Second"));
        emp.add(new Rectangle(12, 23, "Third"));
        emp.add(new Circle(13.4, "Fourth"));

        for (Shapes i : emp) {
            System.out.println(i);
        }
    }

    public static Comparator<Shapes> ShapesNameComparator = (o1, o2) -> {
        String shapesName1 = o1.name();
        String shapesName2 = o2.name();

        return shapesName1.compareTo(shapesName2);
    };
}
