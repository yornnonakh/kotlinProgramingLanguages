package main.kotlin.array

fun main(){
    /*
        There are 2 types of array in kotlin
        - mutable array (Array that can add or remove element)
        - immutable array (Array that cannot remove or add element)
     */
    // Creates an array with values [null, null, null]
    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    // null, null, null
    // create object to calling the function
    val showedInformation = ShowedInformation()
    showedInformation.name
    var mutableArray: MutableList<Person> = mutableListOf<Person>()
        Person("Born", "Nona", 20,"297393")

    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    println("Showed ListOfArray $mutableArray")
    println("Showed The Info: ")
    mutableArray.add(
        Person(
            id = "29284",
            firstName =  "Born",
            lastName = "Nona",
            age = 20

        )
    )
    println(mutableArray)


    // Using the += assignment operation creates a new riversArray,
    // copies over the original elements and adds "Mississippi"

    riversArray += "Mississippi"
    println(riversArray.joinToString())
    // Nile, Amazon, Yangtze, Mississippi

    val simpleArray = arrayOf(1, 2, 3)
    val twoDArray = Array(2) { Array<Int>(2) { 0 } }

    // Accesses the element and modifies it
    simpleArray[0] = 10
    twoDArray[0][0] = 2

    // Prints the modified element
    println(simpleArray[0].toString()) // 10
    println(twoDArray[0][0].toString()) // 2
    // create mutableList Array[Dynamic size]
    // create variable array
    val names = mutableListOf(
        "Dara"
        ,"Nona"
    )
    // add the item in to array
    names.add("Tola")
    names.remove("Dara")

    // output println
    println("Display All Info Of Mutable Array")
    println("All Name In List : $names")

}

class ShowedInformation{
    var name: String = "Welcome to kotlin"
}

    // create data class
data class Person(
        // data member or field
    val firstName: String,
    val lastName: String,
    val age: Int,
    val id: String,
)