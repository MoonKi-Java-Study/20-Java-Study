package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.MainMenuViewer;

import java.util.Scanner;

public class MainMenu {
    private int commandNumber;

    public void showMain(){
        new MainMenuViewer();
        Scanner scanner = new Scanner(System.in);
        ErrorCatcher errorCatcher = new ErrorCatcher();
        commandNumber = errorCatcher.getInteger();
        System.out.println("commandNumber is " + commandNumber);
        // commandNumber 가 예상된 커맨드 값인지 검사하는 메소드 필요.
    }

    public MainMenu() {
        this.commandNumber = 0;

        showMain();
        if (commandNumber == 3) {
            System.out.println("exit");
            System.exit(0);
        } else if (commandNumber == 1) {
            System.out.println("administer mode");
            new AdminMode();
        }
    }
}
