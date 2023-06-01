package product.srp;

import java.math.BigInteger;

public class Suwan extends User {

  Suwan(Long money, String name) {
    setMoney(money);
    setName(name);
  }

  public static void main(String[] args) {
    Order order = new Order(new Suwan(40000000000000L, "suwan"));
    order.addItems(new Item("갤럭시 울트라 23", "샘송", 1400000L), 1, "visa");
    order.checkBalance();

    order.addItems(new Item("롯데타워", "롯데", 7600000000000L), 1, "visa");
    order.checkBalance();

    order.addItems(new Item("에버랜드", "삼성", 2000000000000L), 1, "visa");
    order.checkBalance();

    order.checkBoughtItem();

  }
}
