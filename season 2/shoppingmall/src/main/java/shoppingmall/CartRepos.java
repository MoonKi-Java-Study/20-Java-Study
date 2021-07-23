package shoppingmall;

import java.util.ArrayList;

public class CartRepos {
    public static ArrayList<ArrayList<String>> cartList = new ArrayList<>();
    public static ArrayList<String> cartNameList = new ArrayList<>();

    public CartRepos() {

    }

    public static int getTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < cartNameList.size(); i++) {// 가격 x 개수
            totalPrice += getProductPrice(i) * getProductCount(i);
        }
        return totalPrice;
    }

    /*public static int getProductPrice(String productName) {
        if (cartNameList.contains(productName)) {
            int existProductIndex = cartNameList.indexOf(productName);
            int price = Integer.
                    parseInt(cartList.
                            get(existProductIndex).get(1));
            return price;
        }
        return -1;
    }*/

    public static String getProductName(int productIndex) {
        String name = cartList.get(productIndex).get(0);
        return name;
    }

    public static int getProductPrice(int productIndex) {
        String stringPrice = cartList.get(productIndex).get(1);
        int price = Integer.parseInt(stringPrice);
        return price;
    }

    public static int getProductCount(int productIndex) {
        String stringCount = cartList.get(productIndex).get(2);
        int count = Integer.parseInt(stringCount);
        return count;
    }
}
