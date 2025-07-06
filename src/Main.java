import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            int x = 14, y = 16;
            System.out.printf("Сумма чисел, находящихся между %s и %s: %s", x, y, sumRange(x, y));
            System.out.println();
        }

        {
            int[] intArray = {1, 200, 3, 4, 5};
            try {
                System.out.printf("Массив %s имеет максимальное значение: %s", Arrays.toString(intArray), findMax(intArray));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println();
            }
        }

        {
            int x = 742, y = 56;
            System.out.printf("Сумма двух чисел %s и %s: %s", x, y, add(x, y));
            System.out.println();
        }

        {
            String x = "Первая строка", y = "Вторая строка";
            System.out.printf("Сумма двух строк \"%s\" и \"%s\": \"%s\"", x, y, add(x, y));
            System.out.println();
        }

        {
            int x = 10;
            try {
                System.out.printf("Факториал от %s: %s", x, factorial(x));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println();
            }
        }

        {
            double radius = 2.0;

            try {
                System.out.printf("Площадь круга с радиусом %s: %s", radius, calculateArea(radius));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println();
            }
        }

        {
            double length = 2.0, width = 3.0;

            try {
                System.out.printf("Площадь прямоугольника с длиной %s и шириной %s: %s", length, width, calculateArea(length, width));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println();
            }
        }

        {
            double x1 = 2.0, x2 = 7.0, x3 = 21.0;
            System.out.printf("Среднее арифметическое чисел %s, %s и %s: %s", x1, x2, x3, average(x1, x2, x3));
            System.out.println();
        }

        {
            double leg1 = 3.0, leg2 = 4.0;

            try {
                System.out.printf("Гипотенуза прямоугольника с катетами %s и %s: %s", leg1, leg2, hypotenuse(leg1, leg2));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    // 1. Метод sumRange принимает два числа (начало и конец диапазона)
    //    и возвращает сумму всех чисел между ними (включительно).
    public static int sumRange(int x, int y) {
        return (x + y) * (Math.abs(x - y) + 1) / 2;
    }

    // 2. Два перегруженных метода add:
    //    Первый складывает два целых числа
    public static int add(int x, int y) {
        return x + y;
    }

    //    Второй складывает две строки
    public static String add(String x, String y) {
        return x + y;
    }

    // 3. Функция findMax принимает массив целых чисел и возвращает его максимальный элемент
    public static int findMax(int[] intArray) throws Exception {
        if(0 == intArray.length) {
            throw new Exception("У пустого массива нет максимального значения");
        }

        int retVal = Integer.MIN_VALUE;

        for (int i : intArray) {
            if (i > retVal) {
                retVal = i;
            }
        }
        return retVal;
    }

    // 4. Функция, вычисляющая факториал числа с помощью цикла for
    public static int factorial(int x) throws Exception {
        if(0 > x) {
            throw new Exception("Факториал отрицательного числа не существует");
        }

        int retVal = 1;

        for(int i = 1; i <= x; i++) {
            retVal *= i;
        }
        return retVal;
    }

    // 5. Перегруженные функции calculateArea
    // Для круга (принимает радиус)
    public static double calculateArea(double radius) throws Exception {
        if(0 > radius) {
            throw new Exception("Радиус круга не может быть отрицательным");
        }

        return Math.PI * radius * radius;
    }

    // Для прямоугольника (принимает длину и ширину)
    public static double calculateArea(double length, double width) throws Exception {
        if(0 > length) {
            throw new Exception("Длина прямоугольника не может быть отрицательной");
        }

        if(0 > width) {
            throw new Exception("Ширина прямоугольника не может быть отрицательной");
        }

        return length * width;
    }

    // 6. Функция, которая принимает три числа и возвращает их среднее арифметическое
    public static double average(double x1, double x2, double x3) {
        return (x1 + x2 + x3) / 3;
    }

    // 7. Функция, которая принимает два числа, представляющие длины катетов,
    //    и возвращает длину гипотенузы (используется теорема Пифагора)
    public static double hypotenuse(double leg1, double leg2) throws Exception {
        if((0 > leg1) || (0 > leg2)) {
            throw new Exception("Длина катета прямоугольника не может быть отрицательной");
        }

        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }
}