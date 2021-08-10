package INUShopping;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InuShopping {
    Scanner sc = new Scanner(System.in);
    public int index = 0;
    public final int realpassword = 1234;
    public int password = 0;

    public String product = "";
    public int price = 0;
    List<String> productName = new ArrayList<>();
    List<Integer> productPrice = new ArrayList<>();
    List<Integer> productCount = new ArrayList<>();

    public InuShopping() {
        SearchManager();
    }

    public void MainHome() {
        System.out.println("<< INU 쇼핑에 오신 것을 환영합니다! >>");
        System.out.println("[1] 쇼핑 관리자 모드");
        System.out.println("[2] 고객 모드");
        System.out.println("[3] 종료");

        System.out.print("입력 : ");
        index = sc.nextInt();
        SearchIndex(index);
    }

    public void SearchIndex(int index) {
        do {
            if(index == 1) {
                SingIn();  // 로그인
                SearchManager();     //관리자모드
            }
            else if (index == 2){
                System.out.println("고객 모드 시작");  // 수정시작
            }
            else if (index > 3){
                System.out.println("입력오류. 다시입력해주세요.");
            }
        }while(index != 3);
    }



    // 관리자모드 구현

    // 관리자 모드 시작 메뉴
    public void MainManager() {
        System.out.println("< 쇼핑 관리자 모드 >");
        System.out.println("[1] 상품추가");
        System.out.println("[2] 상품삭제");
        System.out.println("[3] 모든 상품 출력");
        System.out.println("[4] 돌아가기");
        System.out.print("입력 : ");
        index = sc.nextInt();
        sc.nextLine();
        System.out.println();
    }

    public void SearchManager() {
        do {
            MainManager();
            InitProduct();
            if(index == 1) {
                AddMain();
            }
            else if (index == 2){
                DelMain();
            }
            else if (index == 3){
                ShowProduct();
            }
            else if (index == 4){
                MainHome();
            }
            else if (index > 4){
                System.out.println("입력오류. 다시입력해주세요.");
            }
        } while(index != 4);
    }

    // [0] 관리자 로그인

    // 관리자 비밀번호 입력 메인화면
    public void SingIn() {
        do{
            ErrorPassword();// 문자열 입력시 예외
            isPassword();
        } while(!isPassword());
    }

    // 관리자 비밀번호 일치여부
    public boolean isPassword() {
        if(this.password != realpassword){
            return false;
        }
        return true;
    }

    public void ErrorPassword() {
        try{
            System.out.print("관리자 비밀번호를 입력하세요(메인 화면으로 돌아가려면 -1 입력) : ");
            this.password = sc.nextInt();
        }
        catch (InputMismatchException e){
            sc.nextLine();
            System.out.println("[입력오류] 숫자를 입력하세요.");
        }

        if (password == -1){
            MainHome();
        }

        else if(!isPassword()){
            System.out.println("틀린 비밀번호입니다. 다시입력하세요.");
        }
    }


    // [1] 상품추가 함수
    public void AddMain(){
        System.out.println("새로운 상품을 추가합니다. 상품 이름 입력 시 no를 입력하면 빠져 나갑니다.");
        System.out.println();


        AddInput();

        System.out.println("새로운 상품 추가 종료.");
    }


    // 상품 입력란
    public void AddInput() {
        do {
            System.out.print("상품 이름 입력 : ");
            product = sc.nextLine();
            ExistProduct();

            if(isAdd() && !isReProduct()){
                System.out.print("상품 가격 입력 : ");
                price = sc.nextInt();
                sc.nextLine();
                AddProduct();
            }
        } while(isAdd());
    }



    // 상품 입력 여부 확인
    public boolean isAdd() {
        if(!product.equals("no")){
            return true;
        }
        return false;
    }


    // 상품추가
    public void AddProduct() {
        productName.add(product);
        productPrice.add(price);
        productCount.add(100);

        System.out.println(product + "를(을) 목록에 등록했습니다.");
    }

    // 상품 중복 여부
    public boolean isReProduct() {
        return productName.contains(product);
    }

    public void ExistProduct() {
        if(isReProduct()){
            System.out.println("이미 존재하는 상품입니다.");
        }
    }

    // 초기 상품추가

    public void AddProduct(String product, int price) {
        if(!productName.contains(product)){
            productName.add(product);
            productPrice.add(price);
            productCount.add(100);
        }
    }

    public void InitProduct() {
        AddProduct("따듯 스웨터", 40000);
        AddProduct("나이키 운동화", 83000);
        AddProduct("손목시계", 100000);
        AddProduct("BB크림", 30000);
        AddProduct("향긋 샴푸", 15000);
        AddProduct("매니큐어", 11000);
        AddProduct("저렴 TV", 709000);
        AddProduct("세탁기", 360000);
        AddProduct("공유기", 59000);
        AddProduct("식탁", 79000);
        AddProduct("암막커튼", 26000);
        AddProduct("책꽂이", 108000);
        AddProduct("기저귀", 16900);
        AddProduct("유모차", 398000);
        AddProduct("햅쌀", 38000);
        AddProduct("은갈치", 33000);
        AddProduct("흑당버블티 아이스바", 18900);
        AddProduct("종가집 배추김치", 29900);
        AddProduct("러닝머신", 1289000);
    }



    // [2] 상품삭제
    public void DelMain() {
        System.out.print("삭제하실 상품의 이름을 입력하세요 : ");
        product = sc.nextLine();

        DelProduct();

        System.out.println(product + "를(을) 삭제합니다.");
    }

    public void DelProduct() {
        productPrice.remove(productName.indexOf(product));
        productCount.remove(productName.indexOf(product));
        productName.remove(product);
    }


    // [3] 모든 상품 출력

    public void ShowProduct() {
        for(int n = 0; n < productName.size(); n++) {
            System.out.print("상품명 : " + productName.get(n) + "\t");
            System.out.print("가격 : " + productPrice.get(n) + "원" + "\t");
            System.out.println("재고/수량 : " + productCount.get(n) + "개" + "\t");
        }
        System.out.println();
        System.out.println("총 " + productName.size() + "가지의 상품");
        System.out.println();
    }

    //

    public static void main(String[] args) {
        InuShopping inuShopping = new InuShopping();
    }


}
