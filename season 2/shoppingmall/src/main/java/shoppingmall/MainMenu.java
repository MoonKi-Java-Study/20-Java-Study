package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.MainMenuViewer;

import java.util.Scanner;

public class MainMenu {
    public void showMain(){
        new MainMenuViewer();
        Scanner scanner = new Scanner(System.in);
        ErrorCatcher errorCatcher = new ErrorCatcher();
        int commandNumber = errorCatcher.getInteger();
        System.out.println("commandNumber is " + commandNumber);
        // commandNumber 가 예상된 커맨드 값인지 검사하는 메소드 필요.
    }

    public MainMenu() {
        showMain();
    }
}
