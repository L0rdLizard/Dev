package code.tamagochi

class Dog (tamagochiName : String) : Tamagochi(tamagochiName) {
    override
    fun deathOfTamagochi() {
        for (i in 1..20) println() // оступ для красоты
        println(
                    "     ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
                    "     ───█▒▒░░░░░░░░░▒▒█───\n" +
                    "     ────█░░X░░░░░X░░█────\n" +
                    "     ─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
                    "     █░░█─▀▄░░░░░░░▄▀─█░░█\n"
        )
        printInterface()
        println(
            """             
                |
                |
                |             GAME OVER
                |""".trimMargin()
        )
        alive = false
    }

    override
    fun happinessCheck() {
        if ((happiness >= 7) && (satiety >= 7) && (health >= 7))
            //༼☯﹏☯༽
            println(
                        "     ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
                        "     ───█▒▒░░░░░░░░░▒▒█───\n" +
                        "     ────█░░█░░░░░█░░█────\n" +
                        "     ─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
                        "     █░░█─▀▄░░░░░░░▄▀─█░░█\n"
            )
        else if ((happiness < 4) || (satiety < 4) || (health < 4))
//            println("             (ಥ﹏ಥ)") (┳Д┳)

            println(
                        "     ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
                        "     ───█▒▒░░░░░░░░░▒▒█───\n" +
                        "     ────█░░┳░░░░░┳░░█────\n" +
                        "     ─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
                        "     █░░█─▀▄░░░░░░░▄▀─█░░█\n"
            )
        else if ((happiness < 7) || (satiety < 7) || (health < 7))
            println(
                        "     ───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\n" +
                        "     ───█▒▒░░░░░░░░░▒▒█───\n" +
                        "     ────█░░︶░░░░░︶░░█────\n" +
                        "     ─▄▄──█░░░▀█▀░░░█──▄▄─\n" +
                        "     █░░█─▀▄░░░░░░░▄▀─█░░█\n"
            )
    }
}