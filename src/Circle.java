public class Circle extends GeometricShapes {

    double radius;
    double result;

    Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        result=Math.PI*Math.sqrt(radius);
        return result;
    }

    public String toString(){
        return "your Circle has area of "+getArea();
    }
}


