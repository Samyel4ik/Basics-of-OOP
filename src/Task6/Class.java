package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SeveralPackages severalPackages = new SeveralPackages();
        severalPackages.setSeveralPackages(arrayPackaging());

        List<Sweetness> List = arraySweetness();

        int exit = 0;
        while (exit != 5) {
            menu();
            exit = processUserInput(scanner, severalPackages, List);
        }
    }

    public static void menu() {
        System.out.println("\"Выберете пункт меню:"
                + "\n" +
                "1. Покаать предложение."
                + "\n" +
                "2. Выбрать подарок."
                + "\n" +
                "3. Добавить сладость."
                + "\n" +
                "4. Общая калорийность подарка."
                + "\n" +
                "5. Выход.");
        System.out.print("Ваш выбор - ");
    }

    public static int processUserInput(Scanner scanner, SeveralPackages severalPackages, List<Sweetness> list) {

        int selectedOption = Integer.parseInt(scanner.nextLine());

        switch (selectedOption) {

            case 1:
                System.out.println("Упаковка: ");
                System.out.println(severalPackages);
                System.out.println("Сладости: ");
                System.out.println(list);
                break;
            case 2:
                System.out.println("Сделайте выбор упаковки из данных: " + Arrays.toString(severalPackages.arrayOfPackages()));
                String str = scanner.nextLine();
                System.out.println("Сделайте выбор сладости из данных: " + Arrays.toString(arrayOfSweets(list)));
                String str1 = scanner.nextLine();

                Packaging packaging = packagingSelection(severalPackages, str);
                List<Sweetness> list1 = sweetsList(list, str1);
                Gift gift = new Gift();
                gift.setGift(list1, packaging);
                System.out.println(gift);
                break;
            case 3:
                System.out.println("Сделайте выбор сладости из данных: " + Arrays.toString(arrayOfSweets(list)));
                String addSweets = scanner.nextLine();

                gift.addSweetness(addSweets);
                System.out.println(gift);
                break;

            case 4:
                int x = totalCalories(gift);
                System.out.println();
                break;
        }
        return selectedOption;
    }

    public static int totalCalories(Gift gift) {
        List<Sweetness> list = gift.getList();
        int calorieContentOfSweets = 0;

        for (int i = 0; i < list.size(); i++) {
            calorieContentOfSweets += list.get(i).getCalories();
        }
        return calorieContentOfSweets;
    }


    public static Sweetness selectedSweetness(List<Sweetness> list, String str1) {
        Sweetness sweetness = null;
        for (int i = 0; i < list.size(); i++) {
            if (str1.equalsIgnoreCase(list.get(i).getName())) {
                sweetness = list.get(i);
            }
        }
        return sweetness;
    }

    public static List<Sweetness> sweetsList(List<Sweetness> list, String str1) {
        List<Sweetness> list1 = new ArrayList<>();
        list1.add(selectedSweetness(list, str1));
        return list1;
    }

    public static Packaging packagingSelection(SeveralPackages severalPackages, String str) {
        Packaging packaging = severalPackages.selectedPackaging(str);
        return packaging;
    }

    public static String[] arrayOfSweets(List<Sweetness> list) {
        String[] strings = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            strings[i] = list.get(i).getName();
        }
        return strings;
    }

    public static Packaging[] arrayPackaging() {
        return new Packaging[]{
                new Packaging("бумага", 10),
                new Packaging("фольга", 15),
                new Packaging("целофан", 5),
                new Packaging("ткань", 25),
                new Packaging("бумага", 10)};
    }

    public static List<Sweetness> arraySweetness() {
        List<Sweetness> list = new ArrayList();

        Sweetness sweetness1 = new Sweetness("леденцы", 50);
        list.add(sweetness1);
        list.add(new Sweetness("карамель", 100));
        list.add(new Sweetness("печенье", 25));

        return list;
    }
}
