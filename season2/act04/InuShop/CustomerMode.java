package InuShop;

import java.util.Scanner;


public class CustomerMode extends ShoppingManagerMode {
    //public int indexManage = 0;
    //public String product = "";
    //public int price= 0;
    Scanner sc = new Scanner(System.in);

    public void MainCustomer() {
        do{
            System.out.println("< 고객 모드 >");
            System.out.println("[1] 상품 보기");
            System.out.println("[2] 상품 검색");
            System.out.println("[3] 장바구니 모드");
            System.out.println("[4] 돌아가기");
            System.out.print("입력 : ");
            indexManage = sc.nextInt();
            if(indexManage == 1) {
                ProdPrint();
            }
            else if(indexManage == 2) {

            }
            else if(indexManage == 3) {

            }
            else if(indexManage == 4) {

            }
            else if(indexManage > 4) {
                System.out.println("다시 입력하세요.");
            }
        }while(indexManage != 4);

    }

    public void ProductSearch() {
        System.out.print("상품을 입력하세요 : ");
        product = sc.next();
        if(!isProductExist()) {
            System.out.println("입력하신 상품은 현재 등록되어 있지 않습니다.");
        }

    }

    public boolean isProductExist() {
        for(String s: prodname){
            if(s.equals(product)) {
                System.out.print("상품명 : " + product + "\t");
                //System.out.print("가격 : " +  + "원" + "\t");
                //System.out.println("재고/수량 : " +  + "개" + "\t");

                return true;
            }
        }
        return false;
    }

    public void PrintProduct() {
        for(String s : prodname) {

        }
    }


}
