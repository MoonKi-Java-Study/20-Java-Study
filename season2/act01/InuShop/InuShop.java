import java.util.Scanner;

class MainManager {
    public int indexManage = 0;
    public String prod = "";
    public int price= 0;
    Scanner scManager = new Scanner(System.in);

    public MainManager(String prod){
        this.prod = prod;  // 상품 삭제시 & 상품 입력 no
    }

    public MainManager(String prod, int price){ // 상품 추가시 상품, 가격 입력
        this.prod = prod;
        this.price = price;
    }

    public void printManage() {
        System.out.println("< 쇼핑 관리자 모드 >");
        System.out.println("[1] 상품추가");
        System.out.println("[2] 상품삭제");
        System.out.println("[3] 모든 상품 출력");
        System.out.println("[4] 돌아가기");
        System.out.print("입력 : ");
        indexManage = scManager.nextInt();
    }

    public void firstManage() {
        System.out.println("새로운 상품을 추가합니다. 상품 이름 입력시 no를 입력하면 빠져 나갑니다.");
        System.out.print("상품 이름 입력 : ");
        prod = scManager.next();
        System.out.print("상품 가격 입력 : ");
        price = scManager.nextInt();
    }

    public void firstPrint() {
        System.out.println(prod + "를(을) 목록에 등록했습니다.");
    }

    public void twiceManage() {
        System.out.print("삭제하실 상품의 이름을 입력하세요 : ");
        prod = scManager.next();
    }

    public void twicePrint(){
        System.out.println(prod + "를(을) 삭제합니다.");
    }

}




class main {
    int indexmain = 0;
    public int choiceNumber;
    private final int password = 1234;
    Scanner scMain = new Scanner(System.in);

    public void printMain() {
        System.out.println("<< INU 쇼핑에 오신 것을 환영합니다! >>");
        System.out.println("[1] 쇼핑 관리자 모드");
        System.out.println("[2] 고객 모드");
        System.out.println("[3] 종료");
        System.out.print("입력 : ");
        indexmain = scMain.nextInt();
    }
}

public class InuShop {
    public static void main(String[] args) {

    }
}
