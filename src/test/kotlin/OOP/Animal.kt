package OOP

open class Animal(color:String, legs:Int) {
    init {
        println("Color is $color")
        println("Number of legs is $legs")
    }
}

class Dog() : Animal{
    fun woof(){
        println("The Dog Barks")
    }
}

class Cat() : Animal{
    fun meow(){
        println("Cat meows")
    }
}