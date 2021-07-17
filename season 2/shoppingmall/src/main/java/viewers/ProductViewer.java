package viewers;

import java.util.ArrayList;

public class ProductViewer {
    public void showProduct(ArrayList<ArrayList<String>> productList) {
        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n", productList.get(i).get(0), productList.get(i).get(1), productList.get(i).get(2));
        }
    }
}
