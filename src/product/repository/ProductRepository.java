package product.repository;

import product.dto.Product;


public class ProductRepository { // DAO(Data Access Object) => 상품 정보를 처리할 객체?, repository라고 패키지명을 지어도 됨
  private Product[] pArr; // 상품 저장소로 사용중
  private int totalCnt = 0; // 저장된 상품수

  public ProductRepository() {
    pArr = new Product[5];
    System.out.println(pArr.length + " => pArr length");
  }

  public ProductRepository(int idx) {
    if (idx <= 0) {
      System.out.println("저장소 크기는 1이상이여야 합니다.");
      idx = 5;
    }
    pArr = new Product[idx];
    System.out.println(pArr.length + " => pArr length");
  }

  public void insert(Product p) {

    if (totalCnt >= pArr.length) {
      System.out.println("저장소가 꽉 찼습니다, 현재 상품수는 " + totalCnt + "입니다.");
      return;
    }

    // 상품번호 중복 비교
    for (int i = 0; i < totalCnt; i++) {
      if (pArr[i].getProdName().equals(p.getProdName())) {
        System.out.println("이미 존재하는 상품입니다.");
        return;
      }
    }
    pArr[totalCnt++] = p;
  }

  public Product selectByProdNo(String no) {
    for (int i = 0; i < totalCnt; i++) {
      Product p = pArr[i];
      if (p.getProdNo().equals(no)) {
        return p;
      }
    }
    return null;
  }

  public Product[] selectAll() {
    Product[] all = new Product[totalCnt];
    for (int i = 0; i < totalCnt; i++) {
      all[i] = pArr[i];
    }
    return all;
  }

  // 패턴을 일치시켜라 .. 어려웠다.
  public Product[] selectByProdName(String pName) {

    Product[] all = null;
    int cnt = 0;
    for (int i = 0; i < totalCnt; i++) {
      if (pArr[i].getProdName().contains(pName)) {
        cnt++;
        // 조건에 맞는 값을 세는구나
      }
    }

    all = new Product[cnt];
    int idx = 0;
    for (int i = 0; i < totalCnt; i++) {
      Product p = pArr[i];
      if (p.getProdName().contains(pName)) {
        all[idx] = p;
        idx++;
      }
    }
    return all;
  }

}