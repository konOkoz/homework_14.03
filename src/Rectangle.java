
public class Rectangle extends GeometricShapes {
    double length;
    double width;
    double result;


    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        result=length*width;
        return result;
    }
    public String toString(){
        return "your Rectangle has area of "+getArea();
    }
}
