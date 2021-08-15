package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.CustomerModeViewer;
import viewers.ProductViewer;

import java.util.Scanner;

public class CustomerMode {
    ErrorCatcher errorCatcher = new ErrorCatcher();
    CustomerModeViewer customerModeViewer = new CustomerModeViewer();
    ProductViewer productViewer = new ProductViewer();

    public CustomerMode() {
        runCustomerMode();
    }

    public void runCustomerMode() {
        customerModeViewer.showCustomerPage();
        int commandNumber = errorCatcher.getInteger();
        getChoice(commandNumber);
    }

    public void getChoice(int commandNumber) {
        if (commandNumber == 1) {// 상품 보기
            productViewer.showProduct();
            runCustomerMode();
        } else if (commandNumber == 2) {// 상품 검색
            runSearchProduct();
        } else if (commandNumber == 3) {// 장바구니 모드
            runCartMode();
        } else if (commandNumber == 4) {// 돌아가기
            new MainMenu();
        }
    }

    public void runSearchProduct() {
        Scanner scanner = new Scanner(System.in);
        customerModeViewer.showProductSpotlight();
        String name = scanner.next();
        if (isProductExist(name)) {
            searchProduct(name);
        } else if (!isProductExist(name)) {
            customerModeViewer.showNoProduct();
            runCustomerMode();
        }
    }

    public boolean isProductExist(String name) {
        if (ProductRepos.productNameList.contains(name)) {
            return true;
        }
        return false;
    }

    public void searchProduct(String name) {
        int productIndex = ProductRepos.getProductIndex(name);
        productViewer.showSpotlightedProduct(productIndex);
        runCustomerMode();
    }

    public void runCartMode() {
        CartMode cartMode = new CartMode();
        cartMode.runCartMode();
    }
}
