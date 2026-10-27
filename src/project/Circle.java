
package project;


public class Circle extends Shape {
     private double reduis;

    public Circle(double reduis) {
        this.reduis = reduis;
    }

    public Circle(String color, double reduis) {
        super(color);
        this.reduis = reduis;
    }

    public double getReduis() {
        return reduis;
    }

    public void setReduis(double reduis) {
        if (reduis > 0) {
            this.reduis = reduis;
        }
    }

    @Override
    public String toString() {
        return "Circle (" + "reduis: " + reduis + ")";
    }

    @Override
    public double getArea() {
        return Math.PI * reduis * reduis;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * reduis;
    }

    @Override
    public String howToDraw() {
        return "Draw circle with reduis : " + reduis;
    }

}
