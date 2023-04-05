package itschoolS14;

public class Polygon {
    public void render() {
        System.out.println("Rendering polygon.");
    }

    public static void main(String[] args) {
        Polygon polygon;
        polygon = new Square();
        polygon.render();

        polygon = new Circle();
        polygon.render();
    }
}
class Square extends Polygon{
    public void render() {
        System.out.println("Rendering square.");
    }
}
class Circle extends Polygon {
    public void render() {
        System.out.println("Rendering circle.");
    }
}
