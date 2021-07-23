package viewers;

import shoppingmall.CartRepos;
import shoppingmall.ProductRepos;

public class CartModeViewer {
    public CartModeViewer() {

    }

    public void showCartPage() {
        System.out.println("< 장바구니 모드 >");
        System.out.println("[1] 상품 보기");
        System.out.println("[2] 장바구니에 담기");
        System.out.println("[3] 장바구니 출력");
        System.out.println("[4] 계산하기");
        System.out.print("입력 : ");
    }

    public void showInputName() {
        System.out.print("구매하고자 하는 상품 이름 입력(장바구니 담기 종료는 no 입력) : ");
    }

    public void showInputCount(String name, int inventory) {
        System.out.print("담을 수량 입력 (" +
                name + "의 남은 재고 : " +
                inventory + ") : ");
    }

    public void showProductAdded(String name, int count) {
        System.out.print(name + " " +
                count + "개를 장바구니에 담았습니다.");
        System.out.println();
    }

    public void showNoProduct() {
        System.out.println("입력하신 상품은 현재 등록되어 있지 않습니다.");
        System.out.println();
    }

    public void showOverCount() {
        System.out.println("입력하신 수량이 너무 많습니다.");
        System.out.println();
    }

    public void showProduct() {
        // when the no of product isn't None. prevent error
        if (CartRepos.cartList.size() != 0) {
            showProducts();
        }
    }

    public void showProducts() {
        for (int i = 0; i < CartRepos.cartNameList.size(); i++) {
            System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n"
                    , CartRepos.cartList.get(i).get(0)
                    , CartRepos.cartList.get(i).get(1)
                    , CartRepos.cartList.get(i).get(2));
        }
        System.out.println("\n" + "총 "
                + CartRepos.cartNameList.size() + "가지의 상품" + "\n");
    }

    public void showPurchased(int totalPrice) {
        showProduct();
        System.out.println("총" + totalPrice +
                "원 결제 완료되었습니다");
        System.out.println("장바구니 모드를 종료합니다.");
    }
}
