package product.srp;

public class Pay {


  Pay() {

  }

  public void pay(String cardPayMethod) {
    if (cardPayMethod.equals("visa")) {
      System.out.println("visa 카드로 결제합니다.");
      user.setMoney((long) (user.getMoney() - totalPrice * 1.1));
    } else if (cardPayMethod.equals("master")) {
      System.out.println("master 카드로 결제합니다.");
      user.setMoney((long) (user.getMoney() - totalPrice * 1.3));
    }
  }
}