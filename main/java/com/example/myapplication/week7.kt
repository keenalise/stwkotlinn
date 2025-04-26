package com.example.myapplication
import kotlin.random.Random
fun controlFlowStatement() {
    println("P)lease enter a number")

    var number: Any = readln()!!.toInt()

    if (number.toString().toInt() % 2 == 0) {
        println("$number is even")

    } else {
        println("$number is odd")
    }
}

fun ladder(){
    println("Please enter your age: ")
    var yourAge: Int = readln()!!.toInt()
    if(yourAge < 13){
        println("You area child")
    }
    else if (yourAge<19){
        println("teenager")
    }
    else{
        if(yourAge<50){
            print("You a adult")
        }
        else{
            print("Senior")
        }
    }
}

fun nested(){
    println("please enter 3 numbers")
    var number1: Int= readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int
    if (number1>=number2){
        if(number1>=number3){
            largestNumber = number1
        } else{
            largestNumber = number3
        }
    } else{
        if (number2 >= number3){
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }
    println("the largest number is $largestNumber")
}

fun whenStatement(){
    println("Please enter a day of the week: ")
    var dayNumber: Int = readln()!!.toInt()
    var day: String
    when (dayNumber)
    {
        1 -> day ="sunday"
        2 -> day ="MOnday"
        3 -> day = "tuesday"
        4 -> day = "Wednesday"
        5 -> day = "thursday"
        6 -> day = "friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }
    println(day)
}

fun forloop(){
    for(i in 1.. 9 ){
        println(i)
    }

    println()
    var summ:Int = 0
    for(x in 0..9){
        println(x)
        summ +=x // sum = sum +x
    }

    println("----------")
    println()
    var sum : Int = 0
    for (x in 0..10){
        if (x %2 ==0){
            println(x)
            sum +=x // sum = sum +x
        }
    }
    println(" the sum of even number is $sum")



    var vehicle = arrayListOf<String>("Tata", "kia", "Hyundai", "MG")
    for(y in vehicle.indices){
        println("The value in $y index is: "+vehicle[y])
    }

}

fun forEachLoop(){
    var vehicle = arrayListOf<String>("Tata", "kia", "Hyundai", "MG" )
    vehicle.forEach {
        println(it)
    }

}

fun whileLoop(){
    var i: Int=0;
    while (i<5){
        println(i)
        i++
    }
}

fun whileFact(){
    var k =1
    var fact=1
    while(k<6){
        fact *=k;
        println("$k! = $fact")
        k++
    }
}

fun whileInfinite(){
    var number = Random.nextInt(0, 10000)
    println("Please enter any number from 0 to 10000: ")
    while (2>1){
        var userGuess:Int = readln()!!.toInt()
        if (userGuess == number){
            println(" yo won")
            break;
        }
        else if (userGuess<number){
            println("increase the guess")

        }
        else{
            println("Decrease your guess")
        }
    }
}

fun dowhile(){
    var number = 1
    do {
        println(number)
        number++
    }
        while (number <=15)
}

fun main(){
    controlFlowStatement()
    ladder()
    nested()
    whenStatement()
    forloop()
    forEachLoop()
    whileLoop()
    whileFact()
    whileInfinite()
    dowhile()
}