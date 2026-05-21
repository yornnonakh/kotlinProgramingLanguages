package main.kotlin.array

import javax.imageio.ImageReadParam

/*
    How to create builtInArray In Kotlin
    How tousing array in kotlin programing
 */

fun main(){
    /*
        There are 2 Types of Array
        - Mutable Array => can change the index in array
        - Immutable Array => can't change the index in array
     */
    println("=====================")
    //    val intArray: List<Int> = listOf<Int>()
    val intArray = listOf<Int>(20)
    val stringArray: Array<String> = arrayOf<String>("String","ArrayOf")
    val studentArray = arrayOf<Int>(99)
    val productStudent = arrayOf<String>("Product Student")
    val stringArray1: Array<Int> = emptyArray<Int>() // emptyArray in kotlin
    val emptyList: List<Int> = emptyList() // emptyList equal = [null]
    emptyList.plus(2)
    println(emptyList)
    intArray.plus("Sting")
    println("--------------------------------")
    println(intArray.plus("ArrayInt"))
    println("You Can Add The number : ${stringArray1.plus(20).contentToString()}")
    println("Array The result : $intArray")
    println("===============================")

    val computerBranch: Array<String> = arrayOf("Apple", "Branch")
 }


