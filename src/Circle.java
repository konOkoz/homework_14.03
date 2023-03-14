public class Circle extends GeometricShapes{


    double radius;
    double result;

    Circle(double radis){
        this.radius=radis;
    }

    public double getArea(){
        result=Math.PI*Math.sqrt(radius);
        return result;
    }

    public String toString(){
        return "your Circle has area of "+getArea();
    }
}
