package shoppingmall;

import java.util.ArrayList;
import java.util.List;

public class ProductRepos {
    public static ArrayList<ArrayList<String>> productList = new ArrayList<>();
    public static ArrayList<String> productNameList = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    public ProductRepos() {
        Product product1 = new Product("따뜻한 스웨터", 40000, 100);
        Product product2 = new Product("나이키 운동화", 83000, 100);
        Product product3 = new Product("손목시계", 100000, 100);
        Product product4 = new Product("BB크림", 30000, 100);
        Product product5 = new Product("향긋 샴푸", 15000, 100);

        Product product6 = new Product("매니큐어", 11000, 100);
        Product product7 = new Product("저렴 TV", 709000, 100);
        Product product8 = new Product("세탁기", 360000, 100);
        Product product9 = new Product("공유기", 59000, 100);
        Product product10 = new Product("식탁", 79000, 100);

        Product product11 = new Product("암막커튼", 26000, 100);
        Product product12 = new Product("책꽂이", 108000, 100);
        Product product13 = new Product("기저귀", 16900, 100);
        Product product14 = new Product("유모차", 398000, 100);
        Product product15 = new Product("햅쌀", 38000, 100);

        Product product16 = new Product("은갈치", 33000, 100);
        Product product17 = new Product("흑당버블티 아이스바", 18900, 100);
        Product product18 = new Product("종가집 배추김치", 29900, 100);
        Product product19 = new Product("러닝머신", 1289000, 100);
        Product product20 = new Product("이어폰", 30000, 100);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        products.add(product11);
        products.add(product12);
        products.add(product13);
        products.add(product14);
        products.add(product15);

        products.add(product16);
        products.add(product17);
        products.add(product18);
        products.add(product19);
        products.add(product20);




        productNameList.add("따뜻한 스웨터");
        productNameList.add("나이키 운동화");
        productNameList.add("손목시계");
        productNameList.add("BB크림");
        productNameList.add("향긋 샴푸");

        productNameList.add("매니큐어");
        productNameList.add("저렴 TV");
        productNameList.add("세탁기");
        productNameList.add("공유기");
        productNameList.add("식탁");

        productNameList.add("암막커튼");
        productNameList.add("책꽂이");
        productNameList.add("기저귀");
        productNameList.add("유모차");
        productNameList.add("햅쌀");

        productNameList.add("은갈치");
        productNameList.add("흑당버블티 아이스바");
        productNameList.add("종가집 배추김치");
        productNameList.add("러닝머신");
        productNameList.add("이어폰");

        ArrayList<String> data1 = new ArrayList<>();
        data1.add("따뜻한 스웨터");
        data1.add("40000");
        data1.add("100");

        ArrayList<String> data2 = new ArrayList<>();
        data2.add("나이키 운동화");
        data2.add("83000");
        data2.add("100");

        ArrayList<String> data3 = new ArrayList<>();
        data3.add("손목시계");
        data3.add("100000");
        data3.add("100");

        ArrayList<String> data4 = new ArrayList<>();
        data4.add("BB크림");
        data4.add("30000");
        data4.add("100");

        ArrayList<String> data5 = new ArrayList<>();
        data5.add("향긋 샴푸");
        data5.add("15000");
        data5.add("100");

        ArrayList<String> data6 = new ArrayList<>();
        data6.add("매니큐어");
        data6.add("11000");
        data6.add("100");

        ArrayList<String> data7 = new ArrayList<>();
        data7.add("저렴 TV");
        data7.add("709000");
        data7.add("100");

        ArrayList<String> data8 = new ArrayList<>();
        data8.add("세탁기");
        data8.add("360000");
        data8.add("100");

        ArrayList<String> data9 = new ArrayList<>();
        data9.add("공유기");
        data9.add("59000");
        data9.add("100");

        ArrayList<String> data10 = new ArrayList<>();
        data10.add("식탁");
        data10.add("79000");
        data10.add("100");

        ArrayList<String> data11 = new ArrayList<>();
        data11.add("암막커튼");
        data11.add("26000");
        data11.add("100");

        ArrayList<String> data12 = new ArrayList<>();
        data12.add("책꽂이");
        data12.add("108000");
        data12.add("100");

        ArrayList<String> data13 = new ArrayList<>();
        data13.add("기저귀");
        data13.add("16900");
        data13.add("100");

        ArrayList<String> data14 = new ArrayList<>();
        data14.add("유모차");
        data14.add("398000");
        data14.add("100");

        ArrayList<String> data15 = new ArrayList<>();
        data15.add("햅쌀");
        data15.add("38000");
        data15.add("100");

        ArrayList<String> data16 = new ArrayList<>();
        data16.add("은갈치");
        data16.add("33000");
        data16.add("100");

        ArrayList<String> data17 = new ArrayList<>();
        data17.add("흑당버블티 아이스바");
        data17.add("18900");
        data17.add("100");

        ArrayList<String> data18 = new ArrayList<>();
        data18.add("종가집 배추김치");
        data18.add("29900");
        data18.add("100");

        ArrayList<String> data19 = new ArrayList<>();
        data19.add("러닝머신");
        data19.add("1289000");
        data19.add("100");

        ArrayList<String> data20 = new ArrayList<>();
        data20.add("이어폰");
        data20.add("30000");
        data20.add("100");

        productList.add(data1);
        productList.add(data2);
        productList.add(data3);
        productList.add(data4);
        productList.add(data5);
        productList.add(data6);
        productList.add(data7);
        productList.add(data8);
        productList.add(data9);
        productList.add(data10);
        productList.add(data11);
        productList.add(data12);
        productList.add(data13);
        productList.add(data14);
        productList.add(data15);
        productList.add(data16);
        productList.add(data17);
        productList.add(data18);
        productList.add(data19);
        productList.add(data20);
    }

    public static int getProductIndex(String productName) {
        if (productNameList.contains(productName)) {
            int existProductIndex = productNameList.indexOf(productName);
            return existProductIndex;
        }
        return -1;
    }

    public static int getProductInventory(String productName) {
        if (productNameList.contains(productName)) {
            int existProductIndex = productNameList.indexOf(productName);
            int inventory = Integer.
                    parseInt(productList.
                            get(existProductIndex).get(2));
            return inventory;
        }
        return -1;
    }

    public static int getProductPrice(String productName) {
        if (productNameList.contains(productName)) {
            int existProductIndex = productNameList.indexOf(productName);
            int price = Integer.
                    parseInt(productList.
                            get(existProductIndex).get(1));
            return price;
        }
        return -1;
    }
}
