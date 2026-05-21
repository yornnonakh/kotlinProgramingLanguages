package main.kotlin.oop

import java.time.Year

fun main(){
    // How to create before work interview
    // create object to calling the method
    val car = Car(
        "Toyota",
        "Camery",
        "V5",
        2026,
        40.0000f
    )
    // calling the function
    car.showedAllCarInfo()
}
// create class for example

class Car(
    // create field
    val name: String,
    val model: String,
    val engine: String,
    val year: Int,
    val price: Float,
){
    // create method
    fun showedAllCarInfo(){
        println("Information of Car")
        println("Name : $name")
        println("Model : $model")
        println("Engine : $engine")
        println("Year : $year")
        println("Price : $price")
        println("==================")
    }
}