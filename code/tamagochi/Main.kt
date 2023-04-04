package code.tamagochi

fun main(){
    println("Choose you tamagochi")
    println("""
        |1 - cat
        |2 - dog
        |3 - monkey
    """.trimMargin())
    val animal = readln().toInt()
    println("Type name for your tamagochi")
    val name = readln()

    when (animal) {
        1 -> { val pet = Cat(name) }
        2 -> { val pet = Dog(name) }
        3 -> { val pet = Monkey(name) }
    }
}