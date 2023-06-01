package product.srp;

import java.math.BigInteger;

public class Suwan extends User {

  Suwan(Long money, String name) {
    setMoney(money);
    setName(name);
  }

  public static void main(String[] args) {
    Order order = new Order();

    Pay pay = new Pay(new Suwan(40000000000000L, "suwan"), order);

    CheckBalance checkBalance = new CheckBalance();

    order.addItems(new Item("갤럭시 울트라 23", "샘송", 1400000L), 1);

    pay.pay("visa");
    //order.checkBalance();

    CheckBalance
    order.checkBoughtItem();

  }
}
