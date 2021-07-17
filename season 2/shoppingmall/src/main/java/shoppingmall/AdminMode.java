package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.AdminModeViewer;

import java.util.Scanner;

public class AdminMode {
    private int commandNumber;
    private boolean passAdmin;
    private static final int ESCAPE = -1;

    public AdminMode() {
        startCheckPass();
    }

    public void startCheckPass() {
        Scanner scanner = new Scanner(System.in);
        AdminModeViewer adminModeViewer = new AdminModeViewer();
        AdminRepos adminRepos = new AdminRepos();
        ErrorCatcher errorCatcher = new ErrorCatcher();
        commandNumber = errorCatcher.getInteger();
        passAdmin = adminRepos.checkPassword(commandNumber);

        getPass();
    }

    public void getPass() {
        while (passAdmin == true) {
            if (passAdmin == false) {

            }
        }
    }
}
