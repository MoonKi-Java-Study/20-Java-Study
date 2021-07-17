import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public Test() {
        ArrayList<ArrayList<String>> productList = new ArrayList<ArrayList<String>>();

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


        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("상품명 : %-10s  가격 : %s원  재고/수량 : %s개\n", productList.get(i).get(0), productList.get(i).get(1), productList.get(i).get(2));

        }

        /*for (ArrayList<String> data : productList) {
            System.out.println(data);
            System.out.println(data.getClass().getName());


        }*/
    }


    /*@org.junit.jupiter.api.Test
    public void showProduct(ArrayList<String> product) {
        System.out.printf("상품명 : %s  가격 : %30d원  재고/수량 : %d개\n", product[0], product[1], product[2]);
    }*/

    @org.junit.jupiter.api.Test
    public void show() {
        //Test test = new Test();

    }
}
