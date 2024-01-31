import java.util.ArrayList;

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        cart.addToCart("Junk");
        cart.addToCart("Banana");
        cart.addToCart("Apple");
        cart.removeFromCart("Junk");
        cart.checkOut();
    }
}
