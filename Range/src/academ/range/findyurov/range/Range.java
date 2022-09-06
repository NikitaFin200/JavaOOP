package academ.range.findyurov.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {   // конструктор для заполнения полей
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public double[] getInterval(double from1, double to1, double from2, double to2) {
        double[] intervalPoints = new double[2];

        if (from2 >= from1 && from2 <= to1) {
            intervalPoints[0] = from2;
        } else if (from2 < from1 && (to1 >= from1 || to1 <= to2)) {
            intervalPoints[0] = from1;
        } else {
            return null;
        }

        if (to2 >= from1 && to2 <= to1) {
            intervalPoints[1] = to2;
        } else {
            intervalPoints[1] = to1;
        }

        return intervalPoints;
    }

    public double[] getUnification(double from1, double to1, double from2, double to2) {
        double[] intervalPoints = new double[2];

        if (from2 < from1 && to2 == to1) {
            intervalPoints[0] = from1;
            intervalPoints[1] = to2;
        } else if (from2 == from1 && to2 > to1) {
            intervalPoints[0] = from2;
            intervalPoints[1] = to1;
        } else if (from2 > from1 && (to2 > to1 && from2 < to1)) {
            intervalPoints[0] = from2;
            intervalPoints[1] = to1;
        } else if (from2 > from1 && to2 < to1) {
            intervalPoints[0] = from2;
            intervalPoints[1] = to2;
        } else {
            return null;
        }

        return intervalPoints;
    }

    public double[] getDifference(double from1, double to1, double from2, double to2) {
        double[] intervalPoints = new double[2];

        if ((to2 - from2) > (to1 - from1)) {
            return intervalPoints = new double[0];
        }

        intervalPoints[0] = from1;
        intervalPoints[1] = to1 - (to2 - from2);

        return intervalPoints;
    }
}
