package InuShop;

public class ShoppingBag {

    public void ProductChose(){
        System.out.println("구매하고자 하는 상품 이름 입력 (장바구니 담기 종료는 no 입력) : ");
        product = sc.nextLine();

        // 2번 상품 검색 존재 판별여부 함수 추가
        // 만약 존재하다면
        System.out.println("담을 수량 입력(은갈치의 남은 재고 : " );
        productCount = sc.nextInt();

        System.out.println(product + productCount + "개를 장바구니에 담았습니다.");
        
    }
}
