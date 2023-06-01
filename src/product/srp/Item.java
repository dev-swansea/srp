package product.srp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {

  private String name;
  private String manufacturingCompany;
  private Long price;
  private Date expiratioDate;

  public Item(String name, String manufacturingCompany, Long price) {
    this.name = name;
    this.manufacturingCompany = manufacturingCompany;
    this.price = price;
  }

}
