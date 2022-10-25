package pro.sky.order.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.order.dto.Product;
import pro.sky.order.service.ServiceProduct;


import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final ServiceProduct serviceProduct;
    public OrderController(ServiceProduct serviceProduct) {
        this.serviceProduct=serviceProduct;
    }

    @GetMapping("/add")
    public Product addProduct(@RequestParam ("product") int id){
    return serviceProduct.add(id);
    }

    @GetMapping("/get")
    public List<Product> getProduct(){
        return serviceProduct.get();
    }

}
