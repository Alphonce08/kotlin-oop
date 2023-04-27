package OOP


class Vehicles(owner:String, name:String, color:String, plate:String){
    init {
        println("Owner of the vehicles is $owner")
        println("The Name of the vehicles is $name")
        println("The color of is $color")
        println("Number plate is $plate")
    }
}

fun main(args: Array<String>) {
    var owner_1 = Vehicles("Alkid", "Land cruiser", "Black", "KBZ325Q")
    var owner_2 = Vehicles("Kamau", "Filter", "White", "KCG324P")
    var owner_3 = Vehicles("Kimani", "Wish", "Blue", "KAD646H")
    var owner_4 = Vehicles("Longhorn", "Vitz", "Red", "KCR789A")
}