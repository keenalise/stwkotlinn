package com.example.myapplication

import androidx.compose.animation.scaleOut

fun arithmetic(){
    var num1: Double=10.6
    var num2: Double=5.0
    var result: Double= 0.0

    result= num1+num2
    println("num1 + num2 is $result")

    result=num1-num2
    println("num1 - num2 is $result")

    result=num1*num2
    println("num1 * num2 is $result")

    result=num1/num2
    println("num1 / num2 is $result")

    result = num1%num2
    println("num1 % num2 is $result")


}
fun assignment(){
    var x: Int =20
    var y: Int = 10
    var z: Int =0

    z=x+y
    println("z=x+y=$z")

    z+=x
    println("z+=x=$z")

    z-=x
    println("z -=x=$z")

    z*=x
    println("z *=x =$z")

    z/=x
    println("z/=x=$z")

    z%=x
    println("z%=x=$z")


}
fun unaryOperator(){
    var number: Double=7.6
    println("+number= ${+number}");
    println("-number= ${-number}");
    println("++number= ${++number}");
    println("--number= ${--number}");
//    println("!isCheck= ${!isCheck}");
    println("----------------------------")
    var result: Double = 4.7
    println("result: $result")
    //when the result++ is executed, the original value is evacuated first
    // and value of the result is increased only after that
    println(" result ++ : "+result++)


}

fun equalityAndRelationalOperators(){
    var a: Int =5
    var b:Int =5
    println("a ==b : "+(a==b))
    println("a !=b : "+(a!=b))
    println("a < b : "+(a<b))
    println("a > b : "+(a>b))
    println("a <= b : "+(a<=b))
    println("a >= b : "+(a>=b))
}

fun conditionalOperators(){
    var number1: Int =5
    var number2: Int=8
    var number3: Int=12
    var result:Boolean= false;

    //conditional operator(&&)
    result = (number1 > number2 ) && (number3 > number2)
    println(result)

    //conditional operator (||)
    result = (number1 > number2) || (number3 > number2)
    println(result)
}

fun OperatorPrecedence(){
    var result: Int = 5+2*4
    println("Result = "+result)
    result =(5+2)*4
    println("Result =" +result)
    var x: Int =8;
    var y: Int =4;
    var z: Int=2;
    var sum:Int=0;
    sum = x + --y + --z
    println("x+ --y + --z::: $sum")

}
fun rangeTo(){
    var myCharRange = 'a'.rangeTo( 'j')
    var testCharRange = 'a'..'j'

    var check= 'Z' in testCharRange
    println("mycharRange has Z: $check")
    println(myCharRange)
    println(testCharRange)
}

fun consoleInput(){
    println("Enter name: ")
    var name: String? = readln();

    // the data user input is always a String so,
    //type conversion for data type other than String
    println("Enter the age: ")
    var age: Int = readln() !!.toInt();

}


fun main(){
    arithmetic()
    assignment()
    unaryOperator()
    equalityAndRelationalOperators()
    conditionalOperators()
    OperatorPrecedence()
    rangeTo()
    println()
    consoleInput()


}