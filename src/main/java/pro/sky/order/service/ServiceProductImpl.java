package pro.sky.order.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.order.dto.Basket;
import pro.sky.order.dto.Product;


import javax.annotation.Resource;
import java.util.ArrayList;


@Service
public class ServiceProductImpl implements ServiceProduct {
    @Resource(name = "sessionBasket")
    Basket basket;
    @Override
    public Product add(int id) {
        Product product = new Product(id);
        basket.put(product);
        return product;
    }

    @Override
    public Basket get() {
        return basket;
    }
    @Bean
    @SessionScope
    public Basket sessionBasket() {
        return new Basket();
    }
}
