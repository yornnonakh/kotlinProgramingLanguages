package main.kotlin.array

// create product inventory system

// main function
fun main(){
    // create variable to store data in array
    val products = arrayOf(
        "Keyboard",
        "Mouse",
        "Monitor",
        "Laptop"
    )
    // display info
    println("Available All Product")
    // using condition for loop
    for (index in products.indices){
        println("${index + 1}. ${products[index]}")
    }
}
