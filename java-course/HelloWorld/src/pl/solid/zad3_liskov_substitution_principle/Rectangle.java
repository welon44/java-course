package pl.solid.zad3_liskov_substitution_principle;

public class Rectangle {

    protected int width;
    protected int height;

    public int getArea() {
        return this.width * this.height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
