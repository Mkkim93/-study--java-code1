package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바 구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }

        int total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("총 합계 : " + total);
    }
}