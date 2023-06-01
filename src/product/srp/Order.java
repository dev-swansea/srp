package product.srp;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {
  User user;

  Item item;

  public List<Item> items;

  public int quantities;

  public Long totalPrice;

  public String cardPayMethod;


  public Order(User user) {
    this.user = user;
    items = new ArrayList<>();
  }

  public void addItems(Item item, int quantity, String cardPayMethod) {
    this.item = item;
    this.quantities = quantity;
    items.add(item);
    totalPrice();
    pay(cardPayMethod);
  }

  public void totalPrice() {
    totalPrice = item.getPrice() * quantities;
  }


  public void checkBalance() {
    System.out.println("최근 결제 금액: " + totalPrice + ", 남은 잔액: " + user.getMoney());
  }

  public void checkBoughtItem() {
    for (int i = 0; i < items.size(); i++) {
      System.out.println("구매 목록: " + items.get(i));
    }
  }

}
