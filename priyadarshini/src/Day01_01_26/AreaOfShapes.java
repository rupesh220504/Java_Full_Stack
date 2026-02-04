package Day01_01_26;

abstract class Shape {
	double area;
	abstract double findArea();
    abstract double dispArea();  
}

class Circle extends Shape {
    double r;
    static final double PI = 3.14;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return PI * r * r;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    } 
    double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double area() {
        return length * breadth;
    }
}

class Parallelogram extends Shape {
    double base, height;

    Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area() {
        return base * height;
    }
}

class Rhombus extends Shape {
    double d1, d2;

    Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    double area() {
        return 0.5 * d1 * d2;
    }
}

class Ellipse extends Shape {
    double a, b;
    static final double PI = 3.14;

    Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double area() {
        return PI * a * b;
    }
}


public class AreaOfShapes {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new Triangle(10, 5),
            new Square(4),
            new Rectangle(6, 3),
            new Parallelogram(8, 4),
            new Rhombus(6, 8),
            new Ellipse(5, 3)
        };

        for (Shape s : shapes) {
            System.out.println("Area = " + s.area());
        }
    }
}
