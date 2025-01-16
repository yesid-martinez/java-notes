package memory;

public class Product {
    public double price;

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public void manageProduct(){
        Product fProduct = new Product();
        System.out.println("Product: " + fProduct);
        double fPrice = fProduct.getPrice();
        System.out.println("First price: " + fPrice);
        double sPrice = changePrice(fProduct);
        System.out.println("Second price: " + sPrice);
    }

    /*
     In Java, objects are passed by reference, but what is actually passed is a copy (stack address) of the object in the heap.
     is a copy of the reference (stack address) to the object on the heap.
     This means that within the 'changePrice' method, changes made to the 'productRef' object affect the original object because both point to the original object.
     the 'productRef' object affect the original object because both point to the same memory space (on the heap).
     memory space (on the heap).
    */

    public double changePrice(Product productRef){
        productRef.setPrice(3.99);
        return productRef.getPrice();
    }
}
