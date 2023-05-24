package product;


import product.dto.Product;
import product.repository.ProductRepository;

import java.util.Scanner;

public class ProductUser {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ProductRepository repository = new ProductRepository();
    String opt;
    do {
      System.out.println("작업을 선택하세요");
      System.out.println("번호 입력 = > 1: 상품 전체 검색, 2: 상품 번호 검색, 3: 상품 추가, 4: 상품 이름으로 검색 ,9: 종료");

      opt = sc.nextLine();

      if (opt.equals("1")) { // 테스트는 항상 검색부터 => 자료가 없어도 검색 시 프로그램이 돌아가야한다.
        System.out.println(">>전체상품검색<<");
        Product[] resultArr = repository.selectAll();

        // 상품 번호, 상품명, 가격 출력
        for (int i = 0; i < resultArr.length; i++) {
//					System.out.println("상품번호:" + resultArr[i].getProdNo() + ", 상품명: " + resultArr[i].getProdName()
//							+ ", 상품가격 :" + resultArr[i].getProdPrice());
          resultArr[i].print();
        }
      } else if (opt.equals("2")) {

        System.out.println(">>상품검색<<");
        System.out.print("상품번호 입력");
        String arg1 = sc.nextLine(); // 값 입력받기

//				System.out.print(arg1);
//				System.out.println(repository.selectByProdNo(arg1) == null ? "상품이 없습니다" : "상품이 있습니다");

        // 상품 정보까지 보여준다. (상품 번호, 상품명, 가격)
        Product p = repository.selectByProdNo(arg1);
//				System.out.println(p == null ? "상품이 없습니다."
//						: "상품 번호: " + p.getProdNo() + ", 상품명 :" + p.getProdName() + ", 상품 가격: " + p.getProdPrice());

        if (p != null) {
          p.print();
        }

      } else if (opt.equals("3")) {
        System.out.println(">>상품추가<<");
        System.out.print("상품 번호를 입력: ");
        String prodNo = sc.nextLine();
        System.out.print("상품명 입력: ");
        String prodName = sc.nextLine();
        System.out.print("상품 가격 입력: ");
        int prodPrice = Integer.parseInt(sc.nextLine());

        Product pArg = new Product(prodNo, prodName, prodPrice);
        repository.insert(pArg);

      } else if (opt.equals("4")) {
        System.out.println("상품 이름으로 검색");
        String pName = sc.nextLine();

        Product[] pArr = repository.selectByProdName(pName);
        for (Product p : pArr) {
          p.print();
        }

      } else if (opt.equals("9")) {
        // 4번 눌렀을 때 그냥 아래로 진행
      } else
        System.out.println("잘못 입력했음");
    } while (!opt.equals("9"));
    // break(강제로 조절하는 반복문을)로 반복문을 나오는것보단 조건식에 만족하지 않게 자연스레 반복문을 빠져나가는게 좋은 코드다.

  }
}