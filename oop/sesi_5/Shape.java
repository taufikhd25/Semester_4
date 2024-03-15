public abstract class Shape {

    protected Double area;
    protected Double perimeter;
    protected String name;

    public void setname(String name) {
        this.name = name;
    }
    public void getInfo() {
        System.out.println("name: " + name);
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}
