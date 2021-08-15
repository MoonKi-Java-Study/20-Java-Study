package validators;

public class Validator {
    public Validator() {

    }

    public boolean validateCommandShopAdminMode(int commandNumber) {
        if (commandNumber >= 1 && commandNumber <= 4 && commandNumber == -1) {
            return true;
        }
        return false;
    }

    public boolean validateCommandMainMenu(int commandNumber) {
        if (commandNumber >= 1 && commandNumber <= 3 && commandNumber == -1) {
            return true;
        }
        return false;
    }
}
