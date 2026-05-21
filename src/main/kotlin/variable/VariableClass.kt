package main.kotlin.variable

class VariableClass(
    val name: String,
    val id: Int,
    val prices: Int,
    val model: String,
    val stock: String,

){
    fun showedAllTheInfoOfVariableClass(){
        println("===[Showed all he Info]===")
        println("Name : $name")
        println("ID : $id")
        println("Price : $prices")
        println("Model : $model")
        println("Stock : $stock")
    }
}

// main entry point
fun main(){

}

