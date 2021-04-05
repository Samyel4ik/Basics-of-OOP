package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new Supermarket();

        supermarket.setPackagings(buildPackagings());
        supermarket.setSweetnesses(buildSweetness());

        System.out.println("выберите упаковку из предложенных:");
        System.out.println(supermarket.getPackagingList());
        String str = scanner.nextLine();
        System.out.println("выберите сладость из предложенных:");
        System.out.println(supermarket.getSweetnessList());
        String str1 = scanner.nextLine();

        List<Sweetness> sweetnesses = selectedSweetness(supermarket, str1);
        Packaging packaging = selectedPackaging(supermarket, str);

        Gift gift = new Gift(sweetnesses, packaging);

        printGiftInfo(gift);

        System.out.println("цена: " + gift.getTotalCalories());
        System.out.println("калории: " + gift.getTotalCalories());

    }

    public static void printGiftInfo(Gift gift) {
        System.out.println(gift);
    }

    public static Packaging selectedPackaging(Supermarket supermarket, String str) {
        return supermarket.purchasePackaging(str);
    }

    public static List<Sweetness> selectedSweetness(Supermarket supermarket, String str) {
        List<Sweetness> sweetnesses = new ArrayList<>();
        sweetnesses.add(supermarket.purchaseSweetnees(str));
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
