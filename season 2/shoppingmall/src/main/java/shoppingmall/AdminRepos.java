package shoppingmall;

public class AdminRepos {
    private int password = 1234;

    public boolean checkPassword(int password) {
        if (this.password == password) {
            return true;
        }
        return false;
    }
}
