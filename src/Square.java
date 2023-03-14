public class Square extends GeometricShapes{
    String name;
    double side;
    double result;
    Square(String name,int side){
        this.side=side;
        this.name=name;

    }
    public double getArea(){
        result=side*side;
        return result;
    }
    public String toString(){
        return "your "+name+" has area of "+getArea();
    }
}
