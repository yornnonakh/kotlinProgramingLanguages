package main.kotlin.oop

 /*
    create product of this store
  */
 fun main(){

     // create objects
     val showedCase = ProductShowedCase(
         "Shose",
         "Nike",
         345,
         343,
         200.99
     )
     println("Showed All The products : ${showedCase.showedAllTheProductShowedCase()}")
 }

class Product {
    // create properties
    val dell:  String = "Dell"
    val asus: String = "Asus"
}

class ProductShowedCase(
    val name: String,
    val model: String,
    val code: Int,
    val id: Int,
    val price: Double,
)
{
    // create method
    fun showedAllTheProductShowedCase(){
        println("============[Showed All The Products Display ]==============")
        println("Name : $name")
        println("Model : $model")
        println("Code : $code")
        println("ID : $id")
        println("Price : $price")
        println("==============================================================")
    }
}
