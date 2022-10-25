package pro.sky.order.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Product> basket = new ArrayList<>();

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public Basket() {

    }

    public Product put(Product product) {
        basket.add(product);
        return product;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
