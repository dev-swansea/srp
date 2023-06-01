package product.srp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {

  Item item;

  public List<Item> items;

  public int quantities;

  public Long totalPrice;


  public Order() {
    items = new ArrayList<>();
  }

  public void addItems(Item item, int quantity) {
    this.item = item;
    this.quantities = quantity;
    items.add(item);
    totalPrice();
  }

  public void totalPrice() {
    totalPrice = item.getPrice() * quantities;
  }


  public void checkBoughtItem() {
    for (int i = 0; i < items.size(); i++) {
      System.out.println("구매 목록: " + items.get(i));
    }
  }

}
