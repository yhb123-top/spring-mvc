package top.yhb123.springmvc.service;

import top.yhb123.springmvc.domain.Product;

public interface ProductService {
    Product add(Product product);

    Product get(long id);
}
