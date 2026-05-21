package main.kotlin.variable

import org.w3c.dom.css.Counter

/*
    main entry point
     There are two types of variable in kotlin
    - val (Immutable)
    - var (mutable)
 */

fun main(){
    // field or properties
    val accountNumber: String = "56780987" // immutable cannot reassign the value
    var accountType: String = "Saving" // mutable can reassign the value
    val computer: String = "MacBook Pro"
    var price: Double = 1500.00  // var can reassign the value

    /*
        Immutable Variable
     */

    price = 200.00
    val stringVariable: String = ""
    val intVariable: Int = 20
    val byteVariable: Byte = 12
    val shortVariable: Short = 132
    val longVariable = 678934
    val student: Int = 30
    val coursePrice: Double = 10.90
    val totalIncome = calculator(studentCounter = student, coursePrice = price)

    // call the return function
    val score = 90
    var grade: Char
    // using condition
    if (score >= 90 && score <= 100){
       grade = 'A'
    }else if (score > 80 && score <= 90){
        grade = 'B'
    }else if (score > 70 && score <= 80 ){
        grade = 'C'
    }else if (score > 60 && score <= 70){
        grade = 'D'
    }else{
        grade = 'F'
    }
    println("=====[Showed All The Info]=====")
    println("Your Score is : $score")
    println("Total : $totalIncome")
    println("Account Types : $accountType")
    println("===============================")

//    accountNumber = ""
//    accountType = "Deposit Money "

}
// create function
fun calculator(studentCounter: Int, coursePrice: Double ): Double{
    return studentCounter * coursePrice
}

// create object
object Computer {
    // convention uppercase
    const val APPLE = "MacBook Pro"
}
