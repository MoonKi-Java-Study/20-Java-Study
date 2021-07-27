package InuShop;

import java.util.Scanner;

public class Main extends ShoppingManagerMode {
    int indexmain = 0;
    private int password;
    Scanner scMain = new Scanner(System.in);

    public Main() {
        MainMenu();
    }

    public void InitSign() {
        do{
            System.out.print("관리자 비밀번호를 입력하세요(메인 화면으로 돌아가려면 -1 입력) : ");
            password = scMain.nextInt();

            if(password == -1){
                MainMenu();
                break;
            }

            else if(password != 1234){
                System.out.println("틀린 비밀번호입니다. 다시 입력하세요.");
            }
        } while(password != 1234);

    }

    public void MainInput(){
        do{
            System.out.print("입력 : ");
            indexmain = scMain.nextInt();
            switch (indexmain){
                case 1:
                    InitSign();
                    MainManage();
                    MainMenu();
                    break;
                case 2:
                    System.out.println("고객 모드");
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("입력오류. 다시 입력하세요.");
            }
        }while(indexmain != 3);
    }

    public void MainMenu() {
        System.out.println("<< INU 쇼핑에 오신 것을 환영합니다! >>");
        System.out.println("[1] 쇼핑 관리자 모드");
        System.out.println("[2] 고객 모드");
        System.out.println("[3] 종료");
        MainInput();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

}
