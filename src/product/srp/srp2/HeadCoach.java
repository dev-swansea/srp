package product.srp.srp2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HeadCoach {
  String name;
  int salary;

  HeadCoach(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public void makeSchedule() {
    for (int i = 0; i < 52; i++) {
      LocalDate now = LocalDate.now();
      DayOfWeek tuesday = DayOfWeek.TUESDAY;
      System.out.println(tuesday);
    }
    int training = (int) (Math.random() * 31) + 1;
  }

  public static void main(String[] args) {
    DayOfWeek tuesday = DayOfWeek.TUESDAY;
    System.out.println(tuesday);
  }

}
