import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру:1-прямоугольный треугольник, 2-квадрат, 3-круг");

        int ShapeType = scanner.nextInt();

        if (ShapeType == 1){
            System.out.println("Введите высоту");
            double h = scanner.nextDouble();
            System.out.println("Введите основание");
            double c = scanner.nextDouble();
            RightTriangle rightTriangle = new RightTriangle(h,c);
            System.out.println(rightTriangle.calculateArea());
        }

        if (ShapeType == 2){
            System.out.println("Введите сторону");
            double a = scanner.nextDouble();
            Box box = new Box(a);
            System.out.println(box.calculateArea());
        }

        if (ShapeType == 3){
            System.out.println("Введите радиус");
            double radius = scanner.nextDouble();
            circle circle = new circle(radius);
            System.out.println(circle.calculateArea());
        }

        //Задача 2

   //     Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        double radius = scanner.nextDouble();
        circle circle = new circle(radius);
        System.out.println("Введите высоту");
        double h = scanner.nextDouble();
        System.out.println("Введите основание");
        double c = scanner.nextDouble();
        RightTriangle rightTriangle = new RightTriangle(h,c);
        rightTriangle.calculateArea();
        System.out.println("Введите сторону");
        double a = scanner.nextDouble();
        Box box = new Box(a);
        box.calculateArea();

        Area[] figure = new Area[3];

        figure[0] = new circle(radius);
        figure[1] = new RightTriangle(h,c);
        figure[2] = new Box(a);

        double count = 0;

        for (int i = 0; i < figure.length; i++) {
            count += figure[i].calculateArea();
            //System.out.println(count);
        }
        System.out.println(count);

        //Задача 3

        Phone phone1 = new Phone("89274023302","Huawei",2.3);
        Phone phone2 = new Phone("89274444302","Xiaomi",2.1);
        Phone phone3 = new Phone("89274023666","Samsung");

        phone1.number = "89274023302";
        phone1.model = "Huawei";
        phone1.weight = 2.3;

        phone2.number = "89274444302";
        phone2.model = "Xiaomi";
        phone2.weight = 2.1;

        phone3.number = "89274023666";
        phone3.model = "Samsung";
        phone3.weight = 3;

        System.out.println(phone1.model);
        System.out.println(phone1.number);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.model);
        System.out.println(phone2.number);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.model);
        System.out.println(phone3.number);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.receiveCall("Илья");
        System.out.println(phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Максим");
        System.out.println(phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Олег");
        System.out.println(phone3.getNumber());
        System.out.println();

        phone3.receiveCall("Иван","134985713948");

        phone1.sendMessage("143123412","12312343");
        phone1.sendMessage("143123412");

        //Задача 4

        Reader reader1 = new Reader("Петров В.В. ");
        System.out.print(reader1.FIO+ "взял ");
        reader1.takeBook(3 );

        System.out.print(reader1.FIO+ "взял книги: ");
        reader1.takeBook();
        System.out.println();

        System.out.print(reader1.FIO+ "вернул ");
        reader1.returnBook(3);

        System.out.print(reader1.FIO+ "вернул книги: ");
        reader1.returnBook();

    }
}