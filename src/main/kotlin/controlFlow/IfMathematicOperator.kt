package main.kotlin.controlFlow

/*
    Run if with mathematical Operator
    - Plus (+)
    - Subtract (-)
    - Multiply (*)
    - Divide (/)
    - Reminder (%)
 */

fun main(){

    val myMoney = 500.00
    val friendMoney = 100.00

    val resultOfPlus = comparePlus(myMoney, friendMoney)
    val resultOfMultiply = compareMultiply(myMoney, friendMoney)
    val resultOfDivider = compareDivider(myMoney, friendMoney)
    val resultOfReminder = compareReminder(myMoney,  friendMoney)
    val resultOfSubtract = compareSubtract(myMoney, friendMoney)

    println("Result Of Multiply : $resultOfMultiply")
    println("Result Of Divider : $resultOfDivider")
    println("Result Of Reminder is : $resultOfReminder")
    println("Result Of Plus is : $resultOfPlus")
    println("Result Of Subtract is : $resultOfSubtract")

    val resultOfSum = compareAndSum(myMoney = myMoney, friendMoney = friendMoney)
    println("The Result of Sum is : $resultOfSum")
}

fun compareAndSum(myMoney: Double,friendMoney: Double): Double{
    return if (myMoney > friendMoney){
        myMoney - friendMoney
    }else if (myMoney < friendMoney){
        friendMoney - myMoney
    }else{
        myMoney + friendMoney
    }
}

fun comparePlus(x: Double, y: Double): Double{
    return x + y
}
fun compareMultiply(x: Double, y: Double): Double{
    return x * y
}
fun compareDivider(a: Double, b: Double): Double{
    return a / b
}
fun compareReminder(x: Double, y: Double): Double{
    return x % y
}
fun compareSubtract(x: Double, y: Double): Double{
    return x - y
}
