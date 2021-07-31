package InuShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingManagerMode {
    public int indexManage = 0;
    public String product = "";
    public int price= 0;
    Scanner scManager = new Scanner(System.in);
    List<String> prodname = new ArrayList<>();
    List<Integer> prodprice = new ArrayList<>();
    List<Integer> prodcount = new ArrayList<>();

    public void MainManage() {
        do{
            System.out.println("< 쇼핑 관리자 모드 >");
            System.out.println("[1] 상품추가");
            System.out.println("[2] 상품삭제");
            System.out.println("[3] 모든 상품 출력");
            System.out.println("[4] 돌아가기");
            System.out.print("입력 : ");
            indexManage = scManager.nextInt();

            scManager.nextLine();

            switch (indexManage){
                case 1:
                    AddManage();
                    break;
                case 2:
                    DelManage();
                    break;
                case 3:
                    ProdPrint();
                    break;
                case 4:
                    break;
            }
        }while(indexManage != 4);

    }

    public void AddManage() {
        System.out.println("새로운 상품을 추가합니다. 상품 이름 입력시 no를 입력하면 빠져 나갑니다.");
        System.out.print("상품 이름 입력 : ");   // 띄어쓰기 시 프로그램 오류,,
        product = scManager.nextLine();

        if(!product.equals("no")){
            System.out.print("상품 가격 입력 : ");
            price = scManager.nextInt();
            AddProduct();
        }
        System.out.println("새로운 상품 추가 종료.");
        MainManage();
    }

    public void AddPrint() {
        System.out.println(product + "를(을) 목록에 등록했습니다.");
    }

    public void DelManage() {
        System.out.print("삭제하실 상품의 이름을 입력하세요 : ");
        product = scManager.nextLine();
        DelPrint();
    }

    public void DelPrint(){
        System.out.println(product + "를(을) 삭제합니다.");
        DelProduct();
    }

    public void AddProduct(){  // 장바구니 추가한 상품 저장
        prodname.add(product);
        prodprice.add(price);
        prodcount.add(100);
        AddPrint();
    }

    public void DelProduct(){  // 장바구니 상품 목록 삭제
        prodname.remove(product);
    }

    public void ProdPrint(){
        for(int n = 0; n<prodname.size();n++) {
            System.out.print("상품명 : " + prodname.get(n) + "\t");
            System.out.print("가격 : " + prodprice.get(n) + "원" + "\t");
            System.out.println("재고/수량 : " + prodcount.get(n) + "개" + "\t");
        }
        System.out.println("총 " + prodname.size() + "가지의 상품");
    }
}

