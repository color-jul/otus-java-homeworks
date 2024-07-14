package zigitbaeva.otus.homeworks.homework1;
import java.util.Scanner; // подключить сканер

public class MainApp {

    // (1)
    // Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
    // Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava\n");
    }

    // (2)
    // Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    // Метод должен посчитать их сумму, и если она больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”;
    public static void checkSign(int a, int b, int c) {
        if ( (a + b + c) >= 0 ) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    // (3)
    // Реализуйте метод selectColor() в теле которого задайте int переменную data
    // с любым начальным значением. Если data меньше 10 включительно,
    // то в консоль должно быть выведено сообщение “Красный”,
    // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor() {
        int data = (int)(Math.random() * 100);
        //System.out.println(data);
        if ( data <= 10 ) {
            System.out.println("Красный");
        }
        else if ( data <= 20 ) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    // (4)
    // Реализуйте метод compareNumbers(), в теле которого объявите две int переменные
    // a и b с любыми начальными значениями.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    // в противном случае “a < b”;
    public static void compareNumbers() {
        int a = (int)(Math.random() * 100);
        //System.out.println(a);
        int b = (int)(Math.random() * 100);
        //System.out.println(b);
        if ( a >= b ) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    // (5)
    // Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    // в противном случае - вычесть;
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if ( increment ) {
            System.out.println( initValue + delta );
        }
        else {
            System.out.println( initValue - delta );
        }
    }

    // Случайное значение типа boolean для (5) метода
    public static boolean randomBoolean() {
        return Math.random() < 0.5;
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner (System.in);
        System.out.println("Введите число от 1 до 5");
        int number = inputNumber.nextInt();
        //System.out.println(number);

        switch (number) {
            case  (1):
                greetings();
                break;
            case (2):
                int a = (int)(Math.random() * 100);
                int b = (int)(Math.random() * 100);
                int c = (int)(Math.random() * 100);
                checkSign(a, b, c) ;
                break;
            case (3):
                selectColor();
                break;
            case (4):
                compareNumbers();
                break;
            case (5):
                int initValue = (int)(Math.random() * 100);
                int delta = (int)(Math.random() * 100);
                boolean increment = randomBoolean();
                addOrSubtractAndPrint(initValue, delta, increment);
                break;
            default:
                System.out.println("Неверный номер метода");
                break;
        }
    }

}