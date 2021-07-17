package viewers;

import errorcatcher.ErrorCatcher;
import shoppingmall.AdminRepos;

import java.util.Scanner;

public class AdminModeViewer {
    public AdminModeViewer() {
        System.out.print("관리자 비밀번호를 입력하세요(메인 화면으로 돌아가려면 -1 입력) : ");
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
    }
}
