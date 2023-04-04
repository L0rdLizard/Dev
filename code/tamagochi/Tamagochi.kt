package code.tamagochi

abstract class Tamagochi (tamagochiName : String){
    //9 - это максимум для всех показателей
    var name = tamagochiName
    var satiety = 9 //сытость
    var happiness = 9 //радость
    var health = 9 //здоровье
    var days = 1
    var alive = true

    init {
        while (true){
            if (!alive) break
            inteface()
            if (!alive) break
            println("""
                |Chose action:
                |1 - Feed
                |2 - Heal
                |3 - Play
                |4 - Do nothing
                |5 - Exit game
                |""".trimMargin())

            when (readln().toInt()) { //chose action
                1 -> { feed() }
                2 -> { heal() }
                3 -> { play() }
                4 -> {}
                5 -> {break}
            }
            satiety--
            days++
        }
    }

    open
    fun deathOfTamagochi(){
        for (i in 1..20) println() // оступ для красоты
        println("             (x . x)")
        printInterface()
        println("""             
                |
                |
                |             GAME OVER
                |""".trimMargin())
        alive = false
    }
    fun feed (){ //покормить
        if ((satiety + 2) > 10) {
            satiety += 2
            deathOfTamagochi()
        }
        satiety += 2
        health -=1
    }
    fun heal (){ //вылечить
        if ((health + 2) > 9) {
            health += 2
            deathOfTamagochi()
        }
        health += 2
        happiness -=1
    }
    fun play(){ //поиграть
        if ((happiness + 2) > 9) {
            happiness = 9
            satiety -=1
            return
        }
        happiness += 2
        satiety -=1
    }
    open
    fun happinessCheck (){ //проверка на счастье
        if ((happiness >= 7) && (satiety >= 7) && (health >= 7))
            println("             (◕‿◕)")
        else if ((happiness < 4) || (satiety < 4) || (health < 4))
            println("             (ಥ﹏ಥ)")
        else if ((happiness < 7) || (satiety < 7) || (health < 7))
            println("             (￣ヘ￣)")
    }
    fun satietyCheck() :Boolean{ //проверка на сытость

        if (satiety <= 0) {
            deathOfTamagochi()
            return true
        }
        return false
    }
    fun healthCheck () :Boolean{ //проверка на здорвье
        if (health <= 0) {
            deathOfTamagochi()
            return true
        }
        return false
    }
    fun printInterface(){ // вывести окно игры
        println("""
            |            $name             
            |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            |\  days: $days                    \
            |\  health: $health                  \
            |\  satiety: $satiety    happiness: $happiness \
            |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        """.trimMargin())
    }
    fun inteface(){ //интерфейс игры
        for (i in 1..20) println() // оступ для красоты
        if (satietyCheck()) return
        if (healthCheck()) return
        happinessCheck()

        printInterface()
    }
}
