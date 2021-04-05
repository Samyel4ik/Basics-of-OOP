package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Sweetness> arrayListSweetness = arrayListSweetness();
        ArrayList<Packaging> arrayListPackaging = arrayListPackaging();

        Supermarket supermarket = new Supermarket();
        supermarket.setSupermarket(arrayListSweetness, arrayListPackaging);


        int exit = 0;
        while (exit != 3) {

            menu();
            exit = processUserInput(scanner, supermarket, arrayListSweetness, arrayListPackaging);
        }
    }

    public static void menu() {
        System.out.println("\"Выберете пункт меню:"
                + "\n" +
                "1. Покаать предложение по Конфетам и Упаковкам."
                + "\n" +
                "2. Выбрать подарок."
                + "\n" +
                "3. Выход.");
        System.out.print("Ваш выбор - ");
    }

    public static int processUserInput(Scanner scanner, Supermarket supermarket, ArrayList<Sweetness> arrayListSweetness, ArrayList<Packaging> arrayListPackaging) {

        int selectedOption = Integer.parseInt(scanner.nextLine());

        switch (selectedOption) {

            case 1:

                System.out.println(supermarket);
                break;
            case 2:
                System.out.println("Сделайте выбор упаковки из данных: " + Arrays.toString(supermarket.getPackagingList()));
                String str = scanner.nextLine();
                System.out.println("Сделайте выбор сладости из данных: " + Arrays.toString(supermarket.getSweetnessList()));
                String str1 = scanner.nextLine();

                Packaging packaging = choiceOfPackaging(str, arrayListPackaging);
                Sweetness sweetness = selectionOfSweets(str1, arrayListSweetness);

                ArrayList<Sweetness> arrayListGift = new ArrayList<>();
                arrayListGift.add(sweetness);

                Gift gift = new Gift(arrayListGift, packaging);

                int ccc = 0;
                while (ccc != 4) {
                    menu1();
                    ccc = input(scanner, gift, supermarket, arrayListSweetness());
                }

                break;

        }
        return selectedOption;
    }


    public static void menu1() {
        System.out.println(
                "1. Добавить сладость."
                        + "\n" +
                        "2.Посчитать стоимость подарка."
                        + "\n" +
                        "3.Посчитать калорийность подарка подарка."
                        + "\n" +
                        "4. Выход.");
        System.out.print("Ваш выбор - ");
    }


    public static int input(Scanner scanner, Gift gift, Supermarket supermarket, ArrayList<Sweetness> arrayListSweetness) {
        int t = Integer.parseInt(scanner.nextLine());

        switch (t) {
            case 1:
                System.out.println("Сделайте выбор сладости из данных: " + Arrays.toString(supermarket.getSweetnessList()));
                String str = scanner.nextLine();
                gift.addSweetnees(selectionOfSweets(str, arrayListSweetness));
                System.out.println(gift);
                break;

            case 2:
                int fullValueOfTheGift = gift.fullValueOfTheGift();
                System.out.println("стоимость подарка " + fullValueOfTheGift);
                break;
            case 3:
                int giftCalories = gift.giftCalories();
                System.out.println(giftCalories);
                break;
        }
        return t;
    }


    public static Packaging choiceOfPackaging(String str1, ArrayList<Packaging> arrayListPackaging) {
        Packaging packaging = null;

        for (int i = 0; i < arrayListPackaging.size(); i++) {
            if (str1.equalsIgnoreCase(arrayListPackaging.get(i).getNamePackaging())) {
                packaging = arrayListPackaging.get(i);
            }
        }
        return packaging;
    }

    public static Sweetness selectionOfSweets(String str, ArrayList<Sweetness> arrayListSweetness) {
        Sweetness sweetness = null;

        for (int i = 0; i < arrayListSweetness.size(); i++) {
            if (str.equalsIgnoreCase(arrayListSweetness.get(i).getName())) {
                sweetness = arrayListSweetness.get(i);
            }
        }
        return sweetness;
    }

    public static ArrayList<Packaging> arrayListPackaging() {
        ArrayList<Packaging> arrayListPackaging = new ArrayList<>();

        arrayListPackaging.add(new Packaging("бумага", 10));
        arrayListPackaging.add(new Packaging("фольга", 15));
        arrayListPackaging.add(new Packaging("целофан", 5));
        arrayListPackaging.add(new Packaging("ткань", 25));
        arrayListPackaging.add(new Packaging("бумага", 10));
        return arrayListPackaging;


    }

    public static ArrayList<Sweetness> arrayListSweetness() {
        ArrayList<Sweetness> list = new ArrayList();

        Sweetness sweetness1 = new Sweetness("леденцы", 50, 15);
        list.add(sweetness1);
        list.add(new Sweetness("карамель", 100, 14));
        list.add(new Sweetness("печенье", 25, 10));

        return list;
    }
}
