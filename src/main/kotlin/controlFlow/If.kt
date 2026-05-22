package main.kotlin.controlFlow

/*
    If Expression
    else key word
    - return
 */
fun main(){
    // create field and properties
    val isAbsent = false
    var myPosition = ""
    val isOpenClassOnline = false

    // condition or if else
    if (isOpenClassOnline){
        myPosition = "I Will Be come a Teacher"
    }else{
        myPosition = "I am a content Creator "
    }
    println(myPosition)

    val result: String = checkAbsent(value = isAbsent)
    // call the function
    checkAbsent(isAbsent)
    println("Result is : $result")
}

    // function
    fun checkAbsent(value: Boolean): String{
        if (value){
            println("Condition has been terminated")
            return "Student is Absent"
        }
        return "Student is Not Absent"
    }