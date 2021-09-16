package viewers;

import shoppingmall.Product;
import shoppingmall.ProductRepos;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductViewer {
    /*public void showProduct() {
        // when the no of product isn't None. prevent error
        if (ProductRepos.productList.size() != 0) {
            showProducts();
        }
    }

    public void showProducts(*//*ArrayList<ArrayList<String>> productList*//*) {
        for (int i = 0; i < ProductRepos.productList.size(); i++) {
            System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n"
                    , ProductRepos.productList.get(i).get(0)
                    , ProductRepos.productList.get(i).get(1)
                    , ProductRepos.productList.get(i).get(2));
        }
        System.out.println("\n" + "총 "
                + ProductRepos.productNameList.size() + "가지의 상품" + "\n");
    }*/

    public void showProduct() {
        if (ProductRepos.products.size() != 0) {
            showProducts();
        }
    }

    public void showProducts() {
        for (int i = 0; i < ProductRepos.products.size(); i++) {
            Product product;
            product = ProductRepos.products.get(i);
            printProduct(product);
        }
        System.out.println("\n" + "총 "
                + ProductRepos.productNameList.size() + "가지의 상품" + "\n");
    }

    public void printProduct(Product product) {
        System.out.printf("상품명 : %-10s  가격 : %d원  재고/수량 : %d개\n",
                product.getName(),
                product.getPrice(),
                product.getInventory());
    }

    public void showSpotlightedProduct(int productIndex) {
        System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n"
                , ProductRepos.productList.get(productIndex).get(0)
                , ProductRepos.productList.get(productIndex).get(1)
                , ProductRepos.productList.get(productIndex).get(2));
        System.out.println();
    }
}
