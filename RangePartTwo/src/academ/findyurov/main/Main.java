package academ.findyurov.main;
import academ.findyurov.range.Range;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Range range = new Range(15, 30);
        Range range2 = new Range(16, 28);

        System.out.println("The length of the range from the initial number to the extreme.");
        System.out.print(range.getLength());           // метод для вычисления длины диапазона

        System.out.println();

        System.out.println("Enter number between first number to last number:");
        double number = scanner.nextDouble();

        System.out.println(range.isInside(number));    // применение метода isInside

        System.out.println(Arrays.toString(range.getInterval(range.getFrom(), range.getTo(), range2.getFrom(), range2.getTo())));
        System.out.println(Arrays.toString(range.getUnification(range.getFrom(), range.getTo(), range2.getFrom(), range2.getTo())));
        System.out.println(Arrays.toString(range.getDifference(range.getFrom(), range.getTo(), range2.getFrom(), range2.getTo())));
    }
}
