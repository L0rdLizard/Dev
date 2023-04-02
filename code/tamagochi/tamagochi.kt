package code.tamagochi

class Tamagochi (tamagochiName : String){
    //9 - это максимум для всех показателей
    private var name = tamagochiName
    private var satiety = 9 //сытость
    private var happiness = 9 //радость
    private var health = 9 //здоровье
    private var days = 1
    private var death = false

    init {
        while (true){
            if (death) break
            inteface()
            if (death) break
            println("""
                |Chose action:
                |1 - Feed
                |2 - Heal
                |3 - Play
                |4 - Do nothing
                |5 - Exit game
                |""".trimMargin())

            when (readln().toInt()) { //chose action
                1 -> {
                    feed()
                    satiety--
                    days++
                }
                2 -> {
                    heal()
                    satiety--
                    days++
                }
                3 -> {
                    play()
                    satiety--
                    days++
                }
                4 -> {
                    satiety--
                    days++
                }
                5 -> {break}
            }
//            Thread.sleep(1_000)
        }

    }

    fun deathOfTamagochi(){
        for (i in 1..20) println() // оступ для красоты
        println("             (x . x)")
        printInterface()
        println("""             
                |
                |
                |             GAME OVER
                |""".trimMargin())
        death = true
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
    private fun happinessCheck (){ //проверка на счастье
        if ((happiness >= 7) && (satiety >= 7) && (health >= 7))
            println("             (◕‿◕)")
        else if ((happiness < 4) || (satiety < 4) || (health < 4))
            println("             (ಥ﹏ಥ)")
        else if ((happiness < 7) || (satiety < 7) || (health < 7))
            println("             (￣ヘ￣)")
    }
    private fun satietyCheck() :Boolean{ //проверка на сытость

        if (satiety <= 0) {
            deathOfTamagochi()
            return true
        }
        return false
    }
    private fun healthCheck () :Boolean{ //проверка на здорвье
        if (health <= 0) {
            deathOfTamagochi()
            return true
        }
        return false
    }
    private fun printInterface(){ // вывести окно игры
        println("""
            |            $name             
            |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
            |\  days: $days                    \
            |\  health: $health                  \
            |\  satiety: $satiety    happiness: $happiness \
            |\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        """.trimMargin())
    }
    private fun inteface(){ //интерфейс игры
        for (i in 1..20) println() // оступ для красоты
        if (satietyCheck()) return
        if (healthCheck()) return
        happinessCheck()

        printInterface()
    }
}
