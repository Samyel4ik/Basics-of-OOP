package Task2;

import java.util.Scanner;

public class Class2 {
    //Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product("картоха", 12, 1);
        Product product1 = new Product("сало", 23, 123);
        Product[] products = new Product[]{product, product1};

        Payment.ShoppingBasket shoppingBasket = new Payment.ShoppingBasket();
        shoppingBasket.setShoppingBasket(products);

        Payment payment = new Payment();
        payment.setPayment(shoppingBasket);
        finish(scanner, products, shoppingBasket, payment);
    }

    public static void finish(Scanner scanner, Product[] products, Payment.ShoppingBasket shoppingBasket, Payment payment) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Список продуктов." + "\n" +
                "2.Добавить продукт в корзину." + "\n" +
                "3.Сумма покупки.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {
            System.out.println(payment);

        }
        if (t == 2) {
            System.out.print("Введите название продукта -");
            String name = scanner.nextLine();
            System.out.print("Введите название продукта -");
            int theCost = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите название продукта -");
            int theWeight = Integer.parseInt(scanner.nextLine());

            Payment.ShoppingBasket shoppingBasket1 = shoppingBasket.addProduct(products, name, theCost, theWeight);
            Payment payment1 = new Payment();
            payment1.setPayment(shoppingBasket1);
            System.out.println(payment1);
        }
        if (t == 3) {
            int x = shoppingBasket.sumProducts(products);

            System.out.println(" Сумма данной покупки составила - " + x + " рублей");
        }
    }

}
