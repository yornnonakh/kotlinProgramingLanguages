package main.kotlin.function

    /*
        Meaning Of The Function
        In Kotlin a function is a
        block of reusable code that performs a specific task.
        Basic Syntax
        - fun keyword to declare a function
        - functionName the name you give to the function
        - parameters input values (option)
        - return type the types of value the function
        - give back (option);
        - return sends the result back to the caller
     */
fun main(){
    // create object
    val greetingTheResult = greetingUser("Nona")
        println("The Result Of Greeting is : $greetingTheResult")
    // create object
    val result = sum(10,20)
        println("The Result Of Sum is : $result")

    // create object
    val resultOfTheEvenOdd = checkEvenOdd(7)
    println("The Result Of The Even Odd is: $resultOfTheEvenOdd")

        // create object
    val resultOfTheEvenAndOdd = checkEvenAndOdd(8)
    println("The Result Of The Even And Odd is : $resultOfTheEvenAndOdd")

    // create object of maxOfNumber
    val largest = findMax(10,20,9)
    println("The Result Of The Largest Number is : $largest")

    // create object rectangleArea
    val area = rectangleArea(8.9,8.0)
    println("The Result of RectangleArea is : $area")
}

// greeting function
fun greetingUser(name: String){
    println("Hello, $name Welcome to Kotlin Programing")
}
// sum of two number
fun sum(num1: Int, num2: Int): Int{
    return num1 + num2
}
// check even or odd
fun checkEvenOdd(number: Int){
    if (number % 2 == 0){
        println("Even Number")
    } else {
        println("Odd Number ")
    }
}
// check even and odd
fun checkEvenAndOdd(number2: Int): String{
    // when expression
    return if (number2 % 2 == 0) "Even Number"
    else "Odd Number"
}
// find largest number
fun findMax(a: Int, b: Int, c: Int): Int{
    return maxOf(a, b, c)
}
// rectangle area function
fun rectangleArea(length: Double, width: Double): Double{
    return length * width
}