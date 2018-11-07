                                      "Circle.java"
import java.math .*;
    public class Circle extends Shape {
        protected double radius;

        public Circle() {
            this.filled = false;
            this.color = "Yellow";
            this.radius = 1;
        }

        @Override
        public double getArea() {
            return 0;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public String toString() {
            return null;
        }

        public Circle(double radius) {
            this.filled = false;
            this.color = "Blue";
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            this.radius = radius;
            this.color = color;
            this.filled = filled;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius() {
            this.radius = radius;
        }
    }
                
                                                "Rectangle.java"
 public class Rectangle extends Shape {
     protected double width;
     protected double length;

     Rectangle() {
         this.filled = false;
         this.color = "Black";
         width = 100;
         length = 50;
     }

     Rectangle(double width, double length) {
         this.filled = false;
         this.color = "BLUE";
         this.width = width;
         this.length = length;
     }

     Rectangle(double width, double length, String color, boolean filled) {
         this.filled = filled;
         this.color = color;
         this.width = width;
         this.length = length;
         this.filled = filled;
     }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getLength() {
         return length;
     }

     public void setLength(double length) {
         this.length = length;
     }

     @Override
     public double getArea() {
         return width * length;
     }

     @Override
     public double getPerimeter() {
         return 2 * (width * length);
     }

     @Override
     public String toString() {
         return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
     }
 }

                                                    "Shape.java"
 public abstract class Shape {
     protected String color;
     protected boolean filled;

     Shape() {
         this.filled = false;
         this.color = "RED";
     }

     Shape(String color, boolean filled) {
         this.filled = filled;
         this.color = color;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public boolean isFilled() {
         return filled;
     }

     public void setFilled(boolean filled) {
         this.filled = filled;
     }

     public abstract double getArea();

     public abstract double getPerimeter();

     public abstract String toString();
 }

                                                     "Square.java"
 public class Square extends Rectangle {
     protected double side;

     Square() {
         this.filled = false;
         this.color = "BLUE";
         this.width = 100;
         this.length = 50;
         side = 100;
     }

     Square(double size) {
         this.filled = false;
         this.color = "BLUE";
         this.width = 100;
         this.length = 50;
         this.side = size;
     }

     Square(double size, String color, boolean filled) {
         this.filled = false;
         this.color = color;
         this.width = 100;
         this.length = 50;
         this.side = size;
         this.filled = filled;
     }

     public double getSide() {
         return side;
     }

     public void setSide(double side) {
         this.side = side;
     }

     @Override
     public double getWidth() {
         return width;
     }

     @Override
     public void setWidth(double width) {
         this.width = width;
     }

     @Override
     public double getArea() {
         return width * length;
     }

     @Override
     public double getPerimeter() {
         return 2 * (width * length);
     }

     @Override
     public String toString() {
         return "Shape: square, width: " + this.width + ", length: " + this.length + ", side: " + this.side + ", color: " + this.color;
     }
 }
 
                                                        "Main.java"
import java.awt.*;
        public class Main
        {
            public static void main(String[] args)
            {
                Shape s1 = new Circle(5.5, "RED", false);
                System.out.println(s1);
                System.out.println(s1.getArea());
                System.out.println(s1.getPerimeter());
                System.out.println(s1.getColor());
                System.out.println(s1.isFilled());
                //System.out.println(s1.getRadius()); //Строка 11, у фигуры нет метода получить радиус

                Circle c1 = (Circle)s1;
                System.out.println(c1);
                System.out.println(c1.getArea());
                System.out.println(c1.getPerimeter());
                System.out.println(c1.getColor());
                System.out.println(c1.isFilled());
                System.out.println(c1.getRadius());

                //Shape s2 = new Shape(); //Класс Shape является абстрактным? нельзя объявить
                Shape s3 = new Rectangle(1.0,2.0, "RED", false);
                System.out.println(s3);
                System.out.println(s3.getArea());
                System.out.println(s3.getPerimeter());
                System.out.println(s3.getColor());
                //System.out.println(s3.getLenght()); // В классе Shape нет метода getLenght

                Rectangle r1 = (Rectangle)s3;
                System.out.println(r1);
                System.out.println(r1.getArea());
                System.out.println(r1.getColor());
                System.out.println(r1.getLength());

                Shape s4 = new Square(6.6);
                System.out.println(s4);
                System.out.println(s4.getArea());
                System.out.println(s4.getColor());
                //System.out.println(s4.getSide()); // В классе Shape нет метода getSide

                Rectangle r2 = (Rectangle)s4;
                System.out.println(r2);
                System.out.println(r2.getArea());
                System.out.println(r2.getColor());
                //System.out.println(r2.getSide()); // В классе Rectangle нет метода getSide

                Square sq1 = (Square)r2;
                System.out.println(sq1);
                System.out.println(sq1.getArea());
                System.out.println(sq1.getColor());
                System.out.println(sq1.getSide());
                System.out.println(sq1.getLength());
            }
        }
