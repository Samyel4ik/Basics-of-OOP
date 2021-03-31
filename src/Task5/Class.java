package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Class {
    //Цветочная композиция. Реализовать приложение,
    // позволяющее создавать цветочные композиции (объект, представляющий собой цветочную композицию).
    // Составляющими цветочной композиции являются цветы и упаковка.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Packages packages = new Packages();
        packages.setPackages(arrayPackagings());

        Flowers flowers = new Flowers();
        flowers.setFlowers(arrayFlowers());

        int xxx = 0;
        while (xxx != 4) {
            menu();
            xxx = input(scanner, packages, flowers);
        }
    }

    public static void menu() {
        System.out.println("\"Выберете пункт меню:"
                + "\n" +
                "1. Покаать предложение."
                + "\n" +
                "2. Собрать букет."
                + "\n" +
                "3. Подсчитать стоимость букета."
                + "\n" +
                "4. Выход.");
        System.out.print("Ваш выбор - ");
    }

    public static int input(Scanner scanner, Packages packages, Flowers flowers) {
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println(Arrays.toString(arrayFlowers()));
                System.out.println(Arrays.toString(arrayPackagings()));
                break;
            case 2:
                System.out.print("Введите номер цветов: ");
                int x = scanner.nextInt();
                System.out.print("Введите номер упаковки: ");
                int z = scanner.nextInt();
                FlowerComposition flowerComposition = choiceOfBouquet(packages, flowers, x, z);
                System.out.println(flowerComposition);
                break;
            case 3:
                System.out.print("Введите номер цветов: ");
                int a = scanner.nextInt();
                System.out.print("Введите номер упаковки: ");
                int b = scanner.nextInt();

                int c = bouquetPrice(packages, flowers, a, b);
                System.out.println("Стоимость букета: " + c);
                break;
        }

        return num;
    }

    public static int bouquetPrice(Packages packages, Flowers flowers, int a, int b) {
        Flower flower = flowers.choiceOfFlower(a);
        Packaging packaging = packages.choiceOfPackaging(b);

        return flower.getPrise() + packaging.getPricePackaging();
    }

    public static FlowerComposition choiceOfBouquet(Packages packages, Flowers flowers, int x, int z) {
        FlowerComposition flowerComposition = new FlowerComposition();
        Flower flower = flowers.choiceOfFlower(x);
        Packaging packaging = packages.choiceOfPackaging(z);


        return flowerComposition;
    }

    public static Packaging[] arrayPackagings() {
        return new Packaging[]{
                new Packaging(1, "бумага",  10),
                new Packaging(2, "фольга",  15),
                new Packaging(3, "целофан",  5),
                new Packaging(4, "ткань", 25),
                new Packaging(5, "бумага", 10)};
    }

    public static Flower[] arrayFlowers() {
        return new Flower[]{
                new Flower(1, "ромашка",  20),
                new Flower(2, "роза",  30),
                new Flower(3, "ирис",  20),
                new Flower(4, "ландышь",  15),
                new Flower(5, "фиалка",  10)};
    }
}
