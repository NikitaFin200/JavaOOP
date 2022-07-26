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

    public void print() {
        System.out.println("[" + this.from + "," + this.to + "]");
    }

    public static Range getInterval(Range range1, Range range2) {
        if ((range1.to <= range2.from) || (range2.to <= range1.from)) {
            return null;
        } else {
                double from = Math.max(range1.from, range2.from);
                double to = Math.min(range1.to, range2.to);
                return new Range(from, to);
            }
    }

    public static Range[] getUnion(Range range1, Range range2) {
        if ((range1.to < range2.from) || (range2.to < range1.from)) {
            return new Range[]{new Range(range1.from, range1.to), new Range(range2.from, range2.to)};
        } else {
            double from = Math.min(range1.from, range2.from);
            double to = Math.max(range1.to, range2.to);
            return new Range[]{new Range(from, to)};
        }
    }

    public static Range[] getDifference(Range range1, Range range2) {
        if ((range1.to <= range2.from) || (range2.to <= range1.from)) {
            return new Range[]{new Range(range1.from, range1.to)};
        } else if (range1.from >= range2.from && range1.to <= range2.to){
            return new Range[0];
        } else if (range2.from > range1.from && range2.to < range1.to) {
            return new Range[]{new Range(range1.from, range2.from), new Range(range2.to, range1.to)};
        } else if (range2.from > range1.from) {
            return new Range[]{new Range(range1.from, range2.from)};
        } else {
            return new Range[]{new Range(range2.to, range1.to)};
        }
    }
}