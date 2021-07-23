package shoppingmall;

import errorcatcher.ErrorCatcher;
import viewers.CartModeViewer;
import viewers.ProductViewer;

import java.util.ArrayList;
import java.util.Scanner;

public class CartMode {
    ProductViewer productViewer = new ProductViewer();
    CartModeViewer cartModeViewer = new CartModeViewer();
    ErrorCatcher errorCatcher = new ErrorCatcher();

    public CartMode() {
        runCartMode();
    }

    public void runCartMode() {
        cartModeViewer.showCartPage();
        int commandNumber = errorCatcher.getInteger();
        getChoice(commandNumber);
    }

    public void getChoice(int commandNumber) {
        if (commandNumber == 1) {// 상품 보기
            productViewer.showProduct();
            runCartMode();
        } else if (commandNumber == 2) {// 장바구니에 담기
            runCartAdd();
        } else if (commandNumber == 3) {// 장바구니 출력
            cartModeViewer.showProduct();
        } else if (commandNumber == 4) {// 계산하기

        }
    }

    public void runCartAdd() {
        String name = getProductName();
        if (isProductName(name)) {
            validateProductName(name);
        } else if (!isProductName(name)) {
            new CartMode();
        }
    }

    public void validateProductName(String name) {
        if (isProductExist(name)) {
            addToCart(name);
        } else if (!isProductExist(name)) {
            cartModeViewer.showNoProduct();
            runCartMode();
        }
    }

    public String getProductName() {
        Scanner scanner = new Scanner(System.in);
        cartModeViewer.showInputName();
        String name = scanner.next();
        return name;
    }

    public void addToCart(String name) {
        int inventory = ProductRepos.getProductInventory(name);
        cartModeViewer.showInputCount(name, inventory);
        int count = errorCatcher.getInteger();
        if (validateProductCount(name, count)) {
            addToCartList(name, count);
            cartModeViewer.showProductAdded(name, count);
            runCartAdd();
        } else if (!validateProductCount(name, count)) {
            runCartAdd();
        }
    }

    public void addToCartList(String name, int count) {
        ArrayList<String> product = new ArrayList<>();
        product.add(name);
        product.add(Integer.toString(ProductRepos.getProductPrice(name)));
        product.add(Integer.toString(count));
        CartRepos.cartList.add(product);
        CartRepos.cartNameList.add(name);
    }

    public boolean validateProductCount(String name, int count) {
        if (isCountBig(name, count)) {
            cartModeViewer.showOverCount();
            return false;
            //runCartAdd();
        }
        return true;
    }

    public boolean isCountBig(String name, int count) {
        if (count > ProductRepos.getProductInventory(name)) {
            return true;
        }
        return false;
    }

    public boolean isProductName(String name) {
        if (!"no".equals(name)) {
            return true;
        }
        return false;
    }

    public boolean isProductExist(String name) {
        if (ProductRepos.productNameList.contains(name)) {
            return true;
        }
        return false;
    }
}
