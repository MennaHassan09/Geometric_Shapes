
package project;


public abstract class ThreeDShape extends Shape {

    ThreeDShape() {
    }

    ThreeDShape(String color) {
        super(color);
    }

    public abstract double getVolume();

}
