package GLAB3;

public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();

    //Overriding method of base class with different implementation
    public abstract void displayshapName();

    /** Returns a self-descriptive string */
@Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapeName()
    {
        System.out.println("I am a Shape.");
    }
}
