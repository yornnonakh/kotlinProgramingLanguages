package main.kotlin.controlFlow

/*
    Run if with mathematical Operator

 */

fun main(){
    // create variable
    val myMoney = 500.00
    val friendMoney = 100.00

    // create object
    val result = compareAndSum(myMoney = myMoney, friendMoney = friendMoney)
    println("The Result is : $result")
}

fun compareAndSum(myMoney: Double,friendMoney: Double): Double{
    if (myMoney > friendMoney){
        return myMoney - friendMoney
    }else if (myMoney < friendMoney){
        return friendMoney - myMoney
    }else{
        return myMoney + friendMoney
    }
}