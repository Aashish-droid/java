package CreationPattern;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

class ShapeDrawing {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}

public class MyProgram {
    public static void main(String[] args) {
        ShapeDrawing shapeDrawing = new ShapeDrawing();

        Shape shape1 = shapeDrawing.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeDrawing.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeDrawing.getShape("TRIANGLE");
        shape3.draw();
    }
}
