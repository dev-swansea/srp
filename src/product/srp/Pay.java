package product.srp;

public class Pay {

  private User user;
  private Order order;

  Pay(User user, Order order) {
    this.user = user;
    this.order = order;
  }

  public void pay(String cardPayMethod) {
    System.out.println(order.totalPrice + "-->");
    if (cardPayMethod.equals("visa")) {
      System.out.println("visa 카드로 결제합니다.");
      user.setMoney((long) (user.getMoney() - order.totalPrice * 1.1));
    } else if (cardPayMethod.equals("master")) {
      System.out.println("master 카드로 결제합니다.");
      user.setMoney((long) (user.getMoney() - order.totalPrice * 1.3));
    }
  }
}