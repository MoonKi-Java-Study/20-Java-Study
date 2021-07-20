package viewers;

import shoppingmall.ProductRepos;

import java.util.ArrayList;

public class ProductViewer {
    public void showProduct(/*ArrayList<ArrayList<String>> productList*/) {
        for (int i = 0; i < ProductRepos.productList.size(); i++) {
            System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n"
                    , ProductRepos.productList.get(i).get(0)
                    , ProductRepos.productList.get(i).get(1)
                    , ProductRepos.productList.get(i).get(2));
        }
    }
}
