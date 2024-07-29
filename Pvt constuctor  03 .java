class Product {
    private String name;

    private Product(String name) {
        this.name = name;
    }

    public static Product createProduct(String name) {
        return new Product(name);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "'}";
    }
}

public class Solution {
    public static void main(String[] args) {
        Product product = Product.createProduct("ExampleProduct");
        System.out.println(product);
    }

}
