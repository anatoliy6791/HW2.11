package pro.sky.order.service;

import pro.sky.order.dto.Basket;
import pro.sky.order.dto.Product;

import java.util.List;

public interface ServiceProduct {
    Product add(int id);
    Basket get();
}
