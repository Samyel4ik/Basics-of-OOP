package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Class {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        supermarket.setPackagings(buildPackagings());
        supermarket.setSweetnesses(buildSweetness());

        List<Sweetness> sweetnesses = selectedSweetness(supermarket);
        Packaging packaging = selectedPackaging(supermarket);

        Gift gift = new Gift(sweetnesses, packaging);

        printGiftInfo(gift);

    }

    public static int totalPriseGift(Gift gift) {
        return gift.getTotalPrise();
    }

    public static int totalCaloriesGift(Gift gift) {
        return gift.getTotalCalories();
    }

    public static void printGiftInfo(Gift gift) {
        System.out.println(gift);
        System.out.println("цена: " + totalPriseGift(gift));
        System.out.println("калории: " + totalCaloriesGift(gift));
    }

    public static Packaging selectedPackaging(Supermarket supermarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваш выбор из предложенных: ");
        System.out.println(supermarket.getPackagingList());
        String str = scanner.nextLine();

        return supermarket.purchasePackaging(str);
    }

    public static List<Sweetness> selectedSweetness(Supermarket supermarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите сладость из предложенных или введите (выход) для завершения выбора:");
        System.out.println(supermarket.getSweetnessList());

        List<Sweetness> sweetnesses = new ArrayList<>();
        String userInput = "";

        while (!userInput.equalsIgnoreCase("выход")) {
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("выход")) {
                Sweetness sweetness = supermarket.purchaseSweetnees(userInput);
                sweetnesses.add(sweetness);
            }
        }

        return sweetnesses;
    }

    public static List<Packaging> buildPackagings() {
        List<Packaging> arrayListPackaging = new ArrayList<>();

        arrayListPackaging.add(new Packaging("бумага", 10));
        arrayListPackaging.add(new Packaging("фольга", 15));
        arrayListPackaging.add(new Packaging("целофан", 5));
        arrayListPackaging.add(new Packaging("ткань", 25));
        arrayListPackaging.add(new Packaging("бумага", 10));
        return arrayListPackaging;
    }

    public static List<Sweetness> buildSweetness() {
        List<Sweetness> list = new ArrayList();

        Sweetness sweetness1 = new Sweetness("леденцы", 50, 15);
        list.add(sweetness1);
        list.add(new Sweetness("карамель", 100, 14));
        list.add(new Sweetness("печенье", 25, 10));
        return list;
    }
}
