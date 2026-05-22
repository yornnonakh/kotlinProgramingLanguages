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
    myPosition = if (isOpenClassOnline){
        "I Will Be come a Teacher"
    }else{
        "I am a content Creator "
    }
    val result: String = checkAbsent(value = isAbsent)
    // call the function
    checkAbsent(isAbsent)
    // Display All The Info
    println(myPosition)
    println("Result is : $result")

    val dayTypeCode = "06"
    val day = convertCodeToDay(
        dayTypeCode
    )

    // create ProductCheckoutStatus
    // create properties
    // var isSell = false
    // How to call the function
    val checkout = productCheckoutStatus(false)
    println(" => The Result : $checkout")

    val accountCodeList: List<String> = listOf("01", "02", "03", "04", "05")
    // using for loop
    for (item in accountCodeList){
        val accountName = convertBankAccountName(item)
        println("Account Types Code : $item is Converted to $accountName")
    }

    println(day)

}

    // function
    fun checkAbsent(value: Boolean): String{
        if (value){
            println("Condition has been terminated")
            return "Student is Absent"
        }
        return "Student is Not Absent"
    }

/*
    01 -> Monday
    02 -> Tuesday
    03 -> Wednesday
    04 -> Thursday
    05 -> Friday
    06 -> Saturday
    07 -> Sunday
    08 -> else Invalid
 */
fun convertCodeToDay(code: String): String {
    when (code) {
        "01" -> {
            return "Monday"
        }
        "02" -> {
            return "Tuesday"
        }
        "03" -> {
            return "Wednesday"
        }
        "04" -> {
            return "Thursday"
        }
        "05" -> {
            return "Friday"
        }
        "06" -> {
            return "Saturday"
        }
        "07" -> {
            return "Sunday"
        }
        else -> {
            return "In Valid Day"
        }
    }
}

// create function
fun productCheckoutStatus(isSell: Boolean): String{
    // using return function
    return if(isSell) "Product Was Sold Out" else "Product Has InStock"
}


/*
    Account types
    01: Digital Account
    02: Fixed Account
    03: Unfixed Account
    04: Saving Account
 */
//fun convertBankAccountName(accountTypCode: String): String {
//    return if (accountTypCode == "01") "Digital Account"
//    else if (accountTypCode == "02") "Fixed Account"
//    else if (accountTypCode == "03") "UnFixed Account"
//    else if (accountTypCode == "04") "Saving Account"
//    else "AccountTypeCode is Not Valid"
//}

fun convertBankAccountName(accountTypCode: String): String {
    return when (accountTypCode) {
        "01" -> "Digital Account"
        "02" -> "Fixed Account"
        "03" -> "UnFixed Account"
        "04" -> "Saving Account"
        else -> "AccountTypeCode is Not Valid"
    }
}