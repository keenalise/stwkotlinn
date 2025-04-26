package com.example.myapplication

fun main(){
    println("hello world")
    //mutable variable : can be changed
    var firstName="Prajwal"
    var lastName="Bhandari"
    println("$firstName $lastName")
    println("${firstName.length} $lastName")

    var name: String ="Prajwal" // type of variable name: datatype
    println(name)

    val age : Int =10
    println(age)

    /*var address = arrayOf("ktm", "Pokhara", "Bhaktapur")
    address[3]= "lalitpur"
    println(address[3]) // error
*/
    var data = ArrayList<Any>()
    data.add(2)
    data.add(1)
    data.add("ram")
    println((data))

    var address = arrayListOf("ktm", "chitwan")
    address.add("Pokhara")
    println((address))

    var dictionary = mapOf(
        "Apple" to "This is fruit",
        "samsung" to " this is a brand"

    )

    println("The value of Apple is $dictionary")



    for(i in 0..5){
        println(i)
    }
    fun calculate(a:Int, b:Int) : Unit{

    }

    var x: Double =132.22
    var y: Int = 9
    var z: Byte= y.toByte()

}