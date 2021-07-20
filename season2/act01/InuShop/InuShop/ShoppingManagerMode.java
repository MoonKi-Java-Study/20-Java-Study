package InuShop;

import java.util.ArrayList;
import java.util.Scanner;

class ShoppingManagerMode extends InuShop{
    public int indexManage = 0;
    public String prod = "";
    public int price= 0;
    Scanner scManager = new Scanner(System.in);
    ArrayList prodname = new ArrayList();
    ArrayList prodprice = new ArrayList();
    ArrayList prodcount = new ArrayList();

    public void MainManage() {
        System.out.println("< 쇼핑 관리자 모드 >");
        System.out.println("[1] 상품추가");
        System.out.println("[2] 상품삭제");
        System.out.println("[3] 모든 상품 출력");
        System.out.println("[4] 돌아가기");
        System.out.print("입력 : ");
        indexManage = scManager.nextInt();
        switch (indexManage){
            case 1:
                AddManage();
                break;
            case 2:
                DelManage();
                break;
            case 3:
                PrintManage();
                break;
            case 4:
                MainMenu();
                break;
        }
    }

    public void AddManage() {
        System.out.println("새로운 상품을 추가합니다. 상품 이름 입력시 no를 입력하면 빠져 나갑니다.");
        System.out.print("상품 이름 입력 : ");
        prod = scManager.next();
        System.out.print("상품 가격 입력 : ");
        price = scManager.nextInt();
    }

    public void AddPrint() {
        System.out.println(prod + "를(을) 목록에 등록했습니다.");
    }

    public void DelManage() {
        System.out.print("삭제하실 상품의 이름을 입력하세요 : ");
        prod = scManager.next();
    }

    public void DelPrint(){
        System.out.println(prod + "를(을) 삭제합니다.");
    }

    public void AddProduct(String prod){  // 장바구니 추가한 상품 저장

    }

    public void AddProdPrint(){

    }

    public void PrintManage(){}
}

