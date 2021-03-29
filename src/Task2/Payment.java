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

        public void addProduct(Product product) {
            this.products = Arrays.copyOf(this.products, this.products.length + 1);
            this.products[this.products.length - 1] = product;

        }

        public int sumProducts() {
            int t = 0;
            for (int i = 0; i < this.products.length; i++) {
                t += this.products[i].getTheCost();
            }
            return t;
        }

        @Override
        public String toString() {
            return "ShoppingBasket{" +
                    "products=" + Arrays.toString(products) +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "shoppingBasket=" + shoppingBasket +
                '}';
    }
}
