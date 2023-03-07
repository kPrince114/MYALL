package day10;

import java.util.ArrayList;
import java.util.List;

public class _5UpperBounds {

    public static void main(String[] args) {
        List<Rectangle> rectangleList=new ArrayList<>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList=new ArrayList<>();
        circleList.add(new Circle());

        drawShape(circleList);
        drawShape(rectangleList);

        // List<Plant> plantList= new ArrayList<>();
       // drawShape(plantList);**** isme extend class ko nahi kiya gaya h.. isi liye hum nahi kar sakte h..

    }
    static void drawShape(List<? extends Shape> lists){
        for(Shape s : lists)
            System.out.println(s);
    }
}

abstract class Shape{
    abstract  void draw();
}
class Circle extends Shape{
    @Override
    public String toString() {
        return this.getClass().toString();
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("draw Rectangle");
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
