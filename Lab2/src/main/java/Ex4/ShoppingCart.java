import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<String> cartContents;

    public ShoppingCart(ArrayList<String> cartContents) {
        this.cartContents = cartContents;
    }

    public ArrayList<String> getCartContents() {
        return cartContents;
    }

    public void setCartContents(ArrayList<String> cartContents) {
        this.cartContents = cartContents;
    }

    public void addToCart(String item) {
        this.cartContents.add(item);
    }

    public void removeFromCart(String item) {
        this.cartContents.remove(item);
    }

    public void checkOut() {
        System.out.println("Cart: " + getCartContents());
        System.out.println("Check out successfully!");
    }
}