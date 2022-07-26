public class Polygon {

    private int size;
    private String name;

    public Polygon(int size, String name){
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void render(){
        System.out.println("Polygon render");
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
