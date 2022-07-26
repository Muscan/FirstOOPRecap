public class Square extends Polygon {
    private int area;
    public Square(int size, String name, int area){
        super(size, name);
        this.area = area;
    }

    @Override
    public void render(){
        System.out.println("Square render");
    }
}
