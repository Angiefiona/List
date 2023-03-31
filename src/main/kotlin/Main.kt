fun main(){

    indices()
    println(avgheight(listOf(145.0,575.0,148.0)))
    personList()
    var cars = listOf(
        Car("ABCD123",1230.0),
        Car("SHKD76",269.0),
        Car("KJDKXK",261.9),
        Car("ASJXKDKSK",1892.70)



    )
    var avgmileage = calculate(cars)
    println("The average mileage is :$avgmileage")


}


//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
//fun fruits (Strings: List<String>):List<String>{
fun indices(){
    val fruits = listOf("Apple","Berry", "Tangerine", "kiwi", "pineapple", "watermelon", "orange","lemon", "mango", "dates",)
   val  evenList = fruits.filterIndexed { index, fruits -> index % 2 == 0 }
    println(evenList)
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun avgheight(height:List<Double>):Pair<Double,Double>{
    var m = height.sum()
    var n = height.average()
    return Pair(m,n)
}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class personObjects(var name:String, var age:Int,var height:Double, var weight:Int)
fun personList(){
var person2  = personObjects("Angela Mumo", 23, 1.9,50)
    var person3  = personObjects("Fiona Mumbi", 37, 1.5,48)
    var person4  = personObjects("Edgar Mutua", 25, 1.2,40)
    var Person = listOf(person2, person3, person4)
    var PersonList = Person.sortedByDescending { Person -> Person.age }
    println(PersonList)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)
fun calculate(cars:List<Car>):Double{
    var totalmileage = 0.0
    for(car in cars){
        totalmileage+=car.mileage
    }
    return totalmileage/cars.size
}