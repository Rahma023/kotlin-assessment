fun main() {
    var name="Rahma"
    var age=55
    println("My name is $name and I am $age years old.")
var a=longNames(arrayOf("Rahma","Timothy","Dia","Thak","Yumna"))
    println(a)
    multiply()
    division()
    modulus()
    var human=Human("Darot",78,12)
    var food=eat(10)

}
fun introduction(name:String, age:Int){

}

fun longNames(names:Array<String>):Int{
    var counter=0
    for(name in names){
        if(name.length>4){
            counter+=1
        }
    }
    return counter

}
fun multiply(){
    var b=20
    var s=2
    var multiply=b*s
    println(multiply)
}
fun division(){
    var w=30
    var e=3
    var divide=w/e
    println(divide)
}
fun modulus(){
    var q=55
    var t=10
    var modulus=q%t
    println(modulus)
}
class Human(var name: String, var age:Int, var weight:Int)

fun eat(foodWeight:Int){
    println("I am eating $foodWeight kgs of food")
}