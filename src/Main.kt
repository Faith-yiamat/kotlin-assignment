fun main (){

    printName("Yiamat")
    remainder(50,7)
    add(12 ,13 ,56 ,34 )
    interest("I like joking with people.")


}
fun  printName(name: String){

    println("Hello $name")
}
fun remainder(x: Int , y: Int){

    var remainder = x % y
    println(remainder)
}
fun add(a: Int, b: Int, c:Int, d: Int){

    var sum = a + b + c + d
    println(sum)
}
fun interest(text: String){

    var tell = text
    println(tell)
}
