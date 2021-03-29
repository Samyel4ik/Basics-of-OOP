package Task2;

import java.util.Scanner;

public class Class2 {
    //Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = arrayProduct();

        Payment.ShoppingBasket shoppingBasket = new Payment.ShoppingBasket();
        shoppingBasket.setShoppingBasket(products);

        Payment payment = new Payment();
        payment.setPayment(shoppingBasket);

        int noExit = 0;
        while (noExit != 4) {
            printInputOptions();
            noExit = processUserInput(scanner, payment, shoppingBasket);
            System.out.println("__________");
        }
    }

    public static Product[] arrayProduct() {
        return new Product[]{
                new Product("картоха", 12, 1),
                new Product("сало", 23, 123)};
    }

    public static void printInputOptions() {
        System.out.println("Выберите пункт меню:"
                + "\n" +
                "1.Список продуктов в корзине."
                + "\n" +
                "2.Добавить продукт в корзину."
                + "\n" +
                "3.Сумма покупки."
                + "\n" +
                "4.Выход из программы.");
        System.out.print("Ваш выбор - ");
    }

    public static int processUserInput(Scanner scanner, Payment payment, Payment.ShoppingBasket shoppingBasket) {
        int selectedOption = Integer.parseInt(scanner.nextLine());

        switch (selectedOption) {
            case 1:
                System.out.println(payment);
                break;
            case 2:
                shoppingBasket.addProduct(newProduct(scanner));
                Payment payment1 = new Payment();
                payment1.setPayment(shoppingBasket);
                System.out.println(payment1);
                break;
            case 3:
                sumProducts(shoppingBasket);
                break;
        }

        return selectedOption;
    }


    public static Product newProduct(Scanner scanner) {
        System.out.print("Введите название продукта -");
        String name = scanner.nextLine();
        System.out.print("Введите cтоимость  продукта -");
        int theCost = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите вес продукта -");
        int theWeight = Integer.parseInt(scanner.nextLine());

        return new Product(name, theCost, theWeight);
    }


    public static void sumProducts(Payment.ShoppingBasket shoppingBasket) {

        int x = shoppingBasket.sumProducts();

        System.out.println(" Сумма данной покупки составила - " + x + " рублей");
    }
}


