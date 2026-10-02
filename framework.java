import java.util.*;

class ShoppingCart {
    private Map<String, Integer> cart = new HashMap<>();

    public void addItem(String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
        System.out.println(quantity + " " + product + "(s) added to cart.");
    }

    public void removeItem(String product) {
        if (cart.containsKey(product)) {
            cart.remove(product);
            System.out.println(product + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    public void displayCart() {
        System.out.println("\n--- Shopping Cart ---");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

class ShoppingCartSystem {

 
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 1);
        cart.addItem("Phone", 2);
        cart.addItem("Headphones", 3);

        cart.displayCart();

        cart.removeItem("Phone");
        cart.displayCart();
    }
}
