import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        /*         14.03
Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга:
Создать классы Circle, Rectangle, Square.
В классах должен быть метод getArea, осуществляющий подсчет соответствующей площади
В методе main класса Main создать массив или лист содержащий обьекты этих классов и вывести на экран площади фигур,
содержащиеся в этом массиве а также название фигуры.
Подумать, должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах

Пример вывода на печать:
Circle has area of 200  = 3.14*радиус в квадрате
Rectangle has area of 50.0 длинна*ширину
Square has area of 30.0 сторона*сторону
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
         21.03
В задаче из урока 40 вывести на печать массив ,отсортированный по возрастанию площади фигур.

Задача была такая:

Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга: Создать классы Circle, Rectangle, Square.
В классах должен быть метод getArea, осуществляющий подсчет соответствующей площади В методе main класса Main создать массив или лист
содержащий обьекты этих классов и вывести на экран площади фигур, содержащиеся в этом массиве а также название фигуры. Подумать,
должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах
 */

        Square kvadrat = new Square("kvadrat",4);
        List<String> list = List.of(kvadrat.toString(),new Circle(3).toString(),new Rectangle(2,6).toString());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        GeometricShapes square = new Square("Square",3);
        GeometricShapes circle = new Circle(8);
        GeometricShapes rectangle = new Rectangle(8,9);
        List<GeometricShapes> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);
        System.out.println(shapes);
        Collections.sort(shapes);
        System.out.println(shapes);
/*
OUT
[your Square has area of 9.0, your Circle has area of 8.885765876316732, your Rectangle has area of 72.0]
[your Circle has area of 8.885765876316732, your Square has area of 9.0, your Rectangle has area of 72.0]
 */
    }
}