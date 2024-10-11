package com.example.myapplication

//Lambda Function
//Lambda Function adalah fungsi yang tidak memiliki nama
//Lambda Function biasanya digunakan untuk membuat fungsi yang sederhana
//Lambda Functionmenggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi


fun uppercaseString(string: String): String {
    return string.uppercase()
}
//Dapat ditulis dalam ekspresi lambda sbb :
fun main(){
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
    //HELLO
}