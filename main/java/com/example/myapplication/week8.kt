package com.example.myapplication

// user defined function

fun show(a: Int, b:Int): Unit {
    println(" You entered $a and $b")
}


fun add(a: Int, b:Int): Int{
    var sum =0
    sum = a+b
    return sum
}

fun findMInimumNumber(a: Int, b: Int): Int{
    var minimum = 0
    if (a>b) {
        minimum = b

    }
    else{
        minimum = a
    }
    return minimum
}

fun main(){
    println("enter first number: ")
    var a: Int = readln()!!.toInt()
    println("enter the second number")
    var b: Int = readln()!!.toInt()
    show(a, b)
    var sum = add (a, b)
    println("sum of the two numbers entered is $sum")
    var minimum = findMInimumNumber(a,b)
    println(" And the smallest between $a and $b is $minimum")
}