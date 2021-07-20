package viewers;

public class CustomerModeViewer {
    public CustomerModeViewer() {

    }

    public void showCustomerPage() {
        System.out.println("< 고객 모드 >");
        System.out.println("[1] 상품 보기");
        System.out.println("[2] 상품 검색");
        System.out.println("[3] 장바구니 모드");
        System.out.println("[4] 돌아가기");
        System.out.print("입력 : ");
    }

    public void showCartMode() {
        System.out.println("< 장바구니 모드 >");
        System.out.println("[1] 상품 보기");
        System.out.println("[2] 장바구니에 담기");
        System.out.println("[3] 장바구니 출력");
        System.out.println("[4] 계산하기");
        System.out.print("입력 : ");
    }

    public void showProductSpotlight() {
        System.out.print("상품명을 입력하세요 : ");
    }

    public void showNoProduct() {
        System.out.println("입력하신 상품은 현재 등록되어 있지 않습니다.");
    }
}
