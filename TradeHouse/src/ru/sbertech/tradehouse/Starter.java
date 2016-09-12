package ru.sbertech.tradehouse;

import ru.sbertech.tradehouse.business.CustomerManager;
import ru.sbertech.tradehouse.business.ProductManager;
import ru.sbertech.tradehouse.dao.*;
import ru.sbertech.tradehouse.domain.Customer;
import ru.sbertech.tradehouse.domain.HiTechProduct;
import ru.sbertech.tradehouse.domain.Product;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by anton on 8/29/16.
 */
public class Starter
{
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        ProductDao dao = new ProductDaoFake2();
        pm.setDao(dao);

        for(int i=0; i<10; i++) {
            Product product = new Product();
            product.setProductName("ProductName 0" + i);
            pm.addProduct(product);
        }

        List<Product> result = pm.findProduct();
        for(Product p : result) {
            System.out.println(p.getProductName());
        }

//        CustomerManager cm = new CustomerManager();
//        CustomerDao daoCm = new CustomerDaoImpl();
//        cm.setDao(daoCm);
//        cm.addCustomer(new Customer());

//        Product p = new Product();
//        p.setProductId(99L);
//        p.setProductName("TestProduct_01");
//
//        System.out.println(p);
//
//        Product p1 = new Product();
//        p1.setProductId(199L);
//        p1.setProductName("SuperTestProduct_01");
//        System.out.println(p1);
//
//        Product htp = new HiTechProduct();
//
//        htp.setProductId(888L);
//        htp.setProductName("HiTech Name Product");
//        htp.setPower(120.0);
//        System.out.println(htp.toString());

    }
}
