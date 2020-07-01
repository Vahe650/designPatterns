package openClosePrincip.filter;

import openClosePrincip.Product;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter{
    public Stream<Product> filterByColor(List<Product> products, Product.Color color){
        return products.stream().filter(product -> product.color==color);

    }
    public Stream<Product> filterBySize(List<Product> products, Product.Size size){
        return products.stream().filter(product -> product.size==size);

    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Product.Size size, Product.Color color){
        return products.stream().filter(product -> product.size==size&& product.color==color);
    }
}