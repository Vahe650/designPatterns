package openClosePrincip;

import openClosePrincip.filter.BetterFilter;
import openClosePrincip.filter.ProductFilter;
import openClosePrincip.specification.AndSpecification;
import openClosePrincip.specification.ColorSpecification;
import openClosePrincip.specification.SizeSpecification;

import java.util.Arrays;
import java.util.List;

class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Product.Color.GREEN, Product.Size.SMALL);
        Product tree = new Product("Tree", Product.Color.GREEN, Product.Size.LARGE);
        Product house = new Product("House", Product.Color.BLUE, Product.Size.LARGE);
        List<Product> products = Arrays.asList(apple, tree, house);
        ProductFilter productFilter = new ProductFilter();
        System.out.println("green products (old):");
        productFilter.filterByColor(products, Product.Color.GREEN).forEach(product ->
                System.out.println(product.name + " is green"));

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("green products (new):");
        betterFilter.filter(products, new ColorSpecification(Product.Color.GREEN)).forEach(product ->
                System.out.println(product.name + " is green"));

        System.out.println("Large blue items:");
        betterFilter.filter(products,new AndSpecification<>(
                new ColorSpecification(Product.Color.BLUE),
                new SizeSpecification(Product.Size.LARGE)
        )).forEach(product -> System.out.println(" - "+product.name+ " is large and blue"));

    }
}
