import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Month month = Month.АПРЕЛЬ;
//        System.out.println("Введите число от 1 до 12");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        switch (a){
//            case 1:
//                System.out.println(Month.ЯНВАРЬ);
//                break;
//            case 2:
//                System.out.println(Month.ФЕВРАЛЬ);
//                break;
//            case 3:
//                System.out.println(Month.МАРТ);
//                break;
//            case 4:
//                System.out.println(Month.АПРЕЛЬ);
//                break;
//            case 5:
//                System.out.println(Month.МАЙ);
//                break;
//            case 6:
//                System.out.println(Month.ИЮНЬ);
//                break;
//            case 7:
//                System.out.println(Month.ИЮЛЬ);
//                break;
//            case 8:
//                System.out.println(Month.АВГУСТ);
//                break;
//            case 9:
//                System.out.println(Month.СЕНТЯБРЬ);
//                break;
//            case 10:
//                System.out.println(Month.ОКТЯБРЬ);
//                break;
//            case 11:
//                System.out.println(Month.НОЯБРЬ);
//                break;
//            case 12:
//                System.out.println(Month.ДЕКАБРЬ);
//
//        }
        System.out.println("Введите круглую максимальную сумму которую можете потратить(от миллиона до 10 миллионов)");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();



        switch (a){
            case (1000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                break;
            case (2000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                break;
            case (3000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                break;
            case (4000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                break;
            case (5000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                System.out.println("НИСАН "+Marka.ПАТРОЛ+", "+Color.КРАСНЫЙ+", "+Model.НИСАН);
                break;
            case (6000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                System.out.println("НИСАН "+Marka.ПАТРОЛ+", "+Color.КРАСНЫЙ+", "+Model.НИСАН);
                break;
            case (7000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                System.out.println("НИСАН "+Marka.ПАТРОЛ+", "+Color.КРАСНЫЙ+", "+Model.НИСАН);
                System.out.println("ЯГУАР "+Marka.XJ+", "+Color.БЕЛЫЙ+", "+Model.ЯГУАР);
                break;
            case (8000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                System.out.println("НИСАН "+Marka.ПАТРОЛ+", "+Color.КРАСНЫЙ+", "+Model.НИСАН);
                System.out.println("ЯГУАР "+Marka.XJ+", "+Color.БЕЛЫЙ+", "+Model.ЯГУАР);
                break;
            case (9000000):
                System.out.println("ФОРД "+Marka.ФОКУС+", "+Color.ЧЁРНЫЙ+", "+Model.ФОРД);
                System.out.println("ХОНДА "+Marka.АККОРД+", "+Color.СИНИЙ+", "+Model.ХОНДА);
                System.out.println("НИСАН "+Marka.ПАТРОЛ+", "+Color.КРАСНЫЙ+", "+Model.НИСАН);
                System.out.println("ЯГУАР "+Marka.XJ+", "+Color.БЕЛЫЙ+", "+Model.ЯГУАР);
                System.out.println("АУДИ "+Marka.A8+", "+Color.ЗЕЛЁНЫЙ+", "+Model.АУДИ);
            default:
                System.out.println("Вы нищеброд");


        }














    }
}

