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
    println("Total : $totalIncome")

    // call the return function



//    accountNumber = ""
//    accountType = "Deposit Money "

    println("Account Types : $accountType")
}

// create function

fun calculator(studentCounter: Int, coursePrice: Double ): Double{
    return studentCounter * coursePrice
}
