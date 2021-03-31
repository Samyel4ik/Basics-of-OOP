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
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 1:
                System.out.println(Arrays.toString(arrayFlowers()));
                System.out.println(Arrays.toString(arrayPackagings()));
                break;
            case 2:
                FlowerComposition flowerComposition = choiceOfBouquet(scanner, packages, flowers);
                System.out.println(flowerComposition);
                break;
            case 3:
                System.out.print("Введите номер цветов: ");
                int x = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите номер упаковки: ");
                int z = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите количестов цветов: ");
                int y = Integer.parseInt(scanner.nextLine());

                System.out.print("Есть ли у вас скидочная карта ?(да или нет) - ");
                String str = scanner.nextLine();

                finalPriceOfTheBouquet(packages, flowers, x, z, y, str);
                break;
        }
        return num;
    }

    public static void finalPriceOfTheBouquet(Packages packages, Flowers flowers, int x, int z, int y, String str) {
        double bouquetPrice = bouquetPrice(packages, flowers, x, z, y);
        double bouquetDiscount = bouquetDiscount(packages, flowers, x, z, y);

        if (str.equalsIgnoreCase("да")) {
            double t = bouquetPrice - bouquetDiscount;
            System.out.println("Цена букета с скидкой составляет: " + t);
        } else {
            System.out.println("Цена букета без скидки составляет: " + bouquetPrice);
        }
    }

    public static double bouquetDiscount(Packages packages, Flowers flowers, int x, int z, int y) {
        return (bouquetPrice(packages, flowers, x, z, y)) * 0.2;
    }

    public static int bouquetPrice(Packages packages, Flowers flowers, int x, int z, int y) {
        Flower flower = flowers.choiceOfFlower(x);
        Packaging packaging = packages.choiceOfPackaging(z);

        return flower.getPrise() * y + packaging.getPricePackaging();
    }

    public static FlowerComposition choiceOfBouquet(Scanner scanner, Packages packages, Flowers flowers) {
        System.out.print("Введите номер цветов: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите номер упаковки: ");
        int z = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите количестов цветов: ");
        int y = Integer.parseInt(scanner.nextLine());

        Flower flower = flowers.choiceOfFlower(x);
        Packaging packaging = packages.choiceOfPackaging(z);

        FlowerComposition flowerComposition = new FlowerComposition();
        flowerComposition.setFlowerComposition(flower, packaging, y);

        return flowerComposition;
    }

    public static Packaging[] arrayPackagings() {
        return new Packaging[]{
                new Packaging(1, "бумага", 10),
                new Packaging(2, "фольга", 15),
                new Packaging(3, "целофан", 5),
                new Packaging(4, "ткань", 25),
                new Packaging(5, "бумага", 10)};
    }

    public static Flower[] arrayFlowers() {
        return new Flower[]{
                new Flower(1, "ромашка", 20),
                new Flower(2, "роза", 30),
                new Flower(3, "ирис", 20),
                new Flower(4, "ландышь", 15),
                new Flower(5, "фиалка", 10)};
    }
}
