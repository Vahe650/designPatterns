package openClosePrincip.specification;

import openClosePrincip.Product;
import openClosePrincip.interfaces.Specification;

public class SizeSpecification implements Specification<Product> {
    private Product.Size size;

    public SizeSpecification(Product.Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size==size;
    }
}