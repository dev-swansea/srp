package product.dto;

public class Product { // 상품 정보를 가지고 있다. => DTO! 단순히 데이터 전달에 사용된다.

  private String prodNo; // 상품 번호
  private String prodName; // 상품 이름
  private int prodPrice; // 상품 가격

  public Product() { // 자바빈 규약에 맞게 기본생성자 생성
  }

  public Product(String prodNo, String prodName, int prodPrice) {
    this.prodNo = prodNo;
    this.prodName = prodName;
    this.prodPrice = prodPrice;
  }

  // 자바빈 규약에 맞게 세터 게터 만들기
  // 굳이 private으로 막고 메서드로 호출하는 이유는 필터링이 가능하기 때문이다.
  public String getProdNo() {
    return prodNo;
  }

  public void setProdNo(String prodNo) {
    this.prodNo = prodNo;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public int getProdPrice() {
    return prodPrice;
  }

  public void setProdPrice(int prodPrice) {
    this.prodPrice = prodPrice;
  }

  public void print() {
    System.out.println("상품번호 :" + prodNo + ", 상품명 :" + prodName + ", 상품 가격:" + prodPrice);
  }

}

// javac -d D:\overview\myjava D:\overview\myjava\Product.java
// java -cp  D:\overview\myjava Product

// 객체지향의 목표 => 클래스의 재사용성을 높이기 위함