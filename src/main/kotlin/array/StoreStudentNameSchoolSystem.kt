package main.kotlin.array

fun main(){

    // crate array = arrayOf
    val students = arrayOf(
        "Dara",
        "Nona",
        "Nita",
        "Vanna",
        "Nita"
    )
    println("Student List: ")

    // using for loop
    for (student in students)
    {
        print(student)
    }
}
