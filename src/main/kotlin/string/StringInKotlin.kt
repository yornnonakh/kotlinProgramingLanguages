package main.kotlin.string

fun main(){

    val name: String = " Hello my name is Hala.\n" +
            "    I am a mobile developer that can working on both android and ios "
    println(name)

    // Multiline String
    println("-----------------------------------------------------")
    val text = """
        Hello my name is Hala.
    I am a mobile developer that can working on both android and ios 
    """.trimIndent()

    val balance = 100.0
    val accountNo: String = "1234567"
    val notificationTitle = "You received $balance USD from account $accountNo"
    val description = """
            You received $balance USD from account 12345678
    """.trimIndent()

    println(description.lowercase())
    println(description.trimIndent().uppercase())
    println(notificationTitle.lowercase().length)

    // calling the class
    val classString = ClassString(
        "Sabar",
        "popular",
        45,
        200
    )
    // calling the method
    classString.showedTheClassString()
}