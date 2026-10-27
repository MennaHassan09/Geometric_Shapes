
package project;

import java.util.Date;


abstract public class Shape implements Drawable {
    
     private Date dateCreated;
    private String color;

    public Shape(String color) {
        this.color = color;
        dateCreated = new Date();
    }

    public Shape() {
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    abstract public double getArea();

    abstract public double getPerimeter();
    
    @Override
    abstract public String toString();
}
