//fun helloWorld() {
//    println("Hello Guys")
//    println("Infinite Learning Mantap")
//}
//
//fun main() {
//    helloWorld()
//} no 14

// funtion parameter
//fun sayHi(firstName: String, lastName: String) {
//    println("Hello $firstName $lastName")
//}
//
//fun main() {
//    sayHi("Puspi", "Dinata")
//} no 15

// funtion default paramenter
//fun hello(firstName: String, lastName: String = "") {
//    println("Hello $firstName $lastName")
//}
//
//fun main() {
//    hello("Puspi")
//    hello("Puspi", "Dinata")
//} no 16

// funtion named argument
fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hi my name is $firstName $middleName $lastName")
}

fun main() {
    fullName(
        firstName = "Puspita",
        middleName ="Ayu",
        lastName = "Dinata"
    )
}


