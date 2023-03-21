public class GeometricShapes implements Comparable<GeometricShapes> {


     public double getArea(){
          System.out.println("Не задана фигура");
          return -1;
     }
     public String toString(){
          return "Не задана фигура";
     }
public int compareTo(GeometricShapes o){
      return Double.compare(getArea(),o.getArea());
}

}

