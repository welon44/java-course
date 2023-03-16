package pl.solid.zad2_open_close_principle;

public class Drawer {

    public void drawShape(Shape shape) {
        shape.draw();
    }

//    public void drawShape(Shape shape) {
        //        if (shape.getType() == 1) {
//            drawRectangle((Rectangle) shape);
//        } else if (shape.getType() == 2) {
//            drawCircle((Circle) shape);
//        }
//    }

//    public void drawCircle(Circle circle) {
//
//    }
//
//    public void drawRectangle(Rectangle rectangle) {
//
//    }
}
