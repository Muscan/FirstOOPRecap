public class Main {

    public static void main(String[] args) {
	// write your code here
        Polygon polygon = new Polygon(13, "FirstPoligon");
        polygon.render();
        Square square = new Square(10,"FirstSquare",100);
        square.render();
        Circle circle = new Circle(12, "FirstCircle", 32);
        circle.render();
    }
}
