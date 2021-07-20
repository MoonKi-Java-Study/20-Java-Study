package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.CustomerModeViewer;
import viewers.ProductViewer;

public class CustomerMode {
    ErrorCatcher errorCatcher = new ErrorCatcher();
    CustomerModeViewer customerModeViewer = new CustomerModeViewer();

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
            ProductViewer productViewer = new ProductViewer();
            productViewer.showProduct();
            runCustomerMode();
        } else if (commandNumber == 2) {// 상품 검색
            searchProduct();
        } else if (commandNumber == 3) {// 장바구니 모드

        } else if (commandNumber == 4) {// 돌아가기
            new MainMenu();
        }
    }

    public void searchProduct() {

    }
}
