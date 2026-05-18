package main.kotlin.variable

import kotlin.math.min

fun main(){

    // create variable using val only value can't change
    val name: String = "Nona"
    val age: Int = 20
    val price: Double = 0.400
    val gender: Char = 'M'
    val isStudent: Boolean = true
    val score: Float = 100.0f
    // How to display all variable
    println("=======[Showed All The Value]==========")
    println("Name $name")
    println("Age : $age")
    println("Price :$price")
    println("Gender : $gender")
    println("IsStudent : $isStudent")
    println("Score : $score")
    println("========================================")

    val minMax: Int = 128
    println(minMax)
}