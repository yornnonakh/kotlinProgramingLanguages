package main.kotlin.datatypes

import com.sun.net.httpserver.Authenticator

/*
    Types Unit (function)
 */


// main entry point
fun main(){
    requestNetwork(
        onProcess = {

        },
        onSuccess = {
            result ->
            println(result)
        },
        onFailure = {

        }
    )
}

// function return function
fun requestNetwork(
    onSuccess: (result: String) -> Unit,
    onProcess: () -> Unit,
    onFailure: () -> Unit
){
    val name = "Nona"
    onSuccess(ProductTypeCode.SAVING)

}

// function return Unit
fun sum(
    onSuccess: (result: String) -> Unit
) : Unit {

}

// function
object ProductTypeCode{
    // object properties
    const val DEPOSIT = "01"
    const val SAVING = "02"
    const val LOAN = "03"
}



