package viewers;

import errorcatcher.ErrorCatcher;
import shoppingmall.AdminRepos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdminModeViewer {
    public AdminModeViewer() {
    }

    public void showPasswordCheck() {
        System.out.print("관리자 비밀번호를 입력하세요(메인 화면으로 돌아가려면 -1 입력) : ");
    }

    public void showAdminPage() {
        System.out.println("< 쇼핑 관리자 모드 >");
        System.out.println("[1] 상품 추가");
        System.out.println("[2] 상품 삭제");
        System.out.println("[3] 모든 상품 출력");
        System.out.println("[4] 돌아가기");
        System.out.print("입력 : ");
    }

    public void showProductAddPage() {// 상품의 이름,
        System.out.println("새로운 상품을 추가합니다. 상품 이름 입력 시 no를 입력하면 빠져 나갑니다.");
        showGetProductName();
    }

    public void showGetProductName() {
        System.out.println();
        System.out.print("상품 가격 입력 : ");
    }

    public void showGetProductPrice() {
        System.out.print("상품 가격 입력 : ");
    }

    public void showDisplayedProduct(String productName) {
        System.out.println(productName + "를(을) 목록에 등록했습니다.");
        System.out.println();
    }
}
