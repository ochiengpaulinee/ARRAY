import java.util.*

fun main(){
var x = names("House","Building", "Design","Home")
    println(x)
    println(cities())
    numbers()
    var Y = namePerson("Victor","kamau","Otieno")
    println(Y)
}
fun names(name1:String,name2:String, name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city-> println(city.capitalize()) }
}
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    var index = numbers.indexOf(158)
    println(index)
    numbers.sort()
    println(numbers.contentToString())
}
fun namePerson(nam1:String,nam2:String,nam3:String) {
    println(arrayOf(nam1, nam2, nam3).contentToString())
}