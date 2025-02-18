fun main() {
    //2
    greetUser("Fatma")
    greetUser(null)


    //3 Unleashing the Elvis Operator
    var address: String? = null
    val checkAddress = address ?: "Address not provided"
    println(checkAddress)


    //4 The Power of Assertions
    println(calculateArea(10, 20))
    //println(calculateArea(0, 10))  -------> error


    //5 Nullable Types vs. Non-Nullable Types
    val age: Int = 23
    //age = null -------> error
    println(age)

    //Non-Nullable Types
    val name: String = "Fatma"
    // name = null -------> error

    // Nullable Types
    var age2: Int? = null
    age2 = 23

    //Bonus 1
    var name2 : String? = "FATMA"
    name2?.let{ println("not null :$it") }
    name2 = null
    name2?.let { println("not null :$it") } ?: println("null")

    //Bonus 2
    var name3 : String? = "Fatma"
    println(name!!.length)
    name3= null
    println(name!!.length)

    //Bonus 3
    var name4: String? = "fatma"
    println(greet(name4))
    name4 = null
    println(greet(name4))

}




//2 Facing the Null Menace
fun greetUser(name: String?) {
    // println(" length: ${name.length}") -------> error
    println("length: ${name?.length}")
    val greeting = if (name != null) "Hello, $name!"  else "Hello ???"
    println(greeting)
}

//4 The Power of Assertions
fun calculateArea(width: Int, height: Int): Int {

    require(width > 0) {  "must be greater than zero" }
    require(height > 0) { "must be greater than zero" }

    return width * height
}

//Bonus 3
fun greet(name: String?): String {
    return "Hello, ${name ?: "???"}"
}



