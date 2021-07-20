package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.AdminModeViewer;

public class AdminMode {
    private int passWord;
    private static final int ESCAPE = -1;
    AdminModeViewer adminModeViewer = new AdminModeViewer();

    public AdminMode() {
        startCheckPass();
    }

    public void startCheckPass() {
        AdminRepos adminRepos = new AdminRepos();
        ErrorCatcher errorCatcher = new ErrorCatcher();
        passWord = errorCatcher.getInteger();
        boolean passAdmin = adminRepos.checkPassword(passWord);
        getPass(passAdmin);
    }

    public void getPass(boolean passAdmin) {
        while (passAdmin == false) {
            startCheckPass();
        }
        if (passAdmin) {
            runAdminMode();
        }
    }

    public void runAdminMode() {
        adminModeViewer.showAdminPage();
        
    }
}
