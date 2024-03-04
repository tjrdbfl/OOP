package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductView {
    public static void main(String[] args) {
        UtilService util = UtilServiceImpl.getInstance();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            products.add(Product.builder()
                    .pno(i)
                    .name("상품" + i)
                    .company(util.createRandomCompany())
                    .price(util.createRandomInteger(1000, 10000))
                    .build());
        }

        for (Product i : products) {
            System.out.println(i.toString());
        }
    }
}
