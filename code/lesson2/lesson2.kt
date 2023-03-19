package code.lesson2

fun main () {
    val name = "Maxim"
    val surname = "Barsukov"
    val thankMessage = """
        |Таким образом, начало повседневной работы по формированию 
        |позиции напрямую зависит от системы масштабного изменения ряда параметров? 
        |Задача организации, в особенности же рамки и место обучения кадров требует от нас системного анализа позиций, 
        |занимаемых участниками в отношении поставленных задач. Соображения высшего порядка, 
        |а также курс на социально-ориентированный национальный проект напрямую зависит от новых предложений.
        |
        |Задача организации, в особенности же 
        |постоянный количественный рост и сфера  
        |нашей активности играет важную роль 
        |в формировании всесторонне сбалансированных нововведений? 
        |Практический опыт показывает, что постоянное 
        |информационно-техническое обеспечение нашей деятельности 
        |способствует повышению актуальности форм воздействия. 
        |Дорогие друзья, дальнейшее развитие различных 
        |форм деятельности играет важную роль в 
        |формировании системы обучения кадров, соответствующей 
        |насущным потребностям. Не следует,""".trimMargin()

    var table = Array(3, {Array (3, {0})})
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(1, 2, 3)
    table[2] = arrayOf(1, 2, 3)
    for (row in table){
        for (cell in row){
            print("$cell ")
        }
        println()
    }

    for (row in 1..9) {
        for (column in 1..9){
            print("${row*column} \t")
        }
        println()
    }
//    val bukva : Char = 'b'
//    val stroka = "Hello world!"
//    for (item in stroka.indices){
//        println(stroka[item])
//    }
//    val backet = arrayOf("banana", 1, "orange", 1, "apple", 1, "mango", 1, "eggs", 6)
//    var answer = "${backet[8]} ${backet[9]}"
//    println(answer)
//    println(backet[backet.size-1])

//    println(backet[-1])
//    println(name + " " + surname)
//    println("Hello I m $name $surname")
//    var balance = 0.0
//    var percent = 0.05
//    println("current balance: $balance")
////    println("balance has inscreased: ${balance+20}й")
//    println("type cash")
//    var input = readln().toDouble()
//    balance += input - (input * percent)
//    var comission : Double = input * percent
//    println("current balance: $balance\nour comission is $comission")
//    println(thankMessage)
}