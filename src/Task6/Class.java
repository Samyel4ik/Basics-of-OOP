package Task6;

import java.util.Arrays;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SeveralPackages severalPackages = new SeveralPackages();
        severalPackages.setSeveralPackages(arrayPackaging());

        SomeSweets someSweets = new SomeSweets();
        someSweets.setSomeSweets(arraySweetness());

        int exit = 0;
        while (exit != 4) {
            menu();

        }
    }

    public static void menu() {
        System.out.println("\"Выберете пункт меню:"
                + "\n" +
                "1. Покаать предложение."
                + "\n" +
                "2. Собрать подарок."
                + "\n" +
                "3. Подсчитать стоимость подарка."
                + "\n" +
                "4. Выход.");
        System.out.print("Ваш выбор - ");
    }

    public int processUserInput(Scanner scanner, SeveralPackages severalPackages, SomeSweets someSweets) {
        int selectedOption = Integer.parseInt(scanner.nextLine());
        switch (selectedOption) {
            case 1:
                System.out.println("Упаковка: ");
                System.out.println(severalPackages);
                System.out.println("Сладости: ");
                System.out.println(someSweets);
            case 2:
                System.out.println("Сделайте выбор упаковки из данных: " + Arrays.toString(severalPackages.arrayOfPackages()));
                String str = scanner.nextLine();
                System.out.println("Сделайте выбор сладости из данных: " + Arrays.toString(someSweets.arrayOfSweets()));
                String str1 = scanner.nextLine();
                System.out.print("Какое количестов сладостей  - ");
                int x = Integer.parseInt(scanner.nextLine());

                Gift gift = giftSelection(severalPackages, someSweets, x, str, str1);
                System.out.println(gift);
            case 3:
                System.out.print("Есть ли у вас скидочная карта(да или нет)? ");
                String discountCard = scanner.nextLine();


        }
        return selectedOption;
    }

    public void finalGiftPrice(String discountCard, SeveralPackages severalPackages, SomeSweets someSweets, int x, String str, String str1) {
        double giftDiscount = giftDiscount(severalPackages, someSweets, x, str, str1);
        double giftPrice = giftPrice(severalPackages, someSweets, x, str, str1);

        if (discountCard.equalsIgnoreCase("да")) {
            double finalGiftPrice = giftPrice - giftDiscount;
            System.out.println("Цена подарка со скидкой: " + finalGiftPrice);
        } else {
            System.out.println("Цена подарка без скидки: " + giftPrice);
        }
    }

    public static double giftDiscount(SeveralPackages severalPackages, SomeSweets someSweets, int x, String str, String str1) {
        return (giftPrice(severalPackages, someSweets, x, str, str1)) * 0.2;
    }

    public static double giftPrice(SeveralPackages severalPackages, SomeSweets someSweets, int x, String str, String str1) {
        Packaging packaging = severalPackages.selectedPackaging(str);
        Sweetness sweetness = someSweets.chosenSweetness(str1);

        return packaging.getPricePackaging() + sweetness.getSweetPrice() * x;
    }

    public static Gift giftSelection(SeveralPackages severalPackages, SomeSweets someSweets, int x, String str, String str1) {
        Packaging packaging = severalPackages.selectedPackaging(str);
        Sweetness sweetness = someSweets.chosenSweetness(str1);
        Gift gift = new Gift();
        gift.setGift(sweetness, packaging, x);
        return gift;
    }

    public static Packaging[] arrayPackaging() {
        return new Packaging[]{
                new Packaging("бумага", 10),
                new Packaging("фольга", 15),
                new Packaging("целофан", 5),
                new Packaging("ткань", 25),
                new Packaging("бумага", 10)};
    }

    public static Sweetness[] arraySweetness() {
        return new Sweetness[]{
                new Sweetness("леденцы", 50),
                new Sweetness("карамель", 100),
                new Sweetness("печенье", 25)};
    }
}
