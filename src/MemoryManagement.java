public class MemoryManagement {
    public static void memoryExample() {
        short a = 25;
        Product product = new Product();
        System.out.println("Main product: " + product);
        // Output: Product@7b23ec81 (Unique memory address of the object)
        /* La variable product (almacenada en el stack) contiene/apunta-hacia la dirección en
         memoria de la clase Product la cual se encuentra almacenada en el heap */

        /* Identification: Each object must have a unique way of being identified in memory so that it can be effectively accessed and manipulated.

           Comparison: Memory address is a way to compare whether two variables refer to the same object.

           Debugging: It can be useful for tracing and debugging problems in your code, as it lets you know which specific object is being referenced. */

        product.manageProduct();
    }
}


