package product.srp;

public class CheckBalance {
  private Order order;
  private User user;

  public CheckBalance(User user, Order order) {
    this.user = user;
    this.order = order;
  }

  public void checkBalance() {
    System.out.println("최근 결제 금액: " + order.totalPrice + ", 남은 잔액: " + user.getMoney());
  }
}
