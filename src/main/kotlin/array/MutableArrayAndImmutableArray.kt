package main.kotlin.array

fun main(){

    /*
        Array There are 2 types
        - mutable Array ( Array that can add or remove element )
        - immutable Array ( Array that cannot remove or add element )
     */

    /*
        This is group of immutable array
     */


    val intArray: List<String> = listOf("listOfString")
    val emptyList: List<Int> = emptyList()
    val stringArray: Array<String> = emptyArray()

    /*
        This example of mutable array
     */

    var mutableArray: MutableList<Person> = mutableListOf<Person>(
        Person("Yorn", "Nona", 20, "38374674"),
        Person("Tola", "Jet", 21, "847393"),
        Person("Sa", "Vit", 20, "2938747984")

    )
    // mutable add
    mutableArray.add(
        Person("Vanna", "Van",30, "28574694" )
    )

    // create carList
    val carList: MutableList<String> = mutableListOf("Toyota", "Honda", "Masdar", "Prius" )

    // Honda is sold out
    carList.remove("Toyota")
    carList.remove("Masdar")

    // By new car BMW
    carList.add("BNW003")

    println(carList)
    // display Int fo of mutableArray
    println(mutableArray)

}
