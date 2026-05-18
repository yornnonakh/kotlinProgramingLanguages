package main.kotlin.string

class ClassString (
    // they call properties
    val name: String,
    val description: String,
    val selectSize: Int,
    var price: Int,
){
    fun showedTheClassString(){
        // display the info
        println("=====[Showed The Info]=====")
        println("Name : $name")
        println("Description : $description")
        println("SelectSize : $selectSize")
        println("Price : $price")
        println("===========================")
    }
}