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
    val car: String
    val motor: String
    val iphone: Boolean
    val android: Boolean

    val macBook: Boolean
    val window: Boolean

    println(showedPowerOfCarAndMoto(car = true, motor = false))

    val resultOfIphoneAndAndroid = showedTheInfoOfIphoneAndAndroidPrice(iphone = false, android = true)
    val resultOfMacBookAndWindow = compareComputerItemBetweenMacbookAndWinDown(macBook = true, window = false)
    val resultOfPlus = comparePlus(myMoney, friendMoney)
    val resultOfMultiply = compareMultiply(myMoney, friendMoney)
    val resultOfDivider = compareDivider(myMoney, friendMoney)
    val resultOfReminder = compareReminder(myMoney,  friendMoney)
    val resultOfSubtract = compareSubtract(myMoney, friendMoney)

    println("=============[Showed All the Result of All the item]==========")
    println("Result of MacBook And Window is $resultOfMacBookAndWindow")
    println("Result of IPhone And Android is : $resultOfIphoneAndAndroid")
    println("Result Of Multiply : $resultOfMultiply")
    println("Result Of Divider : $resultOfDivider")
    println("Result Of Reminder is : $resultOfReminder")
    println("Result Of Plus is : $resultOfPlus")
    println("Result Of Subtract is : $resultOfSubtract")
    println("==============================================================")

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

fun showedPowerOfCarAndMoto(car: Boolean, motor: Boolean): String{
    return if (car > motor) "Car is faster then motor"
    else "motor is slower then car"
}
fun showedTheInfoOfIphoneAndAndroidPrice(iphone: Boolean, android: Boolean): String{
    return if (iphone > android) "I Phone is more expensive than android"
    else "All the iPhone and android are the same expensive"
}
fun compareComputerItemBetweenMacbookAndWinDown(macBook: Boolean, window: Boolean): String{
    return if(macBook > window) "This product is more expensive"
    else "All The Product has Been Sold"
}