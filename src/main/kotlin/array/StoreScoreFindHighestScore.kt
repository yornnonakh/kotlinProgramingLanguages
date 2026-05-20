package main.kotlin.array

// create main function
fun main(){
    // create variable that to store data in array Sizeof
    val scores = arrayOf(
        75,85,99,80,79
    )
    // create new properties
    var highest = scores[0]

    // using condition for loop
    for (score in scores){
        // condition over here
        if (score > highest){
            highest = score
        }
    }
    // display info
    println("Highest Score : $highest")
}