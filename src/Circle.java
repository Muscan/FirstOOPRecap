public class Circle extends Polygon{
    private int radius;
    public Circle(int size, String name, int radius){
        super(size, name);
        this.radius = radius;
    }

    @Override
    public void render(){
        System.out.println("Circle Render");
    }
}
