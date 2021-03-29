package Task2;

import java.util.Arrays;

public class Payment {
    ShoppingBasket shoppingBasket;

    public void setPayment(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    static class ShoppingBasket {
        Product[] products;

        public void setShoppingBasket(Product[] products) {
            this.products = products;
        }

        public ShoppingBasket addProduct(Product[] products, String name, int theCost, int theWeight) {
            Product[] products1 = Arrays.copyOf(this.products, this.products.length + 1);
            products1[products1.length - 1] = new Product(name, theCost, theWeight);
            ShoppingBasket shoppingBasket1 = new ShoppingBasket();
            shoppingBasket1.setShoppingBasket(products1);
            return shoppingBasket1;
        }

        public int sumProducts(Product[] products) {
            int t = 0;
            for (int i = 0; i < this.products.length; i++) {
                t += this.products[i].getTheCost();
            }
            return t;
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "shoppingBasket=" + shoppingBasket +
                '}';
    }
}
