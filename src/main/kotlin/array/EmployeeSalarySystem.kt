package main.kotlin.array

// main function
fun main(){
    // crate variable that store array size
    val salaries = arrayOf(
        500.0,
        700.0,
        1200.0,
        900.0
    )
    // create new variable
    var totalSalary = 0.0
    // using loop
    for (salary in salaries){
        totalSalary += salary
    }
    println("Total Salary: $$totalSalary")
}