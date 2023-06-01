package product.srp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class User {
  private String name;
  private long money;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }
}
