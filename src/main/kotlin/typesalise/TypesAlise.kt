package main.kotlin.typesalise

import main.kotlin.datatypes.requestNetwork
import kotlin.Boolean
import kotlin.String

// types alise
typealias Text = String
typealias Number = Int
typealias NetWorkResult = (Boolean, String, String, String) -> Unit
typealias Person = List<String>
typealias RequestApi = (NetWorkResult)

fun main(){

    val text: Text = "Welcome to Types Alise"
    val age: Number = 19

    // variable of list
    val people: Person = listOf("A", "B", "C")
    println("The result : $")

    requestApi{

        status, message, errorCode, errorMessage -> Unit
    }
    requestApi (
        onResult = { status, message, errorCode, errorMessage ->  Unit
            println(status)
            println(message)
            println(errorCode)
            println(errorMessage)
        }
    )
}
fun requestApi(
    onResult: NetWorkResult,

)
{
    // starting requested to the server
    onResult(
        true,
        "System Successfully",
        "Error Code ",
        "Messages Code",
    )
}
