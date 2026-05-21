package main.kotlin.array

fun main(){

    /*
        - How to prepare work interview as a junior developer
        - Introduce to your self
        - Programing concept
        - OOP
        - kotlin for android
        - framework (structure framework, lifecycle, Intent, Navigation)
        - Design Material UI 3 Expression
        - Count Material Component 10
        - The Interview could be asked about 10 Material Component that You answer
        - Design pattern
        - Architecture MVI, MVVM
     */

    // create an Array<Int> that initializes with zeros [0,0,0]
    // create variable read only cannot change the value
    val initArray = Array<Int>(3){0}
    //    println(initArray.joinToString())

    val simpleArray = arrayOf(1,2,3)
    val twoDArray = Array(2) { Array<Int>(2) {0} }
    // access the element and modifies it
    simpleArray[0] = 10
    twoDArray[0][0] = 2
    // println the modified element
    println(simpleArray[0].toString()) // 10
    println(twoDArray[0][0].toString()) // 2
}