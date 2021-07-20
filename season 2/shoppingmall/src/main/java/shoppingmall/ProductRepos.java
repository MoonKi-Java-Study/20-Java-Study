package shoppingmall;

import java.util.ArrayList;

public class ProductRepos {
    public static ArrayList<ArrayList<String>> productList = new ArrayList<ArrayList<String>>();

    public ProductRepos() {
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

        productList.add(data1);
        productList.add(data2);
        productList.add(data3);
    }
}
