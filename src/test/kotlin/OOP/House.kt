package OOP

class House(owner:String, locations:String, price:Int, doors:Int){
    init {
        println("Owner of the house is $owner")
        println("House is locate in $locations")
        println("Price is $price")
        println("It has $doors number of doors")
    }
}

fun main(args: Array<String>) {
    var owner_one =House("Mike", "Ngara", 25000, 3)
    var owner_two =House("Joe", "Kitengela", 35000, 5)
    var owner_three =House("Njoroge", "Rongai", 30000, 4)
}