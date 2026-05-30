class Product(
    private val id: Int,
    private val name: String,
    private val price: Double,
    private val quantity: Int
) {

    // Function to display product information
    fun showProduct() {
        println("Product ID: $id")
        println("Product Name: $name")
        println("Price: $$price")
        println("Quantity: $quantity")
        println("------------------------")
    }
}

class ProductsClass {

    // Create list to store products
    private val productList = mutableListOf<Product>()

    // Add product function
    fun addProduct(product: Product) {
        productList.add(product)
    }

    // Show all products function
    fun showAllProducts() {
        if (productList.isEmpty()) {
            println("No products found!")
            return
        }

        println("===== Product List =====")

        for (product in productList) {
            product.showProduct()
        }
    }
}

fun main() {

    // Create ProductsClass object
    val store = ProductsClass()
    // Add products
    store.addProduct(Product(1, "MacBook Pro", 2499.99, 5))
    store.addProduct(Product(2, "iPhone 17", 1299.99, 10))
    store.addProduct(Product(3, "Keyboard", 79.99, 20))
    store.addProduct(Product(4, "Mouse", 49.99, 15))

    // Show all products
    store.showAllProducts()
}