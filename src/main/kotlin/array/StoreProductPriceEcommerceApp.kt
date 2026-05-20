package main.kotlin.array

fun main(){
    // create variable that store the arraySize
    val productPrices = arrayOf(
        10.5,20.0,
        15.75,
        8.99
    )
    // display Info
    println("Product Price: ")
    // using for loop
    for (price in productPrices){
        println("$$price")
    }
}