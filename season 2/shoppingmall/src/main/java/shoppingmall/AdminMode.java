package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.AdminModeViewer;
import viewers.ProductViewer;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminMode {
    private static final int ESCAPE = -1;
    AdminModeViewer adminModeViewer = new AdminModeViewer();
    ErrorCatcher errorCatcher = new ErrorCatcher();

    public AdminMode() {
        adminModeViewer.showPasswordCheck();
        startCheckPass();
    }

    public void startCheckPass() {
        AdminRepos adminRepos = new AdminRepos();
        int password = errorCatcher.getInteger();
        boolean passAdmin = adminRepos.checkPassword(password);
        getPass(passAdmin);
    }

    public void getPass(boolean passAdmin) {
        if (passAdmin) {
            runAdminMode();
        }
        if (passAdmin == false) {
            adminModeViewer.showPasswordCheck();
            startCheckPass();
        }
    }

    public void runAdminMode() {
        adminModeViewer.showAdminPage();
        int commandNumber = errorCatcher.getInteger();
        getChoice(commandNumber);
    }

    public void getChoice(int commandNumber) {
        if (commandNumber == 1) {
            runProductAdd();
        } else if (commandNumber == 2) {
            runProductDelete();
        } else if (commandNumber == 3) {
            ProductViewer productViewer = new ProductViewer();
            productViewer.showProduct();
            runAdminMode();
        } else if (commandNumber == 4) {
            new MainMenu();
        }
    }

    public void runProductAdd() {
        Scanner scanner = new Scanner(System.in);
        adminModeViewer.showProductAddPage();
        String name = scanner.next();
        if (isProductName(name)) {
            adminModeViewer.showGetProductPrice();
            int price = errorCatcher.getInteger();
            addProduct(name, price);
        }
        if (!isProductName(name)) {
            System.out.println("새로운 상품 추가 종료.");
            runAdminMode();
        }
    }

    public void runProductDelete() {
        Scanner scanner = new Scanner(System.in);
        adminModeViewer.showProductDelPage();
        String name = scanner.next();
        if (isProductName(name)) {
            deleteProduct(name);
        }
        if (!isProductName(name)) {
            System.out.println("상품 삭제 종료.");
            runAdminMode();
        }
    }

    public boolean isProductName(String name) {
        if (!"no".equals(name)) {
            return true;
        }
        return false;
    }

    public void addProduct(String name, int price) {
        ArrayList<String> product = new ArrayList<String>();
        product.add(name);
        product.add(Integer.toString(price));
        product.add("100");
        ProductRepos.productList.add(product);
        ProductRepos.productNameList.add(name);

        adminModeViewer.showDisplayedProduct(name);
        runProductAdd();
    }

    public void deleteProduct(String name) {
        int indexOfProduct = ProductRepos.productNameList.indexOf(name);
        ProductRepos.productNameList.remove(indexOfProduct);
        ProductRepos.productList.remove(indexOfProduct);

        adminModeViewer.showDeletedProduct(name);
    }
}
