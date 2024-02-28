abstract class shape {
    int length, breadth, radius;

    shape(int l, int b) {
        length = l;
        breadth = b;
    }

    shape(int r) {
        radius = r;
    }

    abstract void printArea();
}

class rectangle extends shape {
    rectangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("The area of rectangle is: " + length * breadth);
    }
}

class triangle extends shape {
    triangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("The area of triangle is: " + (length * breadth / 2));
    }
}

class circle extends shape {
    circle(int r) {
        super(r);
    }

    void printArea() {
        System.out.println("The area of circle is: " + (3.14 * radius * radius));
    }
}

public class abstractClass {
    public static void main(String[] args) {
        rectangle rect = new rectangle(4, 4);
        rect.printArea();
        triangle tri = new triangle(4, 4);
        tri.printArea();
        circle circ = new circle(4);
        circ.printArea();

    }
}
