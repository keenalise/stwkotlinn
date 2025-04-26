package com.example.myapplication

import androidx.compose.animation.scaleOut
import androidx.compose.ui.text.toUpperCase

fun main(args: Array<String>){
    print("Hello World");

    //mutable
    // we can re assign values to mutable variables
    var age= 20;

    age= 25;

    //immutable
    // we cannot re assign values to immutable variablees
    val roll= 15
//    roll=10
    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte= 12
    var d: Short= -324
    var e: Int = 7
    var f: Long = -57565
    var i: Float =  7.7F
    var h: Double = 7.7779
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    // type conversion in Kotlin
    // to convert to byte -> toByte()
    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)

    // length of the string
    var p: String = "hello World"
    var q: Int= p.length
    var r: Boolean= a.equals("Hello World")
    var username: String =" Softwarica"
    println(username.trim())
    println(x)
    println(y)
    println(p.isEmpty())
    println(p.lowercase())
    println(p.uppercase())
    println(r)
    print(p.plus(",How are you?"));









}