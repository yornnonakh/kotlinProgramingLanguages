package main.kotlin.array

// main function or entry point

fun main(){
    // create variable to store data in array
    val users = arrayOf(
        "admin",
        "teacher",
        "student",
    )
    val loginUser = "teacher"
    var found = false

    // using for loop
    for (user in users){
        if (user == loginUser){
            found = true
            break
        }
    }
    // using condition
    if (found){
        println("Login success")
    } else{
        println("User Not Found")
    }
}