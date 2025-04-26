package com.example.myapplication

import androidx.compose.animation.scaleOut

fun displayList(){
    val numbers : List<String> = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\"${numbers.indexOf("two")}")
    println("hi")
}
fun set(){
    val numbers = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }
    val numbersBackwards= setOf(4,3,2,1)
    println("The set are equal: ${numbers == numbersBackwards}")
}
fun map() {
////map
//a map <k, v> stores key-values pairs (or entries);
//key are unique but different keys can be paired with equal values
// the map interface provides specific functions, such as access to value by key,
//searching keys and values and so on.
    val countriesCapital= mapOf(
        "Nepal " to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Dehli"
    )
    println("All keys: ${ countriesCapital.keys}")
    println("All values: ${countriesCapital.values}")
    println("the capital of china is : ${countriesCapital["China"]}")





}
fun immutable(){
    // immutable map
    val studentMarks = mapOf(
        "ram" to 45,
        "hari" to 30,
        "shyam" to 45,
        "gita" to 50,
    )
    println("Enter student name: ")
    val input: String =readln(). lowercase()
    println(studentMarks[input])
}
fun mutable(){
    //mutable map
    val studentsMarks= mutableMapOf(
        "ram" to 45,
        "hari" to 50,
        "gita" to 55,
        "sita" to 90,
    )
    studentsMarks["ram"] = 60
    studentsMarks.put("shyam", 80)
    println("enter studnet name: ")
    val input: String = readln().lowercase()
    println(studentsMarks[input])
}



fun task(){

    //Create a Dictionary app using mapOf() function
// where user will type a word and your program should
// return the meaning of that word.
    val dictionary= mutableMapOf(
        "eat" to "put (food) into the mouth and chew and swallow it.",
        "drink" to "take (a liquid) into the mouth and swallow.",

    )
    println("enter the words (drink and eat only): ")
    val input: String = readln().lowercase()
    println(dictionary[input])
}




fun main(){
    displayList()
    // mutable and immutable list
    // kotlin has 2 types of list
//    1. mutable (which cannot be modified)
//    2. immutable ( can be modified)
    val lst= listOf("one", "two", "three")
    println("mutable list")
    for (i in lst.indices){
        println(lst[i])
    }
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
    set()
    map()
    mutable()
    immutable()
    task()

}