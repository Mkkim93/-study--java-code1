package collection.list.test.ex2;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("양파", 4000, 6);
        Item item4 = new Item("대파", 5000, 6);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.displayItems();
    }
}
