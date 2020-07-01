package openClosePrincip.specification;

import openClosePrincip.Product;
import openClosePrincip.interfaces.Specification;

public class ColorSpecification implements Specification<Product> {
    private Product.Color color;

    public ColorSpecification(Product.Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color==color;
    }
}