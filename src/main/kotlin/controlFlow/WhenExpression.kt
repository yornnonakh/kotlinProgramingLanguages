package main.kotlin.controlFlow

/*
    In Programing
 */
fun main(){

    val dayCode = 1
    val day = convertDay(dayCode)
    println("The Result is : $day")
}
fun convertDay(value: Int): String{
    return when(value){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "No Invalid"
    }
}
fun sample(){

}